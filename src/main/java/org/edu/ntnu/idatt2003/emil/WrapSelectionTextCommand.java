package org.edu.ntnu.idatt2003.emil;

import java.util.Objects;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    Objects.requireNonNull(selection, "selection is null");
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    System.out.println("Executing WrapSelectionTextCommand with: " + text);

    return text.replace(this.selection, opening.concat(selection).concat(end));
  }

  public String getSelection() {
    return selection;
  }
}
