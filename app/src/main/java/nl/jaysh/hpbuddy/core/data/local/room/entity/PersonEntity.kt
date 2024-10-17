package nl.jaysh.hpbuddy.core.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import nl.jaysh.hpbuddy.core.data.local.room.converter.LocalDateTimeConverter
import nl.jaysh.hpbuddy.core.domain.model.measurementunit.Centimeter
import java.time.LocalDateTime

@Entity(tableName = "person")
data class PersonEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "first_name")
    val firstName: String?,
    @ColumnInfo(name = "last_name")
    val lastName: String?,
    @ColumnInfo(name = "height")
    val height: Centimeter?,
    @ColumnInfo(name = "activity_level")
    val activityLevel: String?,
    @ColumnInfo(name = "age")
    @TypeConverters(LocalDateTimeConverter::class)
    val birthday: LocalDateTime?,
)
