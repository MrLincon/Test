package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText box1,box2,box3,box4,box5;
    CheckBox teacher,cr,student;

    Dialog popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        box5 = findViewById(R.id.box5);

//        box3.setVisibility(View.GONE);
//        box4.setVisibility(View.GONE);
//        box5.setVisibility(View.GONE);

        teacher = findViewById(R.id.teacher);
        cr = findViewById(R.id.cr);
        student = findViewById(R.id.student);

        popup = new Dialog(this);


        teacher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (teacher.isChecked()){

                    popup.setContentView(R.layout.popup_profile_info);
                    popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    LinearLayout select_routine = popup.findViewById(R.id.select_routine);
                    select_routine.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popup.dismiss();
                        }
                    });
                    ImageView close = popup.findViewById(R.id.close_popup);
                    close.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popup.dismiss();
                        }
                    });
                    TextView message = popup.findViewById(R.id.textView2);
                    message.setText("If you create your profile under this section, everyone will be able to see your profile under 'Teachers Panel'");
                    popup.show();

                    cr.setVisibility(View.GONE);
                    student.setVisibility(View.GONE);
                    box3.setVisibility(View.VISIBLE);
                }else{
                    cr.setVisibility(View.VISIBLE);
                    student.setVisibility(View.VISIBLE);
                    box3.setVisibility(View.GONE);
                }
            }
        });

        cr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cr.isChecked()){
                    popup.setContentView(R.layout.popup_profile_info);
                    popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    LinearLayout select_routine = popup.findViewById(R.id.select_routine);
                    select_routine.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popup.dismiss();
                        }
                    });
                    ImageView close = popup.findViewById(R.id.close_popup);
                    close.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popup.dismiss();
                        }
                    });
                    TextView message = popup.findViewById(R.id.textView2);
                    message.setText("If you create your profile under this section, everyone will be able to see your profile under 'CR's Panel'");
                    popup.show();

                    student.setVisibility(View.GONE);
                    teacher.setVisibility(View.GONE);
                    box3.setVisibility(View.GONE);
                    box4.setVisibility(View.VISIBLE);
                    box5.setVisibility(View.VISIBLE);
                }else{
                    student.setVisibility(View.VISIBLE);
                    teacher.setVisibility(View.VISIBLE);
                    box3.setVisibility(View.GONE);
                    box4.setVisibility(View.GONE);
                    box5.setVisibility(View.GONE);
                }
            }
        });

        student.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (student.isChecked()){
                    teacher.setVisibility(View.GONE);
                    cr.setVisibility(View.GONE);
                    box3.setVisibility(View.GONE);
                    box4.setVisibility(View.VISIBLE);
                    box5.setVisibility(View.VISIBLE);
                }else{
                    teacher.setVisibility(View.VISIBLE);
                    cr.setVisibility(View.VISIBLE);
                    box3.setVisibility(View.GONE);
                    box4.setVisibility(View.GONE);
                    box5.setVisibility(View.GONE);
                }
            }
        });
    }
}
