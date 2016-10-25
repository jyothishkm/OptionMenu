package com.example.bridgeit.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main,menu);//Menu Resource, Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ToastMessage toast = new ToastMessage();
        switch (item.getItemId()) {

            case R.id.item1:
               toast.displayToast(MainActivity.this,item.getTitle().toString());
                break;

            case R.id.item2:
                toast.displayToast(MainActivity.this,item.getTitle().toString());
                break;

            case R.id.item3:
                toast.displayToast(MainActivity.this,item.getTitle().toString());
                break;

            case R.id.item4:
                toast.displayToast(MainActivity.this,item.getTitle().toString());
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
