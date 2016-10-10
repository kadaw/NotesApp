package com.example.user.notes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Note extends AppCompatActivity {
    EditText myText;
    EditText newNote;
    Button backButton;
    TextView tvImportant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        bindViews();
        myText.setText(getIntent().getExtras().getString("my_text"));
        newNote .setText(getIntent().getExtras().getString("new_note"));
       tvImportant.setText(getIntent().getExtras().getString("tv_important"));

    }
    private void bindViews() {
        tvImportant = (TextView) findViewById(R.id.tv_important);
        myText = (EditText) findViewById(R.id.tv_my_text);
        newNote = (EditText) findViewById(R.id.tv_note);
        backButton = (Button) findViewById(R.id.b_back);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent myIntent = new Intent(getWindow().getContext(), NoteList.class);

              startActivity(myIntent);
     }
     });
    }
}
