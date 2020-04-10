package com.example.setgamestub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SetCardsFieldView cardsFieldView;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);

        Request req = Request.RegisterRequest("Petya");
        SetServerTask task = new SetServerTask(this);
        task.execute(req);
    }

}
