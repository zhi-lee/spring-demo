package com.example.common.base;

import java.util.function.Function;

public abstract class Converter<A, B> implements Function<A, B> {
    abstract B doForward(A a);

    abstract A doBackward(B b);
}
