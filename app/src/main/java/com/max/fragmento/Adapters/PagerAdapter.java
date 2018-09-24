package com.max.fragmento.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.max.fragmento.Fragments.AutoFragment;
import com.max.fragmento.Fragments.ModeloFragment;
import com.max.fragmento.Fragments.MarcaFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;
    public PagerAdapter(FragmentManager fm,int numberOfTabs) {
        super(fm);
        this.numberOfTabs=numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) { //Se ejecuta cuando cambiemos de un tabs a otro,nos va a llegar
        // una posicion y de esa posicion tenemos una instancia de un fragmento u otro fragment
        switch (position){
            case 0:
                return new AutoFragment();
            case 1:
                return new ModeloFragment();
            case 2:
                return new MarcaFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {  //es el que dice cuantos tabs tenemos
        return numberOfTabs;
    }
}
