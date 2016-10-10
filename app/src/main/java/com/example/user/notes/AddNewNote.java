package com.example.user.notes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;



public class AddNewNote extends AppCompatActivity {
    final static String TEST_TAG = "TEST_TAG";
    Button startButton;
    EditText textField;
    EditText newNote;
    TextView header;
    CheckBox cbBox;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_note);
        Log.d(TEST_TAG, "onCreate()");
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        cbBox = (CheckBox) findViewById(R.id.ch_checkbox);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TEST_TAG, "onResume()");
        bindViews();


    }

    private void bindViews() {
        startButton = (Button) findViewById(R.id.b_start);
        textField = (EditText) findViewById(R.id.et_mytext);
        newNote = (EditText) findViewById(R.id.et_new_note);
        header = (TextView) findViewById(R.id.tv_header);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getWindow().getContext(), Note.class);

                myIntent.putExtra("my_text", textField.getText().toString());
                myIntent.putExtra("new_note", newNote.getText().toString());
                if(cbBox.isChecked()){
                    myIntent.putExtra("tv_important", "Важная".toString());
                }
                else{
                    myIntent.putExtra("tv_important", "Не важная".toString());

                }
                startActivity(myIntent);
            }
        });
    }


    @Override
    protected void onStop() {
        super.onStop();// ATTENTION: This was auto-generated to implement the App Indexing API.
// See https://g.co/AppIndexing/AndroidStudio for more information.
        Log.d(TEST_TAG, "onStop()");
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TEST_TAG, "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TEST_TAG, "onPause()");
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
*/

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }
}
