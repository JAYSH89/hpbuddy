package nl.jaysh.hpbuddy.core.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import nl.jaysh.hpbuddy.core.data.local.room.dao.WeightDao
import nl.jaysh.hpbuddy.core.data.local.room.entity.PersonEntity
import nl.jaysh.hpbuddy.core.data.local.room.entity.WeightEntity
import nl.jaysh.hpbuddy.core.data.local.room.converter.LocalDateTimeConverter
import nl.jaysh.hpbuddy.core.data.local.room.converter.UnitTypeConverter

@Database(
    entities = [
        WeightEntity::class,
        PersonEntity::class,
    ],
    version = 1,
    exportSchema = false,
)
@TypeConverters(
    LocalDateTimeConverter::class,
    UnitTypeConverter::class,
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun weightDao(): WeightDao
}
