package squirtlecoin.donotpanic;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

import static squirtlecoin.donotpanic.R.id.button_login;

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

        Button btn = (Button)findViewById(R.id.button_login);

    }

    // Functions



    public void attemptLogin(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
        Toast toast = new Toast(getApplicationContext());
        if(!name.isEmpty() && !pw.isEmpty()) {
            if(dbHelper.playerExists(db, name, pw)){
                startActivity(new Intent(MainActivity.this, GameActivity.class));
            }
            else{
                toast = Toast.makeText(getApplicationContext(),"Incorrect username or password.  Have you created an account yet?",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else {
            toast = Toast.makeText(getApplicationContext(), "Please enter a username and password", Toast.LENGTH_SHORT);
            toast.show();
        }
    }



    public void attemptLogin2(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
        Toast toast = new Toast(getApplicationContext());
        if(!name.isEmpty() && !pw.isEmpty()) {
            if(dbHelper.playerExists(db, name, pw)){
                startActivity(new Intent(MainActivity.this, Instructions.class));
            }
            else{
                toast = Toast.makeText(getApplicationContext(),"Incorrect username or password.  Have you created an account yet?",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else {
            toast = Toast.makeText(getApplicationContext(), "Please enter a username and password", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void addUser(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
        Random r = new Random();
        int id = r.nextInt();
        if(!dbHelper.playerExists(db, name)){
            ContentValues values = new ContentValues();
            values.put(DBContract.PlayerEntry.COLUMN_PLAYERID, id);
            values.put(DBContract.PlayerEntry.COLUMN_USERNAME, name);
            values.put(DBContract.PlayerEntry.COLUMN_PASSWORD, pw);
            values.put(DBContract.PlayerEntry.COLUMN_PLAYTIME, 0);
            values.put(DBContract.PlayerEntry.COLUMN_TOPSCORE, 0);
            db.insert(DBContract.PlayerEntry.TABLE_NAME, null, values);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Username already exists!", Toast.LENGTH_SHORT);
        }
    }
}
