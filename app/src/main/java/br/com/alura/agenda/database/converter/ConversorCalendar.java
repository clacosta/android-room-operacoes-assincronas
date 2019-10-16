package br.com.alura.agenda.database.converter;

import androidx.room.TypeConverter;

import java.util.Calendar;

public class ConversorCalendar {

    @TypeConverter
    public Long toLong(Calendar value) {
        if (value != null) {
            return value.getTimeInMillis();
        }
        return null;
    }

    @TypeConverter
    public Calendar toCalendar(Long value) {
        Calendar calendar = Calendar.getInstance();
        if (value != null) {
            calendar.setTimeInMillis(value);
        }
        return calendar;
    }

}
