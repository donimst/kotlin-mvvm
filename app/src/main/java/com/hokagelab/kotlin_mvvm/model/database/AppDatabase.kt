package com.hokagelab.kotlin_mvvm.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hokagelab.kotlin_mvvm.model.Post
import com.hokagelab.kotlin_mvvm.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}