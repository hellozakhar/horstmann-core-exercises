package com.hellozakhar.chapter3_Interfaces_and_Lambda_Expressions;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }
    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < values.length;
            }

            @Override
            public int next() {
                return values[index++];
            }
        };
    }

    static IntSequence constant(int value) {
        return () -> value;
    }
}