package com.example.bottomnav;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private ProfileFragment profileFragment = new ProfileFragment();
    private BangunDatarFragment bangundatarFragment = new BangunDatarFragment();
    private BangunRuangFragment bangunRuangFragment = new BangunRuangFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutfragment, profileFragment).commit();
            return true;
        } else if (itemId == R.id.bangunDatar) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutfragment, bangundatarFragment).commit();
            return true;
        } else if (itemId == R.id.bangunRuang) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutfragment, bangunRuangFragment).commit();
            return true;
        } else {
            return false;
        }

    }
}

