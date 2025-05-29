package com.example.vinolaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorActivity extends AppCompatActivity {
    Button btntbh, btnkl, btnbg;
    EditText edtnmr1, edtnmr2;
    TextView hsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btntbh = findViewById(R.id.btntbh);
        btnkl = findViewById(R.id.btnkl);
        btnbg = findViewById(R.id.btnbg);
        edtnmr1 = findViewById(R.id.edtnmr1);
        edtnmr2 = findViewById(R.id.edtnmr2);
        hsl = findViewById(R.id.hsl);

        btntbh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edtnmr1.getText().toString());
                int angka2 = Integer.parseInt(edtnmr2.getText().toString());
                int hasil = angka1 + angka2;
                hsl.setText(String.valueOf(hasil));
            }
        });


        btnkl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edtnmr1.getText().toString());
                int angka2 = Integer.parseInt(edtnmr2.getText().toString());
                int hasil = angka1 * angka2;
                hsl.setText(String.valueOf(hasil));
            }
        });


        btnbg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double angka1 = Double.parseDouble(edtnmr1.getText().toString());
                double angka2 = Double.parseDouble(edtnmr2.getText().toString());
                double hasil = angka1 / angka2;
                hsl.setText(String.valueOf(hasil));
            }
        });

    }
}