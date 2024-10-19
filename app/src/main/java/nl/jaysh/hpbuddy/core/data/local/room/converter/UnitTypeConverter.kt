package nl.jaysh.hpbuddy.core.data.local.room.converter

import androidx.room.TypeConverter
import nl.jaysh.hpbuddy.core.domain.model.UnitType

class UnitTypeConverter {
    @TypeConverter
    fun fromUnitType(unitType: UnitType): String = unitType.name

    @TypeConverter
    fun toUnitType(unitTypeString: String): UnitType = UnitType.valueOf(unitTypeString)
}
