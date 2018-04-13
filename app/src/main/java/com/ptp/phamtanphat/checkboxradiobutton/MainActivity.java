package com.ptp.phamtanphat.checkboxradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ckAndroid, ckiOS, ckPhp;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        ckAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ckiOS.setEnabled(false);
                    ckPhp.setEnabled(false);
                } else {
                    ckiOS.setEnabled(true);
                    ckPhp.setEnabled(true);
                    Toast.makeText(MainActivity.this, "Bo check", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ckPhp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ckAndroid.setEnabled(false);
                    ckiOS.setEnabled(false);
                } else {
                    ckAndroid.setEnabled(true);
                    ckiOS.setEnabled(true);
                    Toast.makeText(MainActivity.this, "Bo check", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ckiOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ckAndroid.setEnabled(false);
                    ckPhp.setEnabled(false);
                } else {
                    ckAndroid.setEnabled(true);
                    ckPhp.setEnabled(true);
                    Toast.makeText(MainActivity.this, "Bo check", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radiobuttonJava:
                        Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radiobuttonJavaScript:
                        Toast.makeText(MainActivity.this, "Java Script", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radiobuttonPython:
                        Toast.makeText(MainActivity.this, "Python", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


    }

    private void anhxa() {
        ckAndroid = findViewById(R.id.checkboxAndroid);
        ckiOS = findViewById(R.id.checkboxiOS);
        ckPhp = findViewById(R.id.checkboxPHP);
        radioGroup = findViewById(R.id.radiogroup);
    }
}
