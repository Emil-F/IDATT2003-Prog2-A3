package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

  ReplaceTextCommand replaceFirstTextCommand;

  @BeforeEach
  void setUp() {
    replaceFirstTextCommand = new ReplaceFirstTextCommand("target", "replacement");
  }

  @Test
  void constructor_throwsWhenTargetIsNull() {
    assertThrows(NullPointerException.class, () -> new ReplaceFirstTextCommand(null, "replacement"));
  }

  @Test
  void constructor_throwsWhenReplacementIsNull() {
    assertThrows(NullPointerException.class, () -> new ReplaceFirstTextCommand("target", null));
  }

  @Test
  void execute_onlyReplacesTheFirstTarget() {
    assertEquals("text with replacement and target", replaceFirstTextCommand.execute("text with target and target"));
  }
}