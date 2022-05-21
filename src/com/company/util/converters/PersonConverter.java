package com.company.util.converters;


@FunctionalInterface
public interface PersonConverter<T, N > {
    N convert(T t);

    static <T> boolean nullPtrCheck(T t) {
        return t != null;
    }

}
