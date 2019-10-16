package br.com.alura.agenda.database.converter;

import androidx.room.TypeConverter;

import br.com.alura.agenda.model.TipoTelefone;

public class ConversorTipoTelefone {

    @TypeConverter
    public String toString(TipoTelefone value) {
        if (value != null) {
            return value.name();
        }
        return null;
    }

    @TypeConverter
    public TipoTelefone toTipoTelefone(String value) {
        if (value != null) {
            return TipoTelefone.valueOf(value);
        }
        return TipoTelefone.FIXO;
    }

}
