package org.edu.ntnu.idatt2003.emil;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  public String execute(String text) {
    System.out.println("Executing CapitalizeWordsTextCommand with: " + text);

    String[] words = text.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
    }
    return String.join(" ", words);
  }
}
