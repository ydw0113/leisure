package Gomduri;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import net.skhu.leisure.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

public class Tab extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        ArrayList<String> list1 =new ArrayList<String>(Arrays.asList("심리운동실","스피닝실","사회문화교실","골프연습장","에어로빅실","휘트니스실","유아실","미술실","수영장","재활체육실","요가실","체육관","회의실","장애인편의시설"));
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list1);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        final TextView textView = (TextView)findViewById(R.id.explanation);

        textView.setText("162㎡(49평) \\n 규모  - 전면 대형거울 설치, 냉·난방 시설 완비, \\n충격완화 바닥설계 - 심리운동프로그램 등에 활용");

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:adapter2.setimg(new int[] {R.drawable.simli1, R.drawable.simli2, R.drawable.simli3});
                    textView.setText("162㎡(49평) 규모  - 전면 대형거울 설치, 냉·난방 시설 완비, 충격완화 바닥설계 - 심리운동프로그램 등에 활용");break;
                    case 1:adapter2.setimg(new int[] {R.drawable.spinning1,R.drawable.spinning2,0});
                        textView.setText("66㎡(20평) 규모\n" +
                                "\n" +
                                "- 실내싸이클과 음악, 댄스, 조명이 함께하는 GX 프로그램 운영");break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                adapter2.setimg(new int[] {R.drawable.simli1, R.drawable.simli2, R.drawable.simli3});
                textView.setText("162㎡(49평) 규모  - 전면 대형거울 설치, 냉·난방 시설 완비, 충격완화 바닥설계 - 심리운동프로그램 등에 활용");
            }
        });


        viewPager = (ViewPager)findViewById(R.id.imgPager);
        adapter2 = new Adapter(this);
        viewPager.setAdapter(adapter2);
    }


}


