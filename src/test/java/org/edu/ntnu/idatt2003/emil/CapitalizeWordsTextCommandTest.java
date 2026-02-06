package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  CapitalizeWordsTextCommand capitalizeWordsTextCommand;

  @BeforeEach
  void setUp() {
    capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
  }

  @Test
  void execute_capitalizesEachWordInText() {
    assertEquals("Text To Be Capitalized", capitalizeWordsTextCommand.execute("text to be capitalized"));
  }
}