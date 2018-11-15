package Gomduri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.skhu.NaverMap.GomduriMap;
import net.skhu.leisure.R;

public class GomduriInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomduriinfo);
        final Button button1 = (Button)findViewById(R.id.btnmap);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GomduriMap.class);
                startActivity(intent);
            }
        });
    }

}
