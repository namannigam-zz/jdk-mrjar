package com.stackoverflow.nullpointer;

public class Main {
    public static void main(String[] args) {
        final StackInfo stackParser = new StackParser();
        System.out.println(stackParser.getStackCount());
        System.out.println(stackParser.getStack());
        UseUnsafe useUnsafe = new UseUnsafe();
        System.out.println(useUnsafe.impl());
    }
}