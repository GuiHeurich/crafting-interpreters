package com.crafting_interpreters.java.lox;

class Token {
  // The final keyword is used in several contexts to define an entity that can only be assigned once.
  // A final variable can only be initialized once, either via an initializer or an assignment statement.
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line;

  Token(TokenType type, String lexeme, Object literal, int line) {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = literal;
    this.line = line;
  }

  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}
