package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
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
        ImageButton formando = findViewById(R.id.formandoBtn);
        ImageButton formador = findViewById(R.id.formadorBtn);
        TextView formandotxt = findViewById(R.id.formandoTxt);
        TextView formadortxt = findViewById(R.id.formadorTxt);
        if(MainActivity.logged.getPermissao()==1){
            formador.setVisibility(View.INVISIBLE);
            formadortxt.setVisibility(View.INVISIBLE);
            formando.setVisibility(View.VISIBLE);
            formandotxt.setVisibility(View.VISIBLE);
        }
        if(MainActivity.logged.getPermissao()==2){
            formando.setVisibility(View.INVISIBLE);
            formandotxt.setVisibility(View.INVISIBLE);
            formador.setVisibility(View.VISIBLE);
            formadortxt.setVisibility(View.VISIBLE);
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