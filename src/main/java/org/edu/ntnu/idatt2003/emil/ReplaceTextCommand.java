package org.edu.ntnu.idatt2003.emil;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  public void ReplaceTextCommand(String target, String replacement) {
    
  }

  public String execute(String text) {
    return null;
  }

  public String getTarget() {
    return this.target;
  }

  public String getReplacement() {
    return this.replacement;
  }
}
