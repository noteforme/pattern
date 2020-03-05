package com.jon.pattern.aosp.singleton;

public class TestIActivityManager {
    public static void main(String[] args) {
        System.out.println(ActivityManagerNative.getDefault());
    }
}
