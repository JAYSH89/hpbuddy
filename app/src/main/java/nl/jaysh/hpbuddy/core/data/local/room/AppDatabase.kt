package nl.jaysh.hpbuddy.core.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import nl.jaysh.hpbuddy.core.data.local.room.converter.LocalDateTimeConverter
import nl.jaysh.hpbuddy.core.data.local.room.converter.UnitTypeConverter
import nl.jaysh.hpbuddy.core.data.local.room.dao.FoodDao
import nl.jaysh.hpbuddy.core.data.local.room.dao.PersonDao
import nl.jaysh.hpbuddy.core.data.local.room.dao.WeightDao
import nl.jaysh.hpbuddy.core.data.local.room.entity.FoodEntity
import nl.jaysh.hpbuddy.core.data.local.room.entity.PersonEntity
import nl.jaysh.hpbuddy.core.data.local.room.entity.WeightEntity

@Database(
    entities = [
        WeightEntity::class,
        PersonEntity::class,
        FoodEntity::class,
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

    abstract fun personDao(): PersonDao

    abstract fun foodDao(): FoodDao
}
