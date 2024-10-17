package nl.jaysh.hpbuddy.core.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import nl.jaysh.hpbuddy.core.data.local.room.typeconverter.LocalDateTimeTypeConverter
import nl.jaysh.hpbuddy.core.domain.model.measurementunit.Gram
import java.time.LocalDateTime

@Entity(tableName = "weight")
data class WeightEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "weight")
    val weight: Gram,
    @ColumnInfo(name = "measured_at")
    @TypeConverters(LocalDateTimeTypeConverter::class)
    val measuredAt: LocalDateTime,
)
