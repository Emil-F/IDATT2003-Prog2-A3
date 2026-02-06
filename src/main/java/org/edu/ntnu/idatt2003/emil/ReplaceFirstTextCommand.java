package org.edu.ntnu.idatt2003.emil;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    String regex = "\\b" + this.target + "\\b";
    return text.replaceFirst(regex, replacement);
  }
}
