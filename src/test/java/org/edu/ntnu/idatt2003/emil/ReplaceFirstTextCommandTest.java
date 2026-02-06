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
  void execute_onlyReplacesTheFirstTarget() {
    assertEquals("text with replacement and target", replaceFirstTextCommand.execute("text with target and target"));
  }
}