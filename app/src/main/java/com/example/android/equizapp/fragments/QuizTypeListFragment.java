package com.example.android.equizapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.equizapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuizTypeListFragment extends Fragment {


    public QuizTypeListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_type_list, container, false);
    }

}
