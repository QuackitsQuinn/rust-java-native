package org.example;

public class NativeMath {

    static {
        System.loadLibrary("rustmath");
    }
    public static native int FastAdd(int numb,int num);
}
