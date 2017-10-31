package app.insia.forinsiaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import app.insia.forinsiaapp.Modelo.Acao;

/**
 * Esta atividade lista as entidades disponiveis para o utilizador
 * A lista de entidades deve ser lida do web service
 * O utilizador selecciona uma para depois se logar
 */

public class EntidadesActivity extends AppCompatActivity {
    public String entidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entidades);
        final Spinner spinner = findViewById(R.id.entidadesSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.entidades, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        Button nxt=findViewById(R.id.entidadeBtn);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entidade = spinner.getSelectedItem().toString();
                startActivity(new Intent(v.getContext(),LoginActivity.class));
            }
        });
    }
}
