package com.example.alexey.test_19_design;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("home");
        tabSpec.setIndicator("", getResources().getDrawable(R.drawable.home));
        tabSpec.setContent(new Intent(this, HomeActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tours");
        tabSpec.setIndicator("Tours");
        tabSpec.setContent(new Intent(this, ToursActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("expo");
        tabSpec.setIndicator("Expo");
        tabSpec.setContent(new Intent(this, ExpoActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("piece");
        tabSpec.setIndicator("Piece");
        tabSpec.setContent(new Intent(this, PieceActivity.class));
        tabHost.addTab(tabSpec);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
