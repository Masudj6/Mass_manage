package com.example.masud.mess_manage.tab_Item;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.masud.mess_manage.R;


public class ReleaseFragment extends Fragment {

    private Context context;



    public static final String TITLE = "NEW RELEASE";

    public static ReleaseFragment newInstance() {
        return new ReleaseFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mar, container, false);

        return view;
    }


}