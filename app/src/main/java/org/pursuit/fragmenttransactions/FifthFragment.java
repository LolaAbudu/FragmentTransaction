package org.pursuit.fragmenttransactions;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FifthFragment extends Fragment {

    private View rootView;


    public FifthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_fifth, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.fifth_fragment_textview);

        // Inflate the layout for this fragment
        return rootView;
    }

}