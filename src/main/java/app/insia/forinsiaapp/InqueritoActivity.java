package app.insia.forinsiaapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class InqueritoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.nxt1Btn);
        b.setOnClickListener(this);
         }
    @Override
    public void onClick(View v) {
       /* int id=v.getId();
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.inq1);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout;*/


    }
}