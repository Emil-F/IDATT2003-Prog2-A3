package org.edu.ntnu.idatt2003.emil;

import java.util.List;

public class Script {
  private List<TextCommand> textCommands;

  public Script (List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  public String execute(String text) {
    for (TextCommand textCommand : this.textCommands) {
      text = textCommand.execute(text);
      System.out.println(text);
    }
    return text;
  }
}
