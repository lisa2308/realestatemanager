package com.openclassrooms.realestatemanager.data.room.typeconverter;

import androidx.room.TypeConverter;

import com.openclassrooms.realestatemanager.data.entities.EstateType;

import java.util.Date;

public class EstateTypeConverter {
    @TypeConverter
    public EstateType fromEstateType(String value) {
        return value == null ? null : EstateType.fromDisplayString(value);
    }

    @TypeConverter
    public String estateTypeToString(EstateType estateType) {
        if (estateType == null) {
            return null;
        } else {
            return estateType.getType();
        }
    }
}
