package com.example.auto_tic_tac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView t[] = new TextView[9];
    TextView ll;

    TextView res;
    ArrayList list = new ArrayList();

    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.res);
        ll = findViewById(R.id.ll);

        for(int i=0;i< t.length;i++)
        {
            int id = getResources().getIdentifier("t"+i,"id",getPackageName());
            t[i] = findViewById(id);
            t[i].setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {

        for(int i=0;i<t.length;i++){
            if(v.getId()==t[i].getId()){
                t[i].setText("X");
                t[i].setEnabled(false);
                list.add(i);
                win();
                cnt++;
                if(cnt<=4){
                    while(true){
                        int max=8,min=0;
                        int r = new Random().nextInt(max - min) + min ;
                        if(!list.contains(r)){
                            t[r].setText("O");
                            list.add(r);
                            win();
                            t[r].setEnabled(false);
                            break;
                        }


                    }
                }

            }
        }

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<t.length;i++){
                    t[i].setText("");
                    list.clear();
                    cnt=0;
                    t[i].setEnabled(true);
                    ll.setText("");
                }
            }
        });
    }

    private void win() {
        if(t[0].getText().toString() == "X" && t[1].getText().toString() == "X" && t[2].getText().toString() == "X"){
              ll.setText("Congratulation ! You Win");
              t[0].setEnabled(false);
              t[1].setEnabled(false);
              t[2].setEnabled(false);
              t[3].setEnabled(false);
              t[4].setEnabled(false);
              t[5].setEnabled(false);
              t[6].setEnabled(false);
              t[7].setEnabled(false);
              t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "X" && t[3].getText().toString() == "X" && t[6].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "X" && t[4].getText().toString() == "X" && t[8].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[1].getText().toString() == "X" && t[4].getText().toString() == "X" && t[7].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "X" && t[4].getText().toString() == "X" && t[6].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "X" && t[5].getText().toString() == "X" && t[8].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[3].getText().toString() == "X" && t[4].getText().toString() == "X" && t[5].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[6].getText().toString() == "X" && t[7].getText().toString() == "X" && t[8].getText().toString() == "X"){
            ll.setText("Congratulation ! You Win");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }



        if(t[0].getText().toString() == "O" && t[1].getText().toString() == "O" && t[2].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "O" && t[3].getText().toString() == "O" && t[6].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[0].getText().toString() == "O" && t[4].getText().toString() == "O" && t[8].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[1].getText().toString() == "O" && t[4].getText().toString() == "O" && t[7].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "O" && t[4].getText().toString() == "O" && t[6].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[2].getText().toString() == "O" && t[5].getText().toString() == "O" && t[8].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[3].getText().toString() == "O" && t[4].getText().toString() == "O" && t[5].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
        if(t[6].getText().toString() == "O" && t[7].getText().toString() == "O" && t[8].getText().toString() == "O"){
            ll.setText("Oops !! You lose...");
            t[0].setEnabled(false);
            t[1].setEnabled(false);
            t[2].setEnabled(false);
            t[3].setEnabled(false);
            t[4].setEnabled(false);
            t[5].setEnabled(false);
            t[6].setEnabled(false);
            t[7].setEnabled(false);
            t[8].setEnabled(false);
        }
    }
}