package com.example.assignmenttest.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {},version = 1)

public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;
    public abstract CurrencyDao currencyDao();
    public static AppDatabase getAppDatabase(Context context){
        if (INSTANCE == null)
        {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"contact_database")
                    .allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

}
