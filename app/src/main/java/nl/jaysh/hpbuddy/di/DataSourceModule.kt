package nl.jaysh.hpbuddy.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import nl.jaysh.hpbuddy.BuildConfig
import nl.jaysh.hpbuddy.core.data.local.room.datasource.food.InMemoryFoodDataSource
import nl.jaysh.hpbuddy.core.data.local.room.datasource.food.LocalFoodDataSource
import nl.jaysh.hpbuddy.core.data.local.room.datasource.food.LocalFoodDataSourceImpl
import nl.jaysh.hpbuddy.core.data.local.room.datasource.person.InMemoryPersonDataSource
import nl.jaysh.hpbuddy.core.data.local.room.datasource.person.LocalPersonDataSource
import nl.jaysh.hpbuddy.core.data.local.room.datasource.person.LocalPersonDataSourceImpl
import nl.jaysh.hpbuddy.core.data.local.room.datasource.weight.InMemoryWeightDataSource
import nl.jaysh.hpbuddy.core.data.local.room.datasource.weight.LocalWeightDataSource
import nl.jaysh.hpbuddy.core.data.local.room.datasource.weight.LocalWeightDataSourceImpl
import javax.inject.Singleton

@Suppress("KotlinConstantConditions")
@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun providesLocalFoodDataSource(): LocalFoodDataSource = if (BuildConfig.FLAVOR == "inMemory") {
        InMemoryFoodDataSource()
    } else {
        LocalFoodDataSourceImpl()
    }

    @Provides
    @Singleton
    fun providesLocalPersonDataSource(): LocalPersonDataSource = if (BuildConfig.FLAVOR == "inMemory") {
        InMemoryPersonDataSource()
    } else {
        LocalPersonDataSourceImpl()
    }

    @Provides
    @Singleton
    fun providesLocalWeightDataSource(): LocalWeightDataSource = if (BuildConfig.FLAVOR == "inMemory") {
        InMemoryWeightDataSource()
    } else {
        LocalWeightDataSourceImpl()
    }
}
