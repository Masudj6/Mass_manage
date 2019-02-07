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
public class Jan extends Fragment {


    public  static  Jan newInstance(){
        return new Jan();
    }

   /* public static HomeFragment newInstance() {
        return new HomeFragment();
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mar, container, false);
    }

}
