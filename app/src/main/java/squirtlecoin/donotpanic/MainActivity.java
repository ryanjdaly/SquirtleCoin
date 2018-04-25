package squirtlecoin.donotpanic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.database.sqlite.SQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {

    // Fields

    EditText inputText;
    DBHelper db;

    // Constructors

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DBHelper(this);
        db.getWritableDatabase();
    }

    // Functions

    public void attemptLogin(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
    }

    public void addUser(View view) {
        inputText = findViewById(R.id.username);
        String name = inputText.getText().toString();
        inputText = findViewById(R.id.password);
        String pw = inputText.getText().toString();
        int id = 3;
        User user = new User(id, name, pw);
    }
}
