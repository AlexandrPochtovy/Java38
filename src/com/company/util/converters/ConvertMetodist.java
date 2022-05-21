package com.company.util.converters;

import com.company.model.Metodist;
import com.company.model.Teacher;

public class ConvertMetodist implements PersonConverter<Metodist, Teacher> {

    @Override
    public Teacher convert(Metodist metodist) {
        PersonConverter<Metodist, Teacher> conv;
        conv = (x) -> new Teacher(x.getName(), x.getLastname(), x.getAge(), x.getAddr());
        return conv.convert(metodist);
    }
}
