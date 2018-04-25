package squirtlecoin.donotpanic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addUser(View view) {
        inputUsername = findViewById(R.id.username);
        String name = inputUsername.getText().toString();
        inputUsername = findViewById(R.id.password);
        String pw = inputUsername.getText().toString();
        int id = 3;
        User user = new User(id, name, pw);
    }

}
