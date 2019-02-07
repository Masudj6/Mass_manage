package com.example.masud.mess_manage.tab_Item;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.masud.mess_manage.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Feb extends Fragment {

    public  static  Feb newInstance(){
        return new Feb();
    }
    public Feb() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mar, container, false);
    }

}
