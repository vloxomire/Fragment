package com.max.fragmento.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.max.fragmento.R;

public class ChevyFragment extends Fragment {
    private TextView textView1,textView2,textView3;
    private ImageView imageView;
    private View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view=inflater.inflate(R.layout.main_activity, container, false);
        textView1=getActivity().findViewById(R.id.modeloId);
        textView2=getActivity().findViewById(R.id.marcaId);
        textView3=getActivity().findViewById(R.id.anioId);
        imageView=getActivity().findViewById(R.id.imageViewId);
        return view;
    }
}
