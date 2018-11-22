package Gomduri;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import net.skhu.leisure.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Gomduri_siseol extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomduri_siseol);
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("심리운동실", "스피닝실", "사회문화교실", "골프연습장", "에어로빅실", "휘트니스실", "유아실", "미술실", "수영장", "재활체육실", "요가실", "체육관", "회의실", "장애인편의시설"));
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        final TextView textView = (TextView) findViewById(R.id.explanation);
        final TextView textView2 = (TextView)findViewById(R.id.sizeText);
        adapter2 = new Adapter(this);
        viewPager = (ViewPager) findViewById(R.id.imgPager);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        adapter2.notifyDataSetChanged(i);
                        textView2.setText("162㎡(49평) 규모 ");
                        textView.setText("- 전면 대형거울 설치,냉·난방 시설 완비,충격완화 바닥설계 \n- 심리운동프로그램 등에 활용");
                        break;
                    case 1:
                        adapter2.notifyDataSetChanged(i);
                        textView2.setText("66㎡(20평) 규모");
                        textView.setText("-실내싸이클과 음악, 댄스,조명이 함께하는 GX 프로그램 운영");
                        break;
                    case 2:
                        adapter2.notifyDataSetChanged(i);
                        textView2.setText("43㎡(13평) 규모  ");
                        textView.setText("-전자빔, 스크린 시설 완비 케이넥스, 종이접기, 음악활동 등에 활용");
                        break;
                    case 3:
                        adapter2.notifyDataSetChanged(i);
                        textView2.setText("골프 연습장 : 247.5 ㎡ (75평) 규모 / 스크린 골프장 : 49.5㎡ (15평) 규모 ");
                        textView.setText("- 10개의 연습타석 완비(장애인 타석 3개 항시운영) \n- 최신시설의 스크린 골프연습실 운영 - 프로골퍼 2명 상시대기 지도");
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                adapter2.instantiateItem(viewPager,0);
                textView2.setText("162㎡(49평) 규모 ");
                textView.setText("-전면 대형거울 설치, 냉·난방 시설 완비, 충격완화 바닥설계 \n- 심리운동프로그램 등에 활용");
            }
        });


        viewPager.setAdapter(adapter2);


    }
}