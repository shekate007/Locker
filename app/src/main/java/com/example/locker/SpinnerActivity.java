package com.example.locker;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;

/**
 * Controls the spinner behavior, i.e. reacts to user's selection of an intem in MainActivity
 */
public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item is selected. You can retrieve the selected item using
        System.out.println("Selected: " + parent.getItemAtPosition(pos).toString());
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback.
    }
}
