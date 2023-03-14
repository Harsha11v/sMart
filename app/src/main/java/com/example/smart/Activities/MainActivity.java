package com.example.smart.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.smart.R;
import com.example.smart.databinding.ActivityMainBinding;

// hi
public class  MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot();

        GridLayoutManager layoutManager = new GridLayoutManager(context: this, span  )
    }
}