package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  WrapTextCommand wrapLinesTextCommand;

  @BeforeEach
  void setUp() {
    wrapLinesTextCommand = new WrapLinesTextCommand("<p>", "</p>");
  }

  @Test
  void execute_wrapsLines() {
    assertEquals("<p>first line\\nsecond line</p>", wrapLinesTextCommand.execute("first line\\nsecond line"));
  }
}