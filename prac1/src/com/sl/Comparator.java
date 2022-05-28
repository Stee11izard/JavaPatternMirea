package com.sl;

@FunctionalInterface
public interface Comparator <T>
{
    int compareTo(T o);
}