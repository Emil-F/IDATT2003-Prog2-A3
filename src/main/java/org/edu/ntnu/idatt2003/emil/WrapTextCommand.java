package org.edu.ntnu.idatt2003.emil;

import java.util.Objects;

public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    Objects.requireNonNull(opening, "opening is null");
    Objects.requireNonNull(end, "end is null");
    this.opening = opening;
    this.end = end;
  }

  @Override
  public String execute(String text) {
    System.out.println("Executing WrapTextCommand with: " + text);
    return opening.concat(text.trim()).concat(end);
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }
}
