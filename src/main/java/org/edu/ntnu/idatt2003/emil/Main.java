package org.edu.ntnu.idatt2003.emil;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    TextCommand replaceText = new ReplaceTextCommand("target", "replacement");
    ReplaceTextCommand replaceFirstText = new ReplaceFirstTextCommand("target", "replacement");

    System.out.println("Result: " + replaceText.execute("text with target and target") + "\n");
    System.out.println("Result: " + replaceFirstText.execute("text with target and target") + "\n");

    try {
      TextCommand wrapText = new WrapTextCommand("<p>", "</p>");
      WrapTextCommand wrapLinesText = new WrapLinesTextCommand("<p>", "</p>");
      WrapTextCommand wrapSelectionText = new WrapSelectionTextCommand("<p>", "</p>", "selection");
      System.out.println("Result: " + wrapText.execute("text to be wrapped") + "\n");
      System.out.println("Result: " + wrapLinesText.execute("first line\nsecond line\nthird line") + "\n");
      System.out.println("Result: " + wrapSelectionText.execute("text with selection") + "\n");
    } catch (NullPointerException e) {
      System.err.println(e.getMessage());
    }


    TextCommand capitalizeText = new CapitalizeTextCommand();
    CapitalizeTextCommand capitalizeWords = new CapitalizeWordsTextCommand();
    CapitalizeTextCommand capitalizeSelection = new CapitalizeSelectionTextCommand("selection");

    System.out.println("Result: " + capitalizeText.execute("text to be capitalized") + "\n");
    System.out.println("Result: " + capitalizeWords.execute("text to be capitalized") + "\n");
    System.out.println("Result: " + capitalizeSelection.execute("text with selection and another selection") + "\n");

    List<TextCommand> commands = new ArrayList<>();
    try {
      TextCommand capitalizeTextCommand = new CapitalizeTextCommand();
      TextCommand replaceTextCommand = new ReplaceTextCommand("Hei", "Hallo");
      TextCommand wrapTextCommand = new WrapTextCommand("<p>", "</p>");
      commands.add(capitalizeTextCommand);
      commands.add(replaceTextCommand);
      commands.add(wrapTextCommand);
    } catch (NullPointerException e) {
      System.err.println(e.getMessage());
    }
    Script script = new Script(commands);
    script.execute("hei");
  }
}
