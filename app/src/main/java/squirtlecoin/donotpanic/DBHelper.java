package squirtlecoin.donotpanic;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    // Fields
    public static final int version = 1;
    public static final String DATABASE_NAME = "Players.db";
    private static final String SQL_CREATE_PLAYERTABLE =
            " CREATE TABLE IF NOT EXISTS " + DBContract.PlayerEntry.TABLE_NAME + " (" +
                    DBContract.PlayerEntry.COLUMN_PLAYERID + " INTEGER NOT NULL UNIQUE PRIMARY KEY," +
                    DBContract.PlayerEntry.COLUMN_USERNAME + " TEXT NOT NULL, " +
                    DBContract.PlayerEntry.COLUMN_PASSWORD + " TEXT NOT NULL, " +
                    DBContract.PlayerEntry.COLUMN_TOPSCORE + " INTEGER, " +
                    DBContract.PlayerEntry.COLUMN_PLAYTIME + " INTEGER); ";
    private static final String SQL_CREATE_SEEDTABLE =
                    "CREATE TABLE IF NOT EXISTS " + DBContract.PlayedSeeds.TABLE_NAME + " (" +
                    DBContract.PlayedSeeds.COLUMN_PLAYERID + " INTEGER, " +
                    DBContract.PlayedSeeds.COLUMN_SEED + "INTEGER)";
    private static final String SQL_DELETE_TABLES =
            "DROP TABLE IF EXISTS " + DBContract.PlayerEntry.TABLE_NAME + " , " + DBContract.PlayedSeeds.TABLE_NAME;

    // Constructor
    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, version);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PLAYERTABLE);
        db.execSQL(SQL_CREATE_SEEDTABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DBContract.PlayerEntry.TABLE_NAME );
        db.execSQL("DROP TABLE IF EXISTS " + DBContract.PlayedSeeds.TABLE_NAME );
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public boolean playerExists(SQLiteDatabase db, String username) {
        Cursor cursor = db.query(
                DBContract.PlayerEntry.TABLE_NAME,
                new String[]{DBContract.PlayerEntry.COLUMN_PLAYERID},
                DBContract.PlayerEntry.COLUMN_USERNAME + " = ?",
                new String[]{username}, null,null, null);
        if (cursor.getCount() == 0) {
            return false;
        }
        return true;
    }
    public boolean playerExists(SQLiteDatabase db, String username, String password) {
        Cursor cursor = db.query(
                DBContract.PlayerEntry.TABLE_NAME,
                new String[]{DBContract.PlayerEntry.COLUMN_PLAYERID},
                DBContract.PlayerEntry.COLUMN_USERNAME + " = ? AND " + DBContract.PlayerEntry.COLUMN_PASSWORD + " = ?",
                new String[]{username, password}, null,null, null);
        if (cursor.getCount() == 0) {
            return false;
        }
        return true;
    }

}
