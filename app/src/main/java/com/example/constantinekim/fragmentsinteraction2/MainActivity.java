package com.example.constantinekim.fragmentsinteraction2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.constantinekim.fragmentsinteraction2.Fragment.InfoFragment;
import com.example.constantinekim.fragmentsinteraction2.Fragment.ListFragment;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteraction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onFragmentInteraction(String model) {
        InfoFragment infoFragment = (InfoFragment) getSupportFragmentManager().findFragmentById(R.id.phone_info_fragment);
        if (infoFragment != null && infoFragment.isInLayout()) {

        }
    }
}
