package com.company.udt;

@FunctionalInterface
public interface TeacherToMetodist <T, N > {
    N convert(T t);

    static <T> boolean nullPtrCheck(T t) {
        return t != null;
    }


}
