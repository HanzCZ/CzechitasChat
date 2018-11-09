package com.czechitast.janhanak.mojeprvniappka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //zmacknuNaTlacitko();
                EditText myName = findViewById(R.id.my_name);
                String name = myName.getText().toString();
                startChat(name);
            }
        });
    }

    public void zmacknuNaTlacitko() {
        //Toast.makeText(this, "Zmackla jsem na tlacitko", Toast.LENGTH_LONG).show();
    }

    public void startChat(String name) {
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra(Constants.USER_NAME,name);
        startActivity(intent);
    }
}
