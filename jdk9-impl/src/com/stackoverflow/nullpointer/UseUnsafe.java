package com.stackoverflow.nullpointer;

import sun.misc.Unsafe;

public class UseUnsafe {

    public String impl() {
        Unsafe unsafe;
        return "jdk.unsupported -> sun.misc";
    }
}
