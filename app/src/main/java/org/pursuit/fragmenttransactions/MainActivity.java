package org.pursuit.fragmenttransactions;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction mainTransaction = fragmentManager.beginTransaction();
        mainTransaction.replace(R.id.main_container, mainFragment).addToBackStack("mainFragment");
        mainTransaction.commit();
    }
}
