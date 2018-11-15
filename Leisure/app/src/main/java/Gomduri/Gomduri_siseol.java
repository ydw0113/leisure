package Gomduri;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import net.skhu.leisure.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Gomduri_siseol extends AppCompatActivity {
    private ArrayList<String> mGroupList = null;
    private ArrayList<ArrayList<Integer>> mChildList = null;
    private ArrayList<Integer> mChildListContent = null;
    private ExpandableListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomduri_siseol);
        setLayout();

        ArrayList<String> list1 =new ArrayList<String>(Arrays.asList("심리운동실","스피닝실","사회문화교실","골프연습장","에어로빅실","휘트니스실","유아실","미술실","수영장","재활체육실","요가실","체육관","회의실","장애인편의시설"));
        ArrayList<Integer> list2= new ArrayList<Integer>(Arrays.asList(R.drawable.simli1,R.drawable.simli2,R.drawable.simli3));
        ArrayList<Integer> list3= new ArrayList<Integer>(Arrays.asList(R.drawable.spinning1,R.drawable.spinning2));

        mGroupList = list1;
        mChildList = new ArrayList<ArrayList<Integer>>();
        mChildListContent = list2;


        mChildList.add(list2);
        mChildList.add(list3);

        mListView.setAdapter(new BaseExpandableAdapter(this, mGroupList, mChildList));

        mListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                    Toast.makeText(getApplicationContext(), "g click = " + groupPosition, Toast.LENGTH_SHORT).show();
                    return false;
            }
        });


        mListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(getApplicationContext(), "c click = " + childPosition,
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        mListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(), "g Collapse = " + groupPosition,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(), "g Expand = " + groupPosition,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setLayout(){
        mListView = (ExpandableListView)findViewById(R.id.ListView);
    }
}