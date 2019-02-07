package com.example.masud.mess_manage.tab_Item;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.masud.mess_manage.adapter.Adapter_Manage;
import com.example.masud.mess_manage.model.Person;
import com.example.masud.mess_manage.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Mar extends Fragment {


    public Mar() {
        // Required empty public constructor
    }
    public List<Person> personList = new ArrayList<>();
    public RecyclerView recyclerView;
    public Adapter_Manage mAdapter;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_mar, container, false);



        recyclerView=view.findViewById(R.id.rvlist);

        mAdapter = new Adapter_Manage(personList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparePerson();

        return view;
    }

    private void preparePerson() {
        Person person=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person);
        Person person1=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person1);
        Person person2=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person2);
        Person person3=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person3);
        Person person4=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person4);
        Person person5=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person5);
        Person person6=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person6);
        Person person7=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person7);
        Person person8=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person8);
        Person person9=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person9);
        Person person10=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person10);
        Person person11=new Person(R.drawable.ic_account_circle_black_24dp,"Jone",600);
        personList.add(person11);

        // mAdapter.notifyDataSetChanged();
        mAdapter.notifyDataSetChanged();

    }

}
