package com.javo;

public enum TokenType {
    End_of_input, Multiply,  Divide, Mod, Plus, Minus, Not, Less, LessEqual, Greater, GreaterEqual,
    Equal, NotEqual, Assign, And, Or, Keyword_if,
    Keyword_else, Keyword_while, Keyword_print, Keyword_read, Keyword_integer, Keyword_string, Keyword_hex, Keyword_return, Keyword_binary, LeftParentheses, RightParentheses,
    Begin, End, Semicolon, Comma, Identifier, Integer, String, Binary, Hexadecimal, FloatPointNumber, Error
}
