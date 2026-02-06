package org.edu.ntnu.idatt2003.emil;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    TextCommand replaceText = new ReplaceTextCommand("target", "replacement");
    ReplaceTextCommand replaceFirstText = new ReplaceFirstTextCommand("target", "replacement");

    System.out.println(replaceText.execute("text with target and target"));
    System.out.println(replaceFirstText.execute("text with target and target"));

    TextCommand wrapText = new WrapTextCommand("<p>", "</p>");
    WrapTextCommand wrapLinesText = new WrapLinesTextCommand("<p>", "</p>");
    WrapTextCommand wrapSelectionText = new WrapSelectionTextCommand("<p>", "</p>", "selection");

    System.out.println(wrapText.execute("text to be wrapped"));
    System.out.println(wrapLinesText.execute("first line\nsecond line\nthird line"));
    System.out.println(wrapSelectionText.execute("text with selection"));

    TextCommand capitalizeText = new CapitalizeTextCommand();
    CapitalizeTextCommand capitalizeWords = new CapitalizeWordsTextCommand();
    CapitalizeTextCommand capitalizeSelection = new CapitalizeSelectionTextCommand("selection");

    System.out.println(capitalizeText.execute("text to be capitalized"));
    System.out.println(capitalizeWords.execute("text to be capitalized"));
    System.out.println(capitalizeSelection.execute("text with selection and another selection"));

    List<TextCommand> commands = new ArrayList<>();
    TextCommand capitalizeTextCommand = new CapitalizeTextCommand();
    TextCommand replaceTextCommand = new ReplaceTextCommand("Hei", "Hallo");
    TextCommand wrapTextCommand = new WrapTextCommand("<p>", "</p>");
    commands.add(capitalizeTextCommand);
    commands.add(replaceTextCommand);
    commands.add(wrapTextCommand);
    Script script = new Script(commands);
    script.execute("hei");
  }
}
