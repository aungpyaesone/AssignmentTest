package com.example.assignmenttest.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {RatesData.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;
    public abstract RateDao rateDao();
    public static AppDatabase getInstance(Context context)
    {
        if(INSTANCE == null)
        {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"rate_database")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
    private static Callback myCallBack = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsync(INSTANCE).execute();
        }
    };

    public static class PopulateDbAsync extends AsyncTask<String, Void, Void> {

        private final RateDao rDao;

        PopulateDbAsync(AppDatabase db) {
            rDao = db.rateDao();
        }

        @Override
        protected Void doInBackground(final String... params) {
           // rDao.insertContact(params[0]);
            return null;
        }
    }
}
