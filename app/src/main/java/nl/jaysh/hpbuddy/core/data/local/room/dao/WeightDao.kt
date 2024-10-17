package nl.jaysh.hpbuddy.core.data.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import nl.jaysh.hpbuddy.core.data.local.room.entity.WeightEntity

@Dao
interface WeightDao {
    @Query("SELECT * FROM weight")
    fun getAll(): Flow<List<WeightEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(weight: WeightEntity)

    @Delete
    fun delete(weight: WeightEntity)
}
