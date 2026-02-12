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
  void constructor_throwsWhenOpeningIsNull() {
    assertThrows(NullPointerException.class, () -> new WrapSelectionTextCommand(null, "</p>", "selection"));
  }

  @Test
  void constructor_throwsWhenEndIsNull() {
    assertThrows(NullPointerException.class, () -> new WrapSelectionTextCommand("<p>", null, "selection"));
  }

  @Test
  void constructor_throwsWhenSelectionIsNull() {
    assertThrows(NullPointerException.class, () -> new WrapSelectionTextCommand("<p>", "</p>", null));
  }

  @Test
  void execute_wrapsSelection() {
    assertEquals("text with <p>selection</p>", wrapSelectionTextCommand.execute("text with selection"));
  }
}