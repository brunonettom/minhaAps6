package br.edu.insper.desagil.aps6.converter;

import br.pro.hashi.sdx.dao.DaoConverter;
import br.pro.hashi.sdx.rest.jackson.JacksonConverter;

import java.time.LocalDate;

public class FromLocalDateToString implements JacksonConverter<LocalDate, String>, DaoConverter<LocalDate, String> {
    @Override
    public String to(LocalDate source) {
        return source.toString();
    }

    @Override
    public LocalDate from(String target) {
        return LocalDate.parse(target);
    }
}
