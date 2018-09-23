package com.max.fragmento.Activitis;

import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.max.fragmento.Adapters.PagerAdapter;
import com.max.fragmento.R;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //<<<Bloque Toolbar>>>
        Toolbar myToolbar=findViewById(R.id.my_toolbarId);
        setSupportActionBar(myToolbar);//Este método establece la barra de herramientas como la barra de app de la actividad
        getSupportActionBar().setDisplayShowTitleEnabled(true);//Este método muestra una referencia a un objeto appcompat ActionBar
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle("Autos");
        getSupportActionBar().setLogo(R.drawable.traffic);




        //<<<Bloque tabLayout>>>
        TabLayout tabLayout=findViewById(R.id.tabLayoutId);
        //agrego los tab
        tabLayout.addTab(tabLayout.newTab().setText("Chevy"));   //añadimos los tabs
        tabLayout.addTab(tabLayout.newTab().setText("Falcon"));
        tabLayout.addTab(tabLayout.newTab().setText("Rastrojero"));
        //seteo gravedad de los tabs q afectan al texto
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
                Toast.makeText(MainActivity.this,"Selected->"+ tab.getText(),Toast.LENGTH_SHORT).show();
                int position=tab.getPosition(); //nos dice en q posicion estamos, nos da un tab de parametro
                viewPager.setCurrentItem(position); //el viewPager maneja las paginas
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this,"Unselected->"+ tab.getText(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this,"Reselected->"+ tab.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    //<<<Menu del tablayout(3puntos)>>>
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        DrawerLayout drawerLayout=findViewById(R.id.drawer_layoutId);
        //acciones android puras
        switch (item.getItemId()){
            case android.R.id.home:
                //Abrir el menu lateral
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        //acciones del menu definido por el desarrollador
        switch (item.getItemId()){
            case R.id.agregarId:
                Toast.makeText(this,"Agregar autos",Toast.LENGTH_SHORT).show();
                break;
            case R.id.salirId:
                Toast.makeText(this,"Salir",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
