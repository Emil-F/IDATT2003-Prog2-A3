package org.edu.ntnu.idatt2003.emil;

import java.util.Arrays;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
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
}
