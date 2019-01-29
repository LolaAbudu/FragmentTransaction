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
        FragmentTransaction mainTransaction = fragmentManager.beginTransaction().addToBackStack("main");
        mainTransaction.replace(R.id.main_container, mainFragment);
        mainTransaction.commit();

        FirstFragment firstFragment = new FirstFragment();
        FragmentTransaction firstTransaction = fragmentManager.beginTransaction().addToBackStack("first");
        firstTransaction.replace(R.id.main_container, firstFragment);
        firstTransaction.commit();

        SecondFragment secondFragment = new SecondFragment();
        FragmentTransaction secondTransaction = fragmentManager.beginTransaction().addToBackStack("second");
        secondTransaction.replace(R.id.main_container, secondFragment);
        secondTransaction.commit();

        ThirdFragment thirdFragment = new ThirdFragment();
        FragmentTransaction thirdTransaction = fragmentManager.beginTransaction().addToBackStack("third");
        thirdTransaction.replace(R.id.main_container, thirdFragment);
        thirdTransaction.commit();

        FourthFragment fourthFragment = new FourthFragment();
        FragmentTransaction fourthTransaction = fragmentManager.beginTransaction().addToBackStack("fourth");
        fourthTransaction.replace(R.id.main_container, fourthFragment);
        fourthTransaction.commit();

        FifthFragment fifthFragment = new FifthFragment();
        FragmentTransaction fifthTransaction = fragmentManager.beginTransaction().addToBackStack("fifth");
        fifthTransaction.replace(R.id.main_container, fifthFragment);
        fifthTransaction.commit();

    }
}
