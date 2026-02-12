package org.edu.ntnu.idatt2003.emil;

import java.util.Objects;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    Objects.requireNonNull(target, "target is null");
    Objects.requireNonNull(replacement, "replacement is null");
    this.target = target;
    this.replacement = replacement;
  }

  public String execute(String text) {
    System.out.println("Executing ReplaceTextCommand with: " + text);
    return text.replaceAll(target, replacement);
  }

  public String getTarget() {
    return this.target;
  }

  public String getReplacement() {
    return this.replacement;
  }
}
