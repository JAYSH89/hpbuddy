package nl.jaysh.hpbuddy.core.data.local.room.datasource.food

import arrow.core.Either
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import nl.jaysh.hpbuddy.core.data.local.room.entity.FoodEntity
import nl.jaysh.hpbuddy.core.domain.model.failure.Failure
import nl.jaysh.hpbuddy.core.domain.model.failure.StorageFailure
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryFoodDataSource @Inject constructor() : LocalFoodDataSource {

    private val foodList: MutableStateFlow<List<FoodEntity>> = MutableStateFlow(emptyList())

    fun getAll(): Flow<Either<Failure, List<FoodEntity>>> = foodList
        .map { Either.Right(it) }
        .catch { Either.Left(StorageFailure.IO) }

    fun getById(id: Long): Flow<Either<Failure, FoodEntity>> = foodList
        .map { list -> searchFoodEntity(id, list) }
        .catch { Either.Left(StorageFailure.IO) }

    suspend fun save(food: FoodEntity): Either<Failure, Unit> {
        delete(food = food)
        foodList.update { currentList -> currentList + food }
        return Either.Right(Unit)
    }

    suspend fun delete(food: FoodEntity): Either<Failure, Unit> {
        val exists = foodList
            .first()
            .map { it.id }
            .contains(food.id)

        return if (exists) {
            foodList.update { currentList -> currentList - food }
            return Either.Right(Unit)
        } else {
            Either.Left(StorageFailure.NotFound)
        }
    }

    private fun searchFoodEntity(id: Long, list: List<FoodEntity>): Either<Failure, FoodEntity> {
        val result = list.firstOrNull { foodEntity -> foodEntity.id == id }

        return if (result == null) {
            Either.Left(StorageFailure.NotFound)
        } else {
            Either.Right(result)
        }
    }
}
