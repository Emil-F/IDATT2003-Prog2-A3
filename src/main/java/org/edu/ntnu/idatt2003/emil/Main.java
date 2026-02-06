package org.edu.ntnu.idatt2003.emil;

public class Main {
  public static void main(String[] args) {
    String text = "text with target and target";
    TextCommand replaceText = new ReplaceTextCommand("target", "replacement");
    ReplaceTextCommand replaceFirstText = new ReplaceFirstTextCommand("target", "replacement");

    System.out.println(replaceText.execute(text));
    System.out.println(replaceFirstText.execute(text));

    String textWrap = "text to be wrapped";
    TextCommand wrapText = new WrapTextCommand("<p>", "</p>");
    String textWrapLines = "first line\nsecond line\nthird line";
    WrapTextCommand wrapLinesText = new WrapLinesTextCommand("<p>", "</p>");
    String textWrapSelection = "text with selection";
    WrapTextCommand wrapSelectionText = new WrapSelectionTextCommand("<p>", "</p>", "selection");

    System.out.println(wrapText.execute(textWrap));
    System.out.println(wrapLinesText.execute(textWrapLines));
    System.out.println(wrapSelectionText.execute(textWrapSelection));
  }
}
