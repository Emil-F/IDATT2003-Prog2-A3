package org.edu.ntnu.idatt2003.emil;

public class CapitalizeTextCommand implements TextCommand {
  @Override
  public String execute(String text) {
    System.out.println("Executing CapitalizeTextCommand with: " + text);

    return text.substring(0,1).toUpperCase() + text.substring(1);
  }
}
