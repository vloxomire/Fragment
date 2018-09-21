package com.max.fragmento.Activitis;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.max.fragmento.Adapters.PagerAdapter;
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

        final ViewPager viewPager=findViewById(R.id.viewPagerId);//vinculado,hay q  crear una clase Adaptador
        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            //Creamos una Instancia del pagerAdapter le pasamos como parametro un
            // getSuppotFragmentmanager,es un manejador de fragment q el constructor de la clase
            // adapter esta esperando y el numero de tabs
        viewPager.setAdapter(pagerAdapter); //le damos el adapter
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //esto es para un listener cada vez q cambiemos, le pasamos el listener de cambio de nuestro tablayout
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            //define lo q hay q hacer cuando cambiemos de un tab a otro
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position=tab.getPosition(); //nos dice en q posicion estamos, nos da un tab de parametro
                viewPager.setCurrentItem(position); //el viewPager maneja las paginas
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
