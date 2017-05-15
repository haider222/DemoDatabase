package com.example.l400.demodatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText name,password,contact,country;
    Button insert;
    String n,p,con,coun;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        contact = (EditText)findViewById(R.id.contact);
        country = (EditText)findViewById(R.id.country);
        insert = (Button)findViewById(R.id.insert);
    }
    public void regusers(View view){
        n = name.getText().toString();
        p = password.getText().toString();
        con = contact.getText().toString();
        coun = country.getText().toString();
        String method = "register";
        Dobackgroundtask dobackground = new Dobackgroundtask(this);
        dobackground.execute(method,n,p,con,coun);
        finish();
       // Toast.makeText(Main2Activity.this, "hi", Toast.LENGTH_SHORT).show();
    }
}
