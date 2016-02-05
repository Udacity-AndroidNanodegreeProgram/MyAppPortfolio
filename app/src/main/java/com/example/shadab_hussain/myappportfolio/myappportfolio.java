package com.example.shadab_hussain.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class myappportfolio extends AppCompatActivity {
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myappportfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Thanks for enrolling me in this course.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void toastmessage(View view) {
        Button button;
        final String text = "This button will launch ";
        String msg = null;
        switch (view.getId()) {
            case R.id.spotifystreamer:
                button = (Button) relativeLayout.findViewById(R.id.spotifystreamer);
                msg = text + button.getText().toString();
                break;
            case R.id.scoresapp:
                button = (Button) relativeLayout.findViewById(R.id.scoresapp);
                msg = text + button.getText().toString();
                break;
            case R.id.libraryapp:
                button = (Button) relativeLayout.findViewById(R.id.libraryapp);
                msg = text + button.getText().toString();
                break;
            case R.id.builditbigger:
                button = (Button) relativeLayout.findViewById(R.id.builditbigger);
                msg = text + button.getText().toString();
                break;
            case R.id.xyzreader:
                button = (Button) relativeLayout.findViewById(R.id.xyzreader);
                msg = text + button.getText().toString();
                break;
            case R.id.capstone:
                button = (Button) relativeLayout.findViewById(R.id.capstone);
                msg = text + button.getText().toString();
                break;
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_myappportfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
