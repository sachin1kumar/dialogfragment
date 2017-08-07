package com.quotes.programmer.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends DialogFragment implements Handler.Callback{

    private FragmentB fragmentB;
    public FragmentA() {
        // Required empty public constructor
        fragmentB = new FragmentB();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment, container, false);

        //In the DialogFragment ('parent') get the child FragmentManager:
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.content,fragmentB,"")
                   .addToBackStack("")
                   .commit();
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public boolean handleMessage(Message msg) {
        return false;
    }
}
