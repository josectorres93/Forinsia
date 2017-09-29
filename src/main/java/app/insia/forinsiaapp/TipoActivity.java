package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TipoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageButton formando = (ImageButton)findViewById(R.id.formandoBtn);
        ImageButton formador = (ImageButton)findViewById(R.id.formadorBtn);
        TextView formandotxt = (TextView)findViewById(R.id.formandoTxt);
        TextView formadortxt = (TextView)findViewById(R.id.formadorTxt);
        if(MainActivity.permission==1){
            formador.setVisibility(View.INVISIBLE);
            formadortxt.setVisibility(View.INVISIBLE);
        }
        if(MainActivity.permission==2){
            formando.setVisibility(View.INVISIBLE);
            formandotxt.setVisibility(View.INVISIBLE);
        }
        formando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),FormandoActivity.class));

            }
        });
        formador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),FormadorActivity.class));

            }
        });

    }

}
