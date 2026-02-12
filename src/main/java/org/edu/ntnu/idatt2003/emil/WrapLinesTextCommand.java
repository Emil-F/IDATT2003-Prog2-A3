package org.edu.ntnu.idatt2003.emil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    System.out.println("Executing WrapLinesTextCommand with: " + text);
    StringBuilder wrappedLines = new StringBuilder();
    List<String> lines = text.lines().collect(Collectors.toCollection(ArrayList::new));
    for (int i = 0; i < lines.size(); i++) {
      if (i == lines.size() - 1) {
        wrappedLines.append(opening.concat(lines.get(i)).concat(end));
      } else {
        wrappedLines.append(opening.concat(lines.get(i)).concat(end).concat("\\n"));
      }
    }
    return wrappedLines.toString();
  }
}
