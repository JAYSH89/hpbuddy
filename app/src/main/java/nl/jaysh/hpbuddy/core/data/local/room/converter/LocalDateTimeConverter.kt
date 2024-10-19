package nl.jaysh.hpbuddy.core.data.local.room.converter

import androidx.room.TypeConverter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class LocalDateTimeConverter {
    private val formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME

    @TypeConverter
    fun fromLocalDateTime(localDateTime: LocalDateTime): String = localDateTime.format(formatter)

    @TypeConverter
    fun toLocalDateTime(localDateTimeString: String): LocalDateTime = LocalDateTime.parse(localDateTimeString, formatter)
}
