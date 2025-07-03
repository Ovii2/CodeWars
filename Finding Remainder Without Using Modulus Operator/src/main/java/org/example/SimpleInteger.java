package org.example;

import java.math.BigInteger;

public final class SimpleInteger {

    private final BigInteger value;

    public SimpleInteger(BigInteger val) {
        this.value = val;
    }

    public SimpleInteger add(SimpleInteger val) {
        return new SimpleInteger(this.value.add(val.value));
    }

    public SimpleInteger subtract(SimpleInteger val) {
        return new SimpleInteger(this.value.subtract(val.value));
    }

    public SimpleInteger multiply(SimpleInteger val) {
        return new SimpleInteger(this.value.multiply(val.value));
    }

    public SimpleInteger divide(SimpleInteger val) {
        return new SimpleInteger(this.value.divide(val.value));
    }

    public int compareTo(SimpleInteger val) {
        return this.value.compareTo(val.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}