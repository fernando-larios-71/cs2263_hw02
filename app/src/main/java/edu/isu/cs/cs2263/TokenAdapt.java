package edu.isu.cs.cs2263;

import java.util.StringTokenizer;

public class TokenAdapt implements PushbackTokenizer{

    @Override
    public String nextToken() {
        return null;
    }

    @Override
    public boolean hasMoreTokens() {
        return false;
    }

    @Override
    public void pushback() {

    }
}
