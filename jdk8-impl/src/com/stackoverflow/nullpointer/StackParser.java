package com.stackoverflow.nullpointer;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StackParser implements StackInfo {

    @Override
    public String getStackCount() {
        return "Java 8: " + Thread.currentThread()
                .getStackTrace().length;
    }

    @Override
    public String getStack() {
        return Arrays.stream(Thread.currentThread()
                .getStackTrace())
                .map(StackTraceElement::toString)
                .collect(Collectors.joining("\n"));
    }
}