package edu.isu.cs.cs2263;

interface PushbackTokenizer {
    //return next token
    String nextToken();
    //Returns true if and only if there are more tokens
    boolean hasMoreTokens();
    //The token read is pushed back, so it can be read again using nextToken
    void pushback();
}
