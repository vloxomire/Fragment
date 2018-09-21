package com.max.fragmento.Activitis;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.max.fragmento.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //Bloque tabLayout
        TabLayout tabLayout=findViewById(R.id.tabLayoutId);
        //agrego los tab
        tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab3"));
        //seteo gravedad al texto de los tabs
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        ViewPager viewPager=findViewById(R.id.viewPagerId);
    }
}
