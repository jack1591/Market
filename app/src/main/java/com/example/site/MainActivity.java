package com.example.site;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,clr;
    CheckBox cb_r1,cb_r2,cb_r3,cb_l1,cb_l2,cb_l3;
    RadioButton sm,kur,dron;
    EditText kom;
    String ans="";

    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elements);

        cb_l1=findViewById(R.id.CB_L1);
        cb_l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.contains(cb_l1.getText().toString()+", ")){
                    String str=cb_l1.getText().toString()+", ";
                    ans=ans.replaceFirst(str,"");
                }
                else ans += (cb_l1.getText() + ", ");
            }
        });

        cb_l2=findViewById(R.id.CB_L2);
        cb_l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.contains(cb_l2.getText().toString()+", ")){
                    String str=cb_l2.getText().toString()+", ";
                    ans=ans.replaceFirst(str,"");
                }
                else ans += (cb_l2.getText() + ", ");
            }
        });

        cb_l3=findViewById(R.id.CB_L3);
        cb_l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.contains(cb_l3.getText().toString()+", ")){
                    String str=cb_l3.getText().toString()+", ";
                    ans=ans.replaceFirst(str,"");
                }
                else ans += (cb_l3.getText() + ", ");
            }
        });

        cb_r1=findViewById(R.id.CB_R1);
        cb_r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.contains(cb_r1.getText().toString()+", ")){
                    String str=cb_r1.getText().toString()+", ";
                    ans=ans.replaceFirst(str,"");
                }
                else ans += (cb_r1.getText() + ", ");
            }
        });

        cb_r2=findViewById(R.id.CB_R2);
        cb_r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.contains(cb_r2.getText().toString()+", ")){
                    String str=cb_r2.getText().toString()+", ";
                    ans=ans.replaceFirst(str,"");
                }
                else ans += (cb_r2.getText() + ", ");
            }
        });

        cb_r3=findViewById(R.id.CB_R3);
        cb_r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.contains(cb_r3.getText().toString()+", ")){
                    String str=cb_r3.getText().toString()+", ";
                    ans=ans.replaceFirst(str,"");
                }
                else ans += (cb_r3.getText() + ", ");
            }
        });

        /*sm=findViewById(R.id.RB_S);
        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!sm.isChecked())
                 sm.setChecked(true);
            }
        });

        kur=findViewById(R.id.RB_K);
        kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!kur.isChecked())
                    kur.setChecked(true);
            }
        });

        dron=findViewById(R.id.RB_D);
        dron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dron.isChecked())
                    dron.setChecked(true);
            }
        });
         */

        rg=findViewById(R.id.RG);
        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        kom=findViewById(R.id.KOM);
        kom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn = findViewById(R.id.Btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.length()>0)
                 Toast.makeText(MainActivity.this,ans.substring(0,ans.length()-2),Toast.LENGTH_SHORT).show();
            }
        });

        clr = findViewById(R.id.Clr);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cb_l1.setChecked(false);
                cb_l2.setChecked(false);
                cb_l3.setChecked(false);
                cb_r1.setChecked(false);
                cb_r2.setChecked(false);
                cb_r3.setChecked(false);

                rg.clearCheck();

                kom.getText().clear();
                ans="";
                Toast.makeText(MainActivity.this,"Корзина очищена",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
    }

    /*
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();

    }

     */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "На паузе", Toast.LENGTH_SHORT).show();
    }

    /*
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Не закрывайте нас, мы не умеем сохранять!", Toast.LENGTH_SHORT).show();

    }
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Мы не умеем сохранять!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart", Toast.LENGTH_SHORT).show();

    }
}