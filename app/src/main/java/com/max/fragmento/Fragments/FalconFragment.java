package com.max.fragmento.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.max.fragmento.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FalconFragment extends Fragment {


    public FalconFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_falcon, container, false);
        return view;
    }

}
