package org.edu.ntnu.idatt2003.emil;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    System.out.println(text.indexOf(selection));
    System.out.println(text.substring(text.indexOf(selection), text.indexOf(selection) + selection.length()));
    String[] lines = text.split("\\\\n");
    String wrappedLines = "";
    for(int i = 0; i < lines.length; i++) {
      if (i == lines.length-1) {
        wrappedLines += opening.concat(lines[i]).concat(end);
        continue;
      }
      wrappedLines += opening.concat(lines[i]).concat(end).concat("\\n");
    }
    return wrappedLines;
  }

  public String getSelection() {
    return selection;
  }
}
