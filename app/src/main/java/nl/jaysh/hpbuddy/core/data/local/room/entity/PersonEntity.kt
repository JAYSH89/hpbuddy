package nl.jaysh.hpbuddy.core.data.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import nl.jaysh.hpbuddy.core.domain.model.measurementunit.Centimeter

@Entity
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
)
