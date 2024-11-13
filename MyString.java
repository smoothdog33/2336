package MyImplementations;

// Implementing the String class
public class MyString {
  private char[] chars;

  // Constructor from a char array
  public MyString(char[] chars) {
    this.chars = new char[chars.length];
    for (int i = 0; i < chars.length; i++) {
      this.chars[i] = chars[i];
    }
  }

  // constructor from a String
  public MyString(String s) {
    this(s.toCharArray());
  }

  // constructor from a MyString
  public MyString(MyString s) {
    this(s.toCharArray());
  }

  // toCharArray
  public char[] toCharArray() {
    char[] result = new char[chars.length];
    for (int i = 0; i < chars.length; i++) {
      result[i] = chars[i];
    }
    return result;
  }

  // toString
  public String toString() {
    return new String(chars);
  }

  // Returns the length of the string
  public int length() {
// WRITE YOUR CODE HERE
  }

  // Returns the character at the specified index
  public char charAt(int index) {
// WRITE YOUR CODE HERE
  }

  // Returns a new MyString that is a substring of this MyString
  public MyString substring(int begin, int end) {
// WRITE YOUR CODE HERE
  }

  // Returns the MyString that is the concatenation of this MyString and the
  // specified MyString
  public MyString concat(MyString s) {
// WRITE YOUR CODE HERE
  }

  // Returns the MyString that is the concatenation of this MyString and the String
  public MyString concat(String s) {
// WRITE YOUR CODE HERE
  }

  // indexOf
  public int indexOf(MyString s) {
// WRITE YOUR CODE HERE
  }

  // indexOf
  public int indexOf(MyString s, int fromIndex) {
// WRITE YOUR CODE HERE
  }

  // replace oldString with newString
  public MyString replace(MyString oldString, MyString newString) {
// WRITE YOUR CODE HERE
  }

  public MyString replace(String oldString, String newString) {
// WRITE YOUR CODE HERE
  }

  public MyString replace(char oldChar, char newChar) {
// WRITE YOUR CODE HERE
  }

  // count
  public int count(MyString s) {
// WRITE YOUR CODE HERE
  }

  // count
  public int count(String s) {
// WRITE YOUR CODE HERE
  }

  // count
  public int count(char c) {
// WRITE YOUR CODE HERE
  }

  // split
  public MyString[] split(MyString regex) {
// WRITE YOUR CODE HERE
  }

  // split with String
  public MyString[] split(String regex) {
    return split(new MyString(regex));
  }

  // trim
  public MyString trim() {
// WRITE YOUR CODE HERE
  }

  // toLowerCase
  public MyString toLowerCase() {
// WRITE YOUR CODE HERE
  }

  // toUpperCase
  public MyString toUpperCase() {
// WRITE YOUR CODE HERE
  }

  // equalsIgnoreCase
  public boolean equalsIgnoreCase(MyString s) {
// WRITE YOUR CODE HERE
  }

  // compareTo
  public int compareTo(MyString s) {
// WRITE YOUR CODE HERE
  }

  // compareToIgnoreCase
  public int compareToIgnoreCase(MyString s) {
// WRITE YOUR CODE HERE
  }

  // startsWith
  public boolean startsWith(MyString s) {
// WRITE YOUR CODE HERE
  }

  // endsWith
  public boolean endsWith(MyString s) {
// WRITE YOUR CODE HERE
  }

  // contains
  public boolean contains(MyString s) {
// WRITE YOUR CODE HERE
  }

  // valueOf
  public static MyString valueOf(Number i) {
// WRITE YOUR CODE HERE
  }

  // equals
  public boolean equals(Object o) {
// WRITE YOUR CODE HERE
  }

  // equals for String
  public boolean equals(String s) {
// WRITE YOUR CODE HERE
  }

  // equals MyString
  public boolean equals(MyString s) {
// WRITE YOUR CODE HERE
  }

  // hashCode
  public int hashCode() {
    int h = 0;
    for (int i = 0; i < length(); i++) {
      h = 31 * h + charAt(i);
    }
    return h;
  }

  //  All wrapper code below this line
  //#region
  // startsWith String
  public boolean startsWith(String s) {
// WRITE YOUR CODE HERE
  }

  // endsWith String
  public boolean endsWith(String s) {
// WRITE YOUR CODE HERE
  }

  // contains String
  public boolean contains(String s) {
// WRITE YOUR CODE HERE
  }

  // indexOf String
  public int indexOf(String s) {
// WRITE YOUR CODE HERE
  }

  // indexOf String from index
  public int indexOf(String s, int fromIndex) {
// WRITE YOUR CODE HERE
  }
  //#endregion

  // indexOf char
  public int indexOf(char ch) {
// WRITE YOUR CODE HERE
  }

  // indexOf char from index
  public int indexOf(char ch, int fromIndex) {
// WRITE YOUR CODE HERE
  }

}