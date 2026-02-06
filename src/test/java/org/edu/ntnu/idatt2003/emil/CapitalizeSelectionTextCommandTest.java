package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  CapitalizeTextCommand capitalizeSelectionTextCommand;

  @BeforeEach
  void setUp() {
    capitalizeSelectionTextCommand = new CapitalizeSelectionTextCommand("selection");
  }

  @Test
  void execute_capitalizesFirstLetterOfSelection() {
    assertEquals("text with Selection and another Selection",
        capitalizeSelectionTextCommand.execute("text with selection and another selection"));
  }
}