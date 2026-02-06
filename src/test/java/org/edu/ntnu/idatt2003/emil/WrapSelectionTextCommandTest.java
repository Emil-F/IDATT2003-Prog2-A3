package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  WrapTextCommand wrapSelectionTextCommand;

  @BeforeEach
  void setUp() {
    wrapSelectionTextCommand = new WrapSelectionTextCommand("<p>", "</p>", "selection");
  }

  @Test
  void execute_wrapsSelection() {
    assertEquals("text with <p>selection</p>", wrapSelectionTextCommand.execute("text with selection"));
  }
}