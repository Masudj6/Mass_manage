package com.example.masud.mess_manage.Dialoge;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.masud.mess_manage.R;

public class Dailoge_date_time extends Dialog {

    public Activity c;
    private DatePicker datePicker;
    private final String TAG = "date_timePickerDialog";
    private Spinner spinner;
    String[] memberName;
    private TextView tvsample;

    public Dailoge_date_time(Activity a) {
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.account_receiveble_dialoge);

        spinner.findViewById(R.id.sp_member);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(),R.array.memberName,R.layout.spinner_sample_view);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(adapter);

    }
}