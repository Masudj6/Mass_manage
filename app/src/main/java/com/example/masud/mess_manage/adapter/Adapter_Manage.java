package com.example.masud.mess_manage.adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.masud.mess_manage.model.Person;
import com.example.masud.mess_manage.R;

import java.util.List;


public class Adapter_Manage extends RecyclerView.Adapter<Adapter_Manage.MyViewHolder>{

    private List<Person> personList;

    public Adapter_Manage(List<Person> friendList){
        this.personList =friendList;
    }
    @NonNull
    @Override
    public Adapter_Manage.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.personview_model, parent, false);

        return new MyViewHolder (itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Manage.MyViewHolder holder, int position) {
        Person person = personList.get(position);
      //holder.name.setText(person.getName());
        holder.cost.setText(""+person.getCost());
       //holder.image.setImageResource(person.getImage());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }


    public class MyViewHolder extends  RecyclerView.ViewHolder{
        public TextView name, cost;
        public ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.ivimage);
            name = (TextView) itemView.findViewById(R.id.tvname);
            cost = (TextView) itemView.findViewById(R.id.tvcost);


        }
    }
}
