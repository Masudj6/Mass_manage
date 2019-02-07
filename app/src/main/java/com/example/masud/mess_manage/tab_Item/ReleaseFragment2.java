package com.example.masud.mess_manage.tab_Item;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.masud.mess_manage.Dialoge.Dailoge_date_time;
import com.example.masud.mess_manage.adapter.Adapter_Manage;
import com.example.masud.mess_manage.model.Person;
import com.example.masud.mess_manage.R;
import com.example.masud.mess_manage.others.Dialogs;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ReleaseFragment2 extends Fragment implements View.OnClickListener {

    private Context context;
    DatePickerDialog.OnDateSetListener mDateSetListener;
    float minteger = (float) 0.0;
    public List<Person> personList = new ArrayList<>();
    public RecyclerView recyclerView;
    public Adapter_Manage mAdapter;
    private View view;
    FloatingActionMenu floatingActionMenu;
    FloatingActionButton expence, diposit, member, payable;
    String[] memberarray;
    Spinner spinner;
    //GridView gridview;
    //FloatingActionMenu materialDesignFAM;
    //FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4, floatingActionButton5, floatingActionButton6;

  /*  public static String[] osNameList = {
            "Total mill",
            "Total cost",
            "Total member",
    };
    public static int[] osImages = {
            R.drawable.account,
            R.drawable.costtt,
            R.drawable.account,};*/

    public static final String TITLE = "NEW RELEASE";

    public static ReleaseFragment2 newInstance() {
        return new ReleaseFragment2();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_mar, container, false);


        ini();
        memberarray = getResources().getStringArray(R.array.memberName);   

        mAdapter = new Adapter_Manage(personList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        //gridview = (GridView) view.findViewById(R.id.gridviewId);
        //gridview.setAdapter(new CustomAdapter(getContext(), osNameList, osImages));

        preparePerson();




/*        //.................................
        materialDesignFAM=view.findViewById(R.id.social_floating_menu);
        //materialDesignFAM = (FloatingActionMenu)view.findViewById(R.id.social_floating_menu);
        floatingActionButton1 = (FloatingActionButton)view.findViewById(R.id.floating_facebook);
        floatingActionButton2 = (FloatingActionButton)view.findViewById(R.id.floating_twitter);
       *//* floatingActionButton3 = (FloatingActionButton)view.findViewById(R.id.floating_linkdin);
        floatingActionButton4 = (FloatingActionButton)view.findViewById(R.id.floating_google_plus);
        floatingActionButton5 = (FloatingActionButton)view.findViewById(R.id.floating_instagram);*//*
        floatingActionButton6 = (FloatingActionButton)view.findViewById(R.id.floating_youtube);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                Intent facebookIntent = getOpenFacebookIntent(getContext());
                startActivity(facebookIntent);

            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
                Intent twitterIntent = getOpenTwitterIntent(getContext());
                startActivity(twitterIntent);

            }
        });
       *//* floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked
                Intent linkdinIntent = getOpenLinkdinIntent(getContext());
                startActivity(linkdinIntent);
            }
        });

        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                Intent googleplusIntent = getOpenGPlusIntent(getContext());
                startActivity(googleplusIntent);
            }
        });
        floatingActionButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
                Intent instagramIntent = getOpenInstagramIntent(getContext());
                startActivity(instagramIntent);
            }
        });*//*
        floatingActionButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked
                Intent youtubeIntent = getOpenYouTubeIntent(getContext());
                startActivity(youtubeIntent);
            }
        });*/

        //..................................


        return view;

    }

    private void ini() {

        floatingActionMenu = view.findViewById(R.id.floatingActionMenu);
        payable = view.findViewById(R.id.floatingActionPayable);
        diposit = view.findViewById(R.id.floatingActionDeposit);
        expence = view.findViewById(R.id.floatingActionExpense);
        member = view.findViewById(R.id.floatingActionMember);
        recyclerView = view.findViewById(R.id.rvlist);

        payable.setOnClickListener(this);
        diposit.setOnClickListener(this);
        expence.setOnClickListener(this);
        member.setOnClickListener(this);


    }


   /* public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/376227335860239")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/karthikofficialpage")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenTwitterIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.twitter.android", 0); //Checks if Twitter is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/drkarthiik")); //Trys to make intent with Twitter's's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/drkarthiik")); //catches and opens a url to the desired page
        }
    }*/

    /*public static Intent getOpenLinkdinIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.linkedin.android", 0); //Checks if Linkdin is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/karthikm128")); //Trys to make intent with Linkdin's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/karthikm128")); //catches and opens a url to the desired page
        }
    }*/

  /*  public static Intent getOpenGPlusIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.apps.plus", 0); //Checks if G+ is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/+KarthikM128")); //Trys to make intent with G+'s URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/+KarthikM128")); //catches and opens a url to the desired page
        }
    }*/

   /* public static Intent getOpenInstagramIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.instagram.android", 0); //Checks if Instagram is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/accounts/login/")); //Trys to make intent with Instagram's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/accounts/login/")); //catches and opens a url to the desired page
        }
    }*/

    /*public static Intent getOpenYouTubeIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.youtube", 0); //Checks if YT is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/karthikm128")); //Trys to make intent with YT's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/karthikm128")); //catches and opens a url to the desired page
        }
    }*/


    private void preparePerson() {
        Person person = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person);
        Person person1 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person1);
        Person person2 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person2);
        Person person3 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person3);
        Person person4 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person4);
        Person person5 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person5);
        Person person6 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person6);
        Person person7 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person7);
        Person person8 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person8);
        Person person9 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person9);
        Person person10 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person10);
        Person person11 = new Person(R.drawable.ic_account_circle_black_24dp, "Jone", 600);
        personList.add(person11);

        // mAdapter.notifyDataSetChanged();
        mAdapter.notifyDataSetChanged();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.floatingActionPayable:

                AlertDialog.Builder mBilder = new AlertDialog.Builder(getContext());
                View view1 = getLayoutInflater().inflate(R.layout.account_receiveble_dialoge, null);
                mBilder.setTitle("Diposit");
                final Spinner mSpiner = view1.findViewById(R.id.sp_member);
                final TextView selectdate1 = view1.findViewById(R.id.tv_selectDate);
                final TextView cancel3 = view1.findViewById(R.id.bt_cancel);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.memberName));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpiner.setAdapter(adapter);

                selectdate1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Calendar cal = Calendar.getInstance();
                        int year = cal.get(Calendar.YEAR);
                        int month = cal.get(Calendar.MONTH);
                        int day = cal.get(Calendar.DAY_OF_MONTH);

                        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                                android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateSetListener, year, month, day);
                        datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        datePickerDialog.show();
                    }
                });

                mDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month + 1;
                        String date = month + "/" + day + "/" + year;
                        selectdate1.setText(date);
                    }
                };

                mBilder.setView(view1);
                final AlertDialog dialog = mBilder.create();
                dialog.show();

                cancel3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                break;

            case R.id.floatingActionDeposit:
                AlertDialog.Builder dBilder = new AlertDialog.Builder(getContext());
                View view2 = getLayoutInflater().inflate(R.layout.account_receiveble_dialoge, null);
                dBilder.setTitle("Diposit");
                final TextView cancel2 = view2.findViewById(R.id.bt_cancel);
                final Spinner dSpiner = view2.findViewById(R.id.sp_member);
                final TextView selectdate = view2.findViewById(R.id.tv_selectDate);

                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.memberName));
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                dSpiner.setAdapter(adapter2);

                selectdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Calendar cal = Calendar.getInstance();
                        int year = cal.get(Calendar.YEAR);
                        int month = cal.get(Calendar.MONTH);
                        int day = cal.get(Calendar.DAY_OF_MONTH);

                        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                                android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateSetListener, year, month, day);
                        datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        datePickerDialog.show();
                    }
                });

                mDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month + 1;
                        String date = month + "/" + day + "/" + year;
                        selectdate.setText(date);
                    }
                };


                dBilder.setView(view2);
                final AlertDialog dialog2 = dBilder.create();
                dialog2.show();

                cancel2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog2.dismiss();
                    }
                });

                break;

            case R.id.floatingActionExpense:

                AlertDialog.Builder eBilder = new AlertDialog.Builder(getContext());
                final View view3 = getLayoutInflater().inflate(R.layout.expense_dialoge, null);
                eBilder.setTitle("Expense");
                final TextView cancel = view3.findViewById(R.id.bt_cancel);
                final TextView selectdate2 = view3.findViewById(R.id.tv_selectDate);


                selectdate2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Calendar cal = Calendar.getInstance();
                        int year = cal.get(Calendar.YEAR);
                        int month = cal.get(Calendar.MONTH);
                        int day = cal.get(Calendar.DAY_OF_MONTH);

                        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                                android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateSetListener, year, month, day);
                        datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        datePickerDialog.show();
                    }
                });

                mDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month + 1;
                        String date = month + "/" + day + "/" + year;
                        selectdate2.setText(date);
                    }
                };

                eBilder.setView(view3);
                final AlertDialog dialog3 = eBilder.create();
                dialog3.show();

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog3.dismiss();
                    }
                });

                break;

            case R.id.floatingActionMember:
                AlertDialog.Builder aBilder = new AlertDialog.Builder(getContext());
                View view4 = getLayoutInflater().inflate(R.layout.add_mill_dialoge, null);
                aBilder.setTitle("Add mill");
                final Spinner aSpiner = view4.findViewById(R.id.sp_member);
                final TextView selectdate4 = view4.findViewById(R.id.tv_selectDate);

                final TextView displayInteger = view4.findViewById(R.id.integer_number);
                final TextView cancel4 = view4.findViewById(R.id.bt_cancel);
                final TextView increse = view4.findViewById(R.id.increase);
                final TextView dicrese = view4.findViewById(R.id.decrease);

                final TextView save = view4.findViewById(R.id.bt_save);

                ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.memberName));
                adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                aSpiner.setAdapter(adapter4);

                selectdate4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Calendar cal = Calendar.getInstance();
                        int year = cal.get(Calendar.YEAR);
                        int month = cal.get(Calendar.MONTH);
                        int day = cal.get(Calendar.DAY_OF_MONTH);

                        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                                android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateSetListener, year, month, day);
                        datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        datePickerDialog.show();
                    }
                });

                mDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month + 1;
                        String date = month + "/" + day + "/" + year;
                        selectdate4.setText(date);
                    }
                };

                increse.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        minteger = (float) (minteger + .5);
                        display(minteger);
                    }

                    private void display(float number) {
                        displayInteger.setText(" " + number);
                    }
                });
                dicrese.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (minteger==-.5){
                            minteger= (float) 0.0;
                            display(minteger);

                        }else {
                            minteger = (float) (minteger - .5);
                        }
                        display(minteger);
                    }

                    private void display(float number) {
                        displayInteger.setText(" " + number);
                    }
                });


                aBilder.setView(view4);
                final AlertDialog dialog4 = aBilder.create();
                dialog4.show();

                cancel4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog4.dismiss();
                    }
                });


                break;
        }
    }
}
