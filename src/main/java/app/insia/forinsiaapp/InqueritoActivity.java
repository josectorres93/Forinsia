package app.insia.forinsiaapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * O questionário tem que ser dinamico
 * IMPORTANTE!! o web service tem que enviar as questões em json ou xml mas tem que enviar uma tag em cada pergunta que especifica
 * se é de escolha multipla ou de texto
 * O botão muda de pergunta mas o layout deve-se manter no mesmo
 * no fim do questionário deve voltar ao layout da acção
 */

public class InqueritoActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquerito);
        Button inq = findViewById(R.id.nxtBtn);
        inq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(v.getContext(), ADecorrerActivity.class));

            }
        });
    }
}