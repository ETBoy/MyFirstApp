package com.example.lsx.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Intent intent=new Intent(MainActivity.this,Second_Activity.class);
              Intent intent=new Intent("com.example.lsx.Test");
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id)
        {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "Haha!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.OpenFile:
                Toast.makeText(MainActivity.this, "You Click OpenFile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.SaveFile:
                Toast.makeText(MainActivity.this, "You Click SaveFile", Toast.LENGTH_SHORT).show();
            break;
            case R.id.Test:
                Toast.makeText(MainActivity.this, "You Click Test", Toast.LENGTH_SHORT).show();
            break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}
