package org.aisillinois.mobile;


import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public class AboutUsFragment extends Fragment {
    public static final String ARG_FRAGMENTS_NUMBER = "fragment_number";

    public AboutUsFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_display, container, false);
        int i = getArguments().getInt(ARG_FRAGMENTS_NUMBER);
        String fragment = getResources().getStringArray(R.array.fragments_array)[i];
        getActivity().setTitle(fragment);
        return rootView;
    }
}

