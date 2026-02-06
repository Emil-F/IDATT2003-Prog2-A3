package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {

  TextCommand wrapTextCommand;

  @BeforeEach
  void setUp() {
    wrapTextCommand = new WrapTextCommand("<p>", "</p>");
  }

  @Test
  void execute_wrapsText() {
    assertEquals("<p>text to be wrapped</p>", wrapTextCommand.execute("text to be wrapped"));
  }
}