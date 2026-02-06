package org.edu.ntnu.idatt2003.emil;

public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  @Override
  public String execute(String text) {
    return opening.concat(text.trim()).concat(end);
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }
}
