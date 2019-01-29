package org.pursuit.fragmenttransactions;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {

    private View rootView;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private EditText editText;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        button01 = rootView.findViewById(R.id.button01);
        button02 = rootView.findViewById(R.id.button02);
        button03 = rootView.findViewById(R.id.button03);
        button04 = rootView.findViewById(R.id.button04);
        button05 = rootView.findViewById(R.id.button05);

        editText = rootView.findViewById(R.id.editText);
        final Bundle bundle = new Bundle();

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment firstFragment = new FirstFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, firstFragment).addToBackStack("firstFragment");
                fragmentTransaction.commit();

                String editTextContents = editText.getText().toString();
                bundle.putString("firstFragment", editTextContents);
                firstFragment.setArguments(bundle);
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, secondFragment).addToBackStack("secondFragment");
                fragmentTransaction.commit();

                String editTextContents = editText.getText().toString();
                bundle.putString("secondFragment", editTextContents);
                secondFragment.setArguments(bundle);
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdFragment thirdFragment = new ThirdFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, thirdFragment).addToBackStack("thirdFragment");
                fragmentTransaction.commit();

                String editTextContents = editText.getText().toString();
                bundle.putString("thirdFragment", editTextContents);
                thirdFragment.setArguments(bundle);
            }
        });

        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FourthFragment fourthFragment = new FourthFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fourthFragment).addToBackStack("fourthFragment");
                fragmentTransaction.commit();

                String editTextContents = editText.getText().toString();
                bundle.putString("fourthFragment", editTextContents);
                fourthFragment.setArguments(bundle);
            }
        });

        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FifthFragment fifthFragment = new FifthFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fifthFragment).addToBackStack("fifthFragment");
                fragmentTransaction.commit();

                String editTextContents = editText.getText().toString();
                bundle.putString("fifthFragment", editTextContents);
                fifthFragment.setArguments(bundle);
            }
        });
        return rootView;
    }
}
