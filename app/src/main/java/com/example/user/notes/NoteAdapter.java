package com.example.user.notes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 03.10.2016.
 */

public class NoteAdapter extends ArrayAdapter {
    Activity activity;
    int resource;
    List list;


    public NoteAdapter(Context context, int resource, List objects) {


        super(context, resource, objects);
        activity = (Activity) context;
        this.resource = resource;
        list = objects;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder;
        if(convertView==null){
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(resource, null);

            viewHolder = new ViewHolder();

            viewHolder.headerTextView = (TextView) convertView.findViewById(R.id.tv_note_header);
            viewHolder.infTextView = (TextView) convertView.findViewById(R.id.tv_note_inf);

            NoteInlist selectedNote = (NoteInlist) list.get(position);

            viewHolder.headerTextView.setText(selectedNote.header);
            viewHolder.infTextView.setText(selectedNote.inf);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        return convertView;
    }

    class ViewHolder{
        TextView headerTextView;
        TextView infTextView;

    }


}
