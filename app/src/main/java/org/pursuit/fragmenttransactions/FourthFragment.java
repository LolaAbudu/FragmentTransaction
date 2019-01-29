package org.pursuit.fragmenttransactions;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourthFragment extends Fragment {

    private View rootView;
    private TextView displayTextView;

    public FourthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_fourth, container, false);
        displayTextView = rootView.findViewById(R.id.fourth_fragment_textview);

        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("fourthFragment", "");
        displayTextView.setText(textFromEditText);

        return rootView;
    }

}
