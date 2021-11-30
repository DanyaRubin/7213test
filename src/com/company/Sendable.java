package com.company;

public interface Sendable<T>{
    public String getTo();
    public T getContent();
}
