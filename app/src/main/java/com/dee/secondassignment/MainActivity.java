package com.dee.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.ArmStrong;
import fragments.Automorphic;
import fragments.Palindrome;
import fragments.SimpleInterest;
import fragments.Swapping;
import fragments.circle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button btnCircle, btnPalindrome,btnSI,btnArmstrong,btnAutomorphic,btnSwapping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle = findViewById(R.id.btnCircle);
        btnCircle.setOnClickListener(this);

        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnPalindrome.setOnClickListener(this);

        btnSI = findViewById(R.id.btnSI);
        btnSI.setOnClickListener(this);

        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnArmstrong.setOnClickListener(this);

        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnAutomorphic.setOnClickListener(this);

        btnSwapping = findViewById(R.id.btnSwapping);
        btnSwapping.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
        switch (view.getId()){

            case R.id.btnCircle:
                circle circle = new circle();
                fragmentTransaction.replace(R.id.FragmentContainer,circle);
                fragmentTransaction.commit();
                break;

            case R.id.btnSI:
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.FragmentContainer,simpleInterest);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                Palindrome palindrome = new Palindrome();
                fragmentTransaction.replace(R.id.FragmentContainer,palindrome);
                fragmentTransaction.commit();
                break;

            case R.id.btnArmstrong:
                ArmStrong armStrong = new ArmStrong();
                fragmentTransaction.replace(R.id.FragmentContainer,armStrong);
                fragmentTransaction.commit();
                break;

            case R.id.btnAutomorphic:
                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.FragmentContainer,automorphic);
                fragmentTransaction.commit();
                break;

            case R.id.btnSwapping:
                Swapping swapping = new Swapping();
                fragmentTransaction.replace(R.id.FragmentContainer,swapping);
                fragmentTransaction.commit();
                break;

        }
    }
}
