package com.example.ichikawayuki.fragmentpp;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Bundle;

import com.example.ichikawayuki.fragmentpp.Fragment_2;
import com.example.ichikawayuki.fragmentpp.R;

import java.util.HashMap;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        /*

        Button button = (Button)v.findViewById(R.id.button_02);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

            }
        });

        */

        return inflater.inflate(R.layout.fragment_main,
                container, false);
    }

    private void showNextFragment() {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.button_02,Fragment_2.instantiate());

        transaction.commit();
    }

    @SuppressLint("ResourceType")
    public void onClick(){

    }

}

/*
    Fragment f = new Fragment_2(); // 切り替え後の任意のFragment
    getFragmentManager().beginTransaction()
        .replace(R.layout.kawaguti_fragment_2, f) // R.id.fragment2にあるFragmentを
        // 上記の f に切り替える
        .commit();
        */