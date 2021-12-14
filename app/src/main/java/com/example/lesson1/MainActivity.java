package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    private EditText prise;
    private EditText volume;
    private Button summa_converting;
    private TextView print_summa_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.mini_converter);

        initView();
        summa_converting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print_summa_finish.setText(getSumView());
            }
        });

    }

    private String getSumView() {
        String Prise = prise.getText().toString();
        String Volume = volume.getText().toString();
        String finishSum;
        try {
            int p = Integer.parseInt(Prise);
            int v = Integer.parseInt(Volume);
            int sum = (p * v) + ((p * v) / 100 * 13);
            finishSum = String.valueOf(sum);
        } catch (Exception e) {
            e.printStackTrace();
            finishSum = " НЕКОРЕКТНЫЙ ВВОД ";
        }

        return finishSum;
    }

    private void initView() {
        prise = (EditText) findViewById(R.id.prise);
        volume = (EditText) findViewById(R.id.volume);
        summa_converting = (Button) findViewById(R.id.summa_converting);
        print_summa_finish = (TextView) findViewById(R.id.print_summa_finish);
    }

}