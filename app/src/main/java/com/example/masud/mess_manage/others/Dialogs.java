package com.example.masud.mess_manage.others;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.masud.mess_manage.R;

import java.util.Calendar;
import java.util.zip.Inflater;

public class Dialogs {
    public static void accountReceivable(final Activity activity){
        final Dialog dialog=new Dialog(activity);
        dialog.setContentView(R.layout.account_receiveble_dialoge);
        dialog.setTitle("Add deposit");
        dialog.show();

    }



    public static void accountPayable(final Activity activity){


    }
}
