package nl.jaysh.hpbuddy.core.data.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import nl.jaysh.hpbuddy.core.data.local.room.entity.PersonEntity

@Dao
interface PersonDao {
    @Query("SELECT * FROM person")
    fun getAll(): Flow<List<PersonEntity>>

    @Query("SELECT * FROM person WHERE id == :id")
    fun getById(id: Long): Flow<PersonEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(person: PersonEntity)

    @Delete
    fun delete(person: PersonEntity)
}
