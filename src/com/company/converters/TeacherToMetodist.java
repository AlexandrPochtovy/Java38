package com.company.converters;

import com.company.peoples.Metodist;
import com.company.peoples.Teacher;
import com.company.userdatatype.Person;

@FunctionalInterface
public interface TeacherToMetodist <T, N > {
    N convert(T t);

    static <T> boolean nullPtrCheck(T t) {
        return t != null;
    }
}
