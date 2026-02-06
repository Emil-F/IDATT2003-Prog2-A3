package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  TextCommand capitalizeTextCommand;

  @BeforeEach
  void setUp() {
    capitalizeTextCommand = new CapitalizeTextCommand();
  }

  @Test
  void execute_capitalizesFirstLetterInText() {
    assertEquals("Text to be capitalized", capitalizeTextCommand.execute("text to be capitalized"));
  }
}