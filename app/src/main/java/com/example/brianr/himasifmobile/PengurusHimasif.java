package com.example.brianr.himasifmobile;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PengurusHimasif extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    RelativeLayout layout;
<<<<<<< HEAD
    ViewPager viewPager;
    SliderAdapter adapter;
    Spinner spinner;
    private List<SliderAdapter> mlist = new ArrayList<SliderAdapter>();
=======

>>>>>>> upstream/master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurus_himasif);
        layout = (RelativeLayout)findViewById(R.id.layout);
        animationDrawable = (AnimationDrawable) layout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
<<<<<<< HEAD
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(PengurusHimasif.this, R.array.Pengurus, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Object item = adapterView.getSelectedItem();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter = new SliderAdapter(this);
        viewPager.setAdapter(adapter);
=======
>>>>>>> upstream/master


    }
}
