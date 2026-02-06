package org.edu.ntnu.idatt2003.emil;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  public String execute(String text) {
    return text.replaceAll(selection, selection.substring(0, 1).toUpperCase() + selection.substring(1));
  }

  public String getSelection() {
    return selection;
  }
}
