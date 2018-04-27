package squirtlecoin.donotpanic;

import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GameActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game1);


        Button btn1 = (Button)findViewById(R.id.button_yellow);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity.this, GameActivity2.class));
            }
        });

        Button btn2 = (Button)findViewById(R.id.button_red);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });

        Button btn3 = (Button)findViewById(R.id.button_blue);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });

        Button btn4 = (Button)findViewById(R.id.button_brown);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });

        Button btn5 = (Button)findViewById(R.id.button_green);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });
    }

}
