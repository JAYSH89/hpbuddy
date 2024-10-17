package nl.jaysh.hpbuddy.core.data.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import nl.jaysh.hpbuddy.core.data.local.room.entity.FoodEntity

@Dao
interface FoodDao {
    @Query("SELECT * FROM food")
    fun getAll(): Flow<List<FoodEntity>>

    @Query("SELECT * FROM food WHERE id == :id")
    fun getById(id: Long): Flow<FoodEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(foodEntity: FoodEntity)

    @Delete
    fun delete(foodEntity: FoodEntity)
}