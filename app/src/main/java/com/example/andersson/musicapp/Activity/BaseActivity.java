package com.example.andersson.musicapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.andersson.musicapp.Instrument.AbstractInstrumentThread;
import com.example.andersson.musicapp.R;
import com.example.andersson.musicapp.SharedResources.ThreadHolder;

import java.util.HashMap;
import java.util.Map;

public class BaseActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();

        ThreadHolder holder = ThreadHolder.getInstance();
        HashMap<String,Thread> map = holder.getThreads();

        for(Map.Entry thread : map.entrySet()){

            try {
                ((AbstractInstrumentThread)thread.getValue()).setPlayRealTime(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void onResume() {
        super.onResume();

        ThreadHolder holder = ThreadHolder.getInstance();
        HashMap<String,Thread> map = holder.getThreads();

        for(Map.Entry thread : map.entrySet()){

            try {
                ((AbstractInstrumentThread)thread.getValue()).setPlayRealTime(false);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
