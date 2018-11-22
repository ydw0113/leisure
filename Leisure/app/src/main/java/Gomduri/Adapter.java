package Gomduri;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.skhu.leisure.R;

import java.util.ArrayList;

import static net.skhu.leisure.R.layout.activity_gomduri_siseol;

public class Adapter extends PagerAdapter {
    private int[][] images = {{R.drawable.simli1, R.drawable.simli2, R.drawable.simli3},
            {R.drawable.spinning1, R.drawable.spinning2},
            {R.drawable.social1, R.drawable.social2, R.drawable.social3},
            {R.drawable.golf1, R.drawable.golf2, R.drawable.golf3}};
    private LayoutInflater inflater;
    private Context context;
    private int index = 0;
    private ViewPager viewPager;

    // 해당 context가 자신의 context 객체와 똑같이 되도록 생성자를 만듬
    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images[index].length;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);
    }

    // 각각의 item을 인스턴스 화
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //초기화
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        imageView.setImageResource(images[index][position]);

        container.removeView(v.findViewById(R.id.imageView));
        container.addView(v);
        return v;
    }

    public void notifyDataSetChanged(int i) {

        this.index = i;
        super.notifyDataSetChanged();
    }

    //할당을 해제
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);

        container.invalidate();
    }
    public void destroyItem(ViewGroup container) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        container.invalidate();
    }


    @Override
    public void startUpdate(@NonNull ViewGroup container) {
        super.startUpdate(container);
    }

    @Override
    public void finishUpdate(@NonNull ViewGroup container) {
        super.finishUpdate(container);
    }

}
