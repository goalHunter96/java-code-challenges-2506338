package com.linkedinlearning.challenges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class FileLineAppender {
/*
 * Implementiere eine Klasse FileLineAppender, die Textzeilen in eine Datei schreiben kann
 * Der Konstruktor der Klasse enthält eine Zieldatei.
 * Die Klasse enthählt eine Methode appendLine(String line), die eine Textzeile am der Datei hinzufügt
 * Entscheide, wie mit Exceptions umzugehen ist
 * 
*/
private final Path targetFile;

/*
 * Implementiere eine Klasse FileLineAppender, die Textzeilen in eine Datei
 * schreiben kann
 * Der Konstruktor der Klasse enthält eine Zieldatei.
 * Die Klasse enthählt eine Methode appendLine(String line), die eine Textzeile
 * am der Datei hinzufügt
 * Entscheide, wie mit Exceptions umzugehen ist
 *
 */
public FileLineAppender(String target) {
  this.targetFile = Path.of(target);
}

public void appendLine(String line) {
  line = line + System.lineSeparator();

  try {
    Files.write(targetFile, line.getBytes(), StandardOpenOption.APPEND);
  } catch (NoSuchFileException e) {
    try {
      Files.createFile(targetFile);
      Files.write(targetFile, line.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  } catch (IOException e) {
    System.err.println("Error writing to file " + e);
  }

}

public static void main(String[] args) {
  FileLineAppender appender = new FileLineAppender("my_test_file.txt");
  appender.appendLine("First line");
  appender.appendLine("Second line");
}

}
