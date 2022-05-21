package com.company.util.converters;

import com.company.model.Metodist;
import com.company.model.Teacher;

public class ConvertTeacher implements PersonConverter<Teacher, Metodist> {

    @Override
    public Metodist convert(Teacher teacher) {
        PersonConverter<Teacher, Metodist> conv;
        conv = (x) -> new Metodist(x.getName(), x.getLastname(), x.getAge(), x.getAddr());
        return conv.convert(teacher);
    }
}
