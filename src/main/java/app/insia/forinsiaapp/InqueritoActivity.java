package app.insia.forinsiaapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class InqueritoActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquerito);

        Button next=(Button)findViewById(R.id.nxt1Btn);
        Button prev1=(Button)findViewById(R.id.prev1Btn);



    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.inquerito_home);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout =null;
        switch(id){
            case R.id.nxt1Btn:
            //case R.id.prev1Btn:
                layout = inflater.inflate(R.layout.inquerito_2, null);
                mainLayout.removeAllViews();
                mainLayout.addView(layout);
                final Button pag2 = (Button) findViewById(R.id.nxt2Btn);
                pag2.setOnClickListener(this);

                break;
            case R.id.nxt2Btn:
                layout = inflater.inflate(R.layout.inquerito_2, null);
               mainLayout.removeAllViews();
                mainLayout.addView(layout);
                break;

        }
    }
}
