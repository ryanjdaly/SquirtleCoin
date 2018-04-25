package squirtlecoin.donotpanic;

import android.provider.BaseColumns;

public final class DBContract {

    // Prevent instantiating
    private DBContract() {
    }

    /*
        Inner class for each table in our database.  This allows us to make changes to our database schema without making changes to the rest of our code.
     */

    public static class PlayerEntry implements BaseColumns {
        public static final String TABLE_NAME = "Players";
        public static final String COLUMN_PLAYERID = "PlayerID";
        public static final String COLUMN_USERNAME = "Username";
        public static final String COLUMN_PASSWORD = "Password";
        public static final String COLUMN_TOPSCORE = "TopScore";
        public static final String COLUMN_PLAYTIME = "TotalPlaytime";

    }

    public static class PlayedSeeds implements BaseColumns {
        public static final String TABLE_NAME = "PlayedSeeds";
        public static final String COLUMN_PLAYERID = "PlayerID";
        public static final String COLUMN_SEED = "Seed";
    }
}