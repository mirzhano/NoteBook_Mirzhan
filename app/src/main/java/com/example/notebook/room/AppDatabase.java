package com.example.notebook.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.notebook.models.Student;

@Database(entities = {Student.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract StudentDao studentDao();
}
