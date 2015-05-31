package com.ricardo.project0;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyProjects extends ActionBarActivity {
    //used to help manage buttons colors
    int[] arrSetColor = new int[6];
    //button colors
    int orange =0xFFF08C35, red =0xcFFF0000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_projects);

        //instantiate buttons -- clickListener is set through layout file
        Button  bStreamer =  (Button)findViewById(R.id.button_streamer),
                bScores =  (Button)findViewById(R.id.button_scores),
                bLibrary =  (Button)findViewById(R.id.button_library),
                bBuild =  (Button)findViewById(R.id.button_buildIt),
                bReader =  (Button)findViewById(R.id.button_reader),
                bCapstone =  (Button)findViewById(R.id.button_capstone);


    }

    //click handler assigned to clickListener in layout file
    public void myClickHandler(View target){

        Toast toast = Toast.makeText(this, "", Toast.LENGTH_LONG);
        Button button;
        if(target.equals((Button)findViewById(R.id.button_streamer)))
        {
            button = (Button)findViewById(R.id.button_streamer);
            //change this button color to clicked color and make sure all other buttons remain with default color
            setBackGroundButtons(0);
            //display toast
            toast.makeText(this, "This button will launch "+button.getText(), Toast.LENGTH_SHORT).show() ;
        }
        if(target.equals((Button)findViewById(R.id.button_scores)))
        {
            button = (Button)findViewById(R.id.button_scores);
            setBackGroundButtons(1);

            toast.makeText(this, "This button will launch "+button.getText(), Toast.LENGTH_SHORT).show(); ;
        }
        if(target.equals((Button)findViewById(R.id.button_library)))
        {
            setBackGroundButtons(2);
            button = (Button)findViewById(R.id.button_library);

            toast.makeText(this, "This button will launch "+button.getText(), Toast.LENGTH_SHORT).show() ;
        }
        if(target.equals((Button)findViewById(R.id.button_buildIt)))
        {
            setBackGroundButtons(3);
            button = (Button)findViewById(R.id.button_buildIt);

            toast.makeText(this, "This button will launch "+button.getText(), Toast.LENGTH_SHORT).show() ;
        }
        if(target.equals((Button)findViewById(R.id.button_reader)))
        {
            setBackGroundButtons(4);
            button = (Button)findViewById(R.id.button_reader);

            toast.makeText(this, "This button will launch "+button.getText(), Toast.LENGTH_SHORT).show() ;
        }
        if(target.equals((Button)findViewById(R.id.button_capstone)))
        {
            setBackGroundButtons(5);
            button = (Button)findViewById(R.id.button_capstone);

            toast.makeText(this, "This button will launch "+button.getText(), Toast.LENGTH_SHORT).show() ;
        }


    }

    //method that manages buttons color once clicked
    void setBackGroundButtons(int clicked)
    {
        Button b;
        for(int i=0;i<6;i++)
        {
            arrSetColor[i] = 0;
        }
        arrSetColor[clicked] = 1;

        if(arrSetColor[0] == 1) {
            b = (Button) findViewById(R.id.button_streamer);
            b.setBackgroundColor(red);
        }
        else
        {
            b = (Button) findViewById(R.id.button_streamer);
            b.setBackgroundColor(orange);
        }

        if(arrSetColor[1] == 1) {
            b = (Button) findViewById(R.id.button_scores);
            b.setBackgroundColor(red);
        }
        else
        {
            b = (Button) findViewById(R.id.button_scores);
            b.setBackgroundColor(orange);
        }

        if(arrSetColor[2] == 1) {
            b = (Button) findViewById(R.id.button_library);
            b.setBackgroundColor(red);
        }
        else
        {
            b = (Button) findViewById(R.id.button_library);
            b.setBackgroundColor(orange);
        }

        if(arrSetColor[3] == 1) {
            b = (Button) findViewById(R.id.button_buildIt);
            b.setBackgroundColor(red);
        }
        else
        {
            b = (Button) findViewById(R.id.button_buildIt);
            b.setBackgroundColor(orange);
        }

        if(arrSetColor[4] == 1) {
            b = (Button) findViewById(R.id.button_reader);
            b.setBackgroundColor(red);
        }
        else
        {
            b = (Button) findViewById(R.id.button_reader);
            b.setBackgroundColor(orange);
        }

        if(arrSetColor[5] == 1) {
            b = (Button) findViewById(R.id.button_capstone);
            b.setBackgroundColor(red);
        }
        else
        {
            b = (Button) findViewById(R.id.button_capstone);
            b.setBackgroundColor(orange);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_projects, menu);
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
