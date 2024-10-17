package nl.jaysh.hpbuddy.core.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import nl.jaysh.hpbuddy.core.data.local.room.converter.UnitTypeConverter
import nl.jaysh.hpbuddy.core.domain.model.UnitType

@Entity
data class FoodEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "carbs")
    val carbs: Double,
    @ColumnInfo(name = "proteins")
    val proteins: Double,
    @ColumnInfo(name = "fats")
    val fats: Double,
    @ColumnInfo(name = "amount")
    val amount: Double,
    @ColumnInfo(name = "unit_type")
    @TypeConverters(UnitTypeConverter::class)
    val unitType: UnitType,
)
