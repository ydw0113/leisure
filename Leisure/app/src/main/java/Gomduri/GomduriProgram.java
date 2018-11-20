package Gomduri;

import android.app.TabActivity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.Toast;

import net.skhu.leisure.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GomduriProgram extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost tabHost = getTabHost();
        LayoutInflater.from(this).inflate(R.layout.activity_gomduriprogram,
                tabHost.getTabContentView(), true);

        tabHost.addTab(tabHost.newTabSpec("tab1")
                .setIndicator("성인수영")
                .setContent(R.id.view1));
        tabHost.addTab(tabHost.newTabSpec("tab3")
                .setIndicator("심리운동,치료미술,치료음악")
                .setContent(R.id.view2));
        tabHost.addTab(tabHost.newTabSpec("tab3")
                .setIndicator("유아,어린이,청소년수영")
                .setContent(R.id.view3));
    }

}