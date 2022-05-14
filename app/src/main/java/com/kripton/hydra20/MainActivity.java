package com.kripton.hydra20;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    private NavigationView navigationView;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.framelayout);
        DrawerLayout layout =findViewById(R.id.navigation_drawer);
        navigationView = findViewById(R.id.nav);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this,layout,toolbar,R.string.Open,R.string.Close);

        toggle.setDrawerIndicatorEnabled(true);
        layout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setItemIconTintList(null);
    }


}