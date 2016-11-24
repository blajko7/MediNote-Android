package com.example.blajko7.medinote;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Main_fragment extends Fragment {

    private void ChangeFragment(Fragment fragment, boolean addReverseTransaction)
    {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_home, fragment);
        if (addReverseTransaction)
        {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        Button createButton = (Button) view.findViewById(R.id.home_create_button);
        createButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ChangeFragment(new Login_fragment(),true);
                    }
                }
        );
        Button checkButton = (Button) view.findViewById(R.id.home_check_button);
        checkButton.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        ChangeFragment(new Check_fragment(),true);
                    }
                }
        );
        Button registrationButton = (Button) view.findViewById(R.id.home_registration_button);
        registrationButton.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        ChangeFragment(new Registration_fragment(),true);
                    }
                }
        );

        return view;
    }
}
