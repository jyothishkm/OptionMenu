package com.example.bridgeit.optionmenu;


import android.content.Context;
import android.widget.Toast;

/**
 * Created by bridgeit on 25/10/16.
 */

public class ToastMessage {
    public void displayToast(Context context,String item) {
        Toast.makeText(context,item, android.widget.Toast.LENGTH_SHORT).show();
    }
}
