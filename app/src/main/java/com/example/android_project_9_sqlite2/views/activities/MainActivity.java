package com.example.android_project_9_sqlite2.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android_project_9_sqlite2.R;
import com.example.android_project_9_sqlite2.SQLiteHelper;
import com.example.android_project_9_sqlite2.models.Note;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("mySql", SQLiteHelper.builder(this).getDatabaseName());

        /*Note note = new Note();
        note.setNoteId(1);
        note.setTitle("title");
        note.setNote("no note");
        note.setDate("may 16");
        note.setTime("08 : 22");

        SQLiteHelper.builder(this).insertNote(note);*/

        /*ArrayList<Note> notes = SQLiteHelper.builder(this).getNotes();
        if (notes != null) {
            for (Note note : notes) {
                Log.i("", note.getTitle());
            }
        }*/

        Note note = new Note();
        note.setNoteId(2);
        note.setTitle("salw");
        note.setNote("is");
        note.setDate("may 16");
        note.setTime("08 : 22");

        SQLiteHelper.builder(this).updateNote(note);
        SQLiteHelper.builder(this).deleteNote(note);
    }
}