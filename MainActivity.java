package com.example.triangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

class Triangle {
    int Fa; // первый катет
    int Fb; // второй катет
    int Fc; // гипотенуза
    double S; // площадь
    double P; // периметр
    public Triangle(int a, int b, int c){
        Fa = a;
        Fb = b;
        Fc = c;
    }
    double getP(){
        P = Fa + Fb + Fc;
        return P;
    }
    double getS(){
        int p, x;
        p = (int) (P/2);
        x = p*(p-Fa)*(p-Fb)*(p-Fc);
        S = Math.sqrt(x);
        return S;
    }
}
