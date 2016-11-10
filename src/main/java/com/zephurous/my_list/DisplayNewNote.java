package com.zephurous.my_list;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class DisplayNewNote extends AppCompatActivity {

    static int count=0;
    static CheckBox[] cb = new CheckBox[1000];
    static EditText[] et = new EditText[1000];
    final String[] text = new String[1000];
    final int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_new_note);

        Intent intent = getIntent();

        cb[0] = (CheckBox) findViewById(R.id.checkbox1);
        et[0] = (EditText) findViewById(R.id.text1);

        Listener listen = new Listener();
        listen.Listen(et[0]);

        }
    };


//}
