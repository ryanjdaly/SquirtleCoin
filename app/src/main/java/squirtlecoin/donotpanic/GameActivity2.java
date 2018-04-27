package squirtlecoin.donotpanic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GameActivity2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game2);


        Button btn1 = (Button)findViewById(R.id.button_blue2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gamewinner);
            }
        });

        Button btn2 = (Button)findViewById(R.id.button_brown2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });

        Button btn3 = (Button)findViewById(R.id.button_green2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });

        Button btn4 = (Button)findViewById(R.id.button_red2);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.gameover);
            }
        });
    }


}
