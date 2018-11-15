package net.skhu.leisure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import Gomduri.GomduriActivity;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        ListView listView = (ListView) findViewById(R.id.listview_sports);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==3) {
                    Intent intent = new Intent(getApplicationContext(), GomduriActivity.class);
                    startActivity(intent);
                }

            }
        });
    }

}