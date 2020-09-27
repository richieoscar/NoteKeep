package com.example.notekeep;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.example.note.ORIGINAL_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.example.note.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "come.example.note.ORIGINAL_NOTE_TEXT";

    public String mOriginalCourseId;
    public String mOriginalCourseTitle;
    public String mOriginalNoteText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID,mOriginalCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalCourseTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);

    }

    public void restoreState(Bundle inState){
        mOriginalCourseId= inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalCourseTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }
}

