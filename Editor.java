package Editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import MyImplementations.MyArrayList;
import MyImplementations.MyStack;
import MyImplementations.MyString;

public class Editor {
  /** cursor row position */
  int row;
  /** cursor column position */
  int col;
  /** the text of the editor */
  // Current file name
  MyString fileName;
  MyArrayList<MyString> text;

  /**
   * Constructor
   */
  public Editor(String myFilename) {
    this(new MyString(myFilename));
  }

  public Editor(MyString fileName) {
    this.fileName = fileName;
    open(fileName);
  }

  /**
   * Open the file with the given name and read the contents into the editor.
   */
  void open(String fileName) {
    open(new MyString(fileName));
  }

  void open(MyString fileName) {
    // read the file into the text
    // set the cursor to the beginning of the file
    // set the file name
// WRITE YOUR CODE HERE
  }
  /**
   * Save the current text to currently open file.
   */
  void save() {
    saveAs(fileName);
  }

  /**
   * Save the current text to the given file.
   */
  void saveAs(String fileName) {
    saveAs(new MyString(fileName));
  }

  void saveAs(MyString fileName) {
// WRITE YOUR CODE HERE
  }

  
  /**
   * Insert the given string at the current cursor position.
   * The cursor position is updated to point to the end of the inserted string.
   */
  void insert(String s) {
    insert(new MyString(s));
  }

  void insert(MyString s) {
// WRITE YOUR CODE HERE
  }

  /**
   * Delete n characters at the current cursor position.
   * The cursor position is updated to point to the end of the deleted string.
   */
  void delete(int n) {
// WRITE YOUR CODE HERE
  }

  /**
   * Replace the character at the current cursor position with the given
   * character.
   * The cursor position is updated to point to the end of the deleted string.
   */
  void replace(int n, String s) {
    replace(n, new MyString(s));
  }

  void replace(int n, MyString s) {
// WRITE YOUR CODE HERE
  }

  /**
   * Find the first instance of given string in the editor and set the cursor to
   * that position.
   */
  int[] find(String s) {
    return find(new MyString(s));
  }

  int[] find(MyString s) {
// WRITE YOUR CODE HERE
    return null;
  }
  
  /**
   * Move the cursor to the given position.
   */
  void moveCursor(int row, int col) {
// WRITE YOUR CODE HERE
  }

  /**
   * Return the current cursor position.
   */
  int[] getCursor() {
    return new int[] {row, col};
  }

  /**
   * Move the cursor to the given position.
   */
  void moveCursor(int[] rowcol) {
    moveCursor(rowcol[0], rowcol[1]);
  }

  /** return the entire line in row */
  MyString getText(int row) {
    return getText(row, 0);
  }

  /** return the line in row from col to the end */
  MyString getText(int row, int col) {
    return getText(row, col, text.get(row).length());
  }

  /** return the line from col1 to n character length */
  MyString getText(int row, int col, int n) {
// WRITE YOUR CODE HERE
  }
}