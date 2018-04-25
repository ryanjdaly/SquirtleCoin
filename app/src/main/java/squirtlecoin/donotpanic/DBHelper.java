package squirtlecoin.donotpanic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    // Fields
    public static final int version = 1;
    public static final String DATABASE_NAME = "Players.db";
    private static final String SQL_CREATE_TABLES =
            " CREATE TABLE IF NOT EXISTS " + DBContract.PlayerEntry.TABLE_NAME + " (" +
                    DBContract.PlayerEntry.COLUMN_PLAYERID + " INTEGER NOT NULL UNIQUE PRIMARY KEY," +
                    DBContract.PlayerEntry.COLUMN_USERNAME + " TEXT NOT NULL, " +
                    DBContract.PlayerEntry.COLUMN_PASSWORD + " TEXT NOT NULL, " +
                    DBContract.PlayerEntry.COLUMN_TOPSCORE + " INTEGER, " +
                    DBContract.PlayerEntry.COLUMN_PLAYTIME + " INTEGER);" +
                    " CREATE TABLE IF NOT EXISTS " + DBContract.PlayedSeeds.TABLE_NAME + " (" +
                    DBContract.PlayedSeeds.COLUMN_PLAYERID + " INTEGER, " +
                    DBContract.PlayedSeeds.COLUMN_SEED + "INTEGER)";
    private static final String SQL_DELETE_TABLES =
            "DROP TABLE IF EXISTS " + DBContract.PlayerEntry.TABLE_NAME + " , " + DBContract.PlayedSeeds.TABLE_NAME;


    // Constructor
    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, version);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_TABLES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

}
