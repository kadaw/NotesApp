package com.example.user.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.user.notes.AddNewNote.TEST_TAG;

public class NoteList extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
        ListView listView;
        ArrayAdapter adapter;
        Button addNewNote;
        ArrayList<NoteInlist> myNoteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

    initListView();

        addNewNote = (Button) findViewById(R.id.b_add_new_note);
        addNewNote.setOnClickListener(this);



}
    private void initListView(){
        myNoteList = new ArrayList<>();
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));
        myNoteList.add(new NoteInlist("qqq", "wwww"));

        adapter = new NoteAdapter(this, R.layout.item_note, myNoteList);
        listView = (ListView) findViewById(R.id.lv_notes_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    public void onClick(View v){
        Intent my_intent = new Intent(this, AddNewNote.class);
        startActivity(my_intent);
    }
    public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                            long id) {
        Intent my_intent = new Intent(this, Note.class);
        myNoteList.get(position);

        my_intent.putExtra("my_text", myNoteList.get(position).header);
        my_intent.putExtra("new_note", myNoteList.get(position).inf);

    startActivity(my_intent);


    }

    protected void onResume() {
        super.onResume();
        Log.d(TEST_TAG, "onResume()");



    }


}
