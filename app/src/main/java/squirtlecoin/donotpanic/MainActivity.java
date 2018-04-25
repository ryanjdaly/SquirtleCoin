package squirtlecoin.donotpanic;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Fields

    EditText inputText;
    DBHelper dbHelper;
    SQLiteDatabase db;

    // Constructors

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DBHelper(this);
        db = dbHelper.getWritableDatabase();
    }

    // Functions

    public void attemptLogin(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
        if(dbHelper.playerExists(db, name, pw)){
            // Login
        }
        else{
            // Reject Login Attempt
        }
    }

    public void addUser(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
        int id = 3;
        if(!dbHelper.playerExists(db, name)){
            ContentValues values = new ContentValues();
            values.put(DBContract.PlayerEntry.COLUMN_PLAYERID, id);
            values.put(DBContract.PlayerEntry.COLUMN_USERNAME, name);
            values.put(DBContract.PlayerEntry.COLUMN_PASSWORD, pw);
            values.put(DBContract.PlayerEntry.COLUMN_PLAYTIME, 0);
            values.put(DBContract.PlayerEntry.COLUMN_TOPSCORE, 0);
            db.insert(DBContract.PlayerEntry.TABLE_NAME, null, values);
        }

    }


}
