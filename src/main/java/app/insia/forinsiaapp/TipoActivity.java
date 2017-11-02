package app.insia.forinsiaapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Esta atividade tem o propósito de selecionar o tipo de utilizador que se vai ligar (formador ou formando)
 * O web service deve verificar na base de dados quais o perfis que o utilizador tem acesso
 * Existem casos em que o utilizador tem acesso aos 2 perfis
 */

public class TipoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo);
        Toolbar toolbar = findViewById(R.id.toolbar);
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

                finish();
                startActivity(new Intent(v.getContext(),FormandoActivity.class));

            }
        });
        formador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(v.getContext(),FormadorActivity.class));

            }
        });

    }



    }