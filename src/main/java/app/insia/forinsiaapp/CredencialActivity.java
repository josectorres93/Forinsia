package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class CredencialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credencial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button enter = (Button)findViewById(R.id.keyBtn);
        final EditText ck= (EditText)findViewById(R.id.credencialKeyEdt);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key= ck.getText().toString();
                if(key.equals("1")){
                    MainActivity.permission=1;
                    startActivity(new Intent(v.getContext(), TipoActivity.class));
                }else if(key.equals("2")){
                    MainActivity.permission=2;
                    startActivity(new Intent(v.getContext(), TipoActivity.class));
                }else if(key.equals("3")){
                    MainActivity.permission=3;
                    startActivity(new Intent(v.getContext(), TipoActivity.class));
                }

            }});

    }


}
