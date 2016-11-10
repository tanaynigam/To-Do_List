package com.zephurous.my_list;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Tanay on 11/6/2016.
 */

public class Listener extends DisplayNewNote {
        public void Listen(EditText et){

            et.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.toString().length()>0) {
                        LinearLayout Lay = (LinearLayout) findViewById(R.id.Layout);
                        CheckBox cb = new CheckBox(getBaseContext());
                        cb.setId(i);
                        EditText et = new EditText(getBaseContext());
                        et.setId(i);
                        Lay.addView(cb);
                        Lay.addView(et);
                        count++;
                        et.clearFocus();

                        /*com.zephurous.my_list.Listener work = new com.zephurous.my_list.Listener();
                        work.Listen(et);*/

                    } else if (s.toString().length() == 0) {

                    }
                }


            });
        }
}
