package nl.jaysh.hpbuddy.di

import android.content.Context
import androidx.room.Room.databaseBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import nl.jaysh.hpbuddy.core.data.local.room.AppDatabase
import nl.jaysh.hpbuddy.core.utils.Constants.DATABASE_NAME
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {
    @Provides
    @Singleton
    fun providesAppDatabase(
        @ApplicationContext context: Context,
    ): AppDatabase {
        return databaseBuilder(
            context = context,
            klass = AppDatabase::class.java,
            name = DATABASE_NAME,
        )
            .fallbackToDestructiveMigration() // for dev purposes - migrate properly in prod
            .build()
    }
}
