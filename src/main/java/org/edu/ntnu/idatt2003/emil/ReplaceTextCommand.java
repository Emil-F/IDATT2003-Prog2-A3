package org.edu.ntnu.idatt2003.emil;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  public String execute(String text) {
    String regex = "\\b" + this.target + "\\b";
    return text.replaceAll(regex, replacement);
  }

  public String getTarget() {
    return this.target;
  }

  public String getReplacement() {
    return this.replacement;
  }
}
