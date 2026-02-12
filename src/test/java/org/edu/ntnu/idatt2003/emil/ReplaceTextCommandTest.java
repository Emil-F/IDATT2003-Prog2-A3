package org.edu.ntnu.idatt2003.emil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {

  TextCommand replaceText;

  @BeforeEach
  void setUp() {
    replaceText = new ReplaceTextCommand("target", "replacement");
  }

  @Test
  void constructor_throwsWhenTargetIsNull() {
    assertThrows(NullPointerException.class, () -> new ReplaceTextCommand(null, "replacement"));
  }

  @Test
  void constructor_throwsWhenReplacementIsNull() {
    assertThrows(NullPointerException.class, () -> new ReplaceTextCommand("target", null));
  }

  @Test
  void execute_replacesOneTargetInstance() {
    assertEquals("text with replacement and text", replaceText.execute("text with target and text"));
  }

  @Test
  void execute_replacesAllTargetInstances() {
    assertEquals("text with replacement and replacement", replaceText.execute("text with target and target"));
  }

  @Test
  void execute_doesNotReplaceWhenTargetNotPresent() {
    assertEquals("text with nothing", replaceText.execute("text with nothing"));
  }

}