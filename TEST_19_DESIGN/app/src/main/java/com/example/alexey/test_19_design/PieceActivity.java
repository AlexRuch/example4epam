package com.example.alexey.test_19_design;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class PieceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piece);

        ListView lv = (ListView) findViewById(R.id.lvPiece);
        String[] tours = getResources().getStringArray(R.array.piece);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tours);
        lv.setAdapter(adapter);

        //Start working with Array

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        String wave_n =  getString(R.string.ninth_wave);
                        Intent wave = new Intent(PieceActivity.this, PieceInfoActivity.class);
                        wave.putExtra(PieceInfoActivity.PIECE_INFO, wave_n);
                        startActivity(wave);
                        break;
                    case 1:
                        Intent bogatirus = new Intent(PieceActivity.this, PieceInfoActivity.class);
                        bogatirus.putExtra(PieceInfoActivity.PIECE_INFO, R.string.bogatirus);
                        startActivity(bogatirus);
                        break;
/*                    case 2:
                        Intent bears = new Intent(PieceActivity.this, PieceInfoActivity.class);
                        bears.putExtra(PieceInfoActivity.PIECE_INFO, R.string.bears);
                        startActivity(bears);
                        break;
                    case 3:
                        Intent mona = new Intent(PieceActivity.this, PieceInfoActivity.class);
                        mona.putExtra(PieceInfoActivity.PIECE_INFO, R.string.mona);
                        startActivity(mona);
                        break;
 */                   }
                }


        });



        //End working with Array
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_piece, menu);
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
