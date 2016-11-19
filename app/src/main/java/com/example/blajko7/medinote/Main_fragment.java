package com.example.blajko7.medinote;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Main_fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        return view;
    }

    public void create_onClick(View view)
    {
        fragmentTransaction.replace(R.id.fragment, new Login_fragment());
        fragmentTransaction.commit();
    }

    public void check_onClick(View view)
    {

    }
    public void registration_onClick(View view)
    {

    }
}
