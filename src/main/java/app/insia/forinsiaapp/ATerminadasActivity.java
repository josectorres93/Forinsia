package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Esta atividade corresponde apenas as acções terminadas
 * O web service deve devolver todas as acções terminadas do formador/formando que se encontra logado
 * Neste momento estão criados 3 textViews mas deverão ser criados mais dependendo do número de acções que um utlizador tem (um
 * formador normalmente tem muitas acções)
 * O utilizador entra na acção ao pressionar no título da mesma
 * Neste momento os dados são criados na aplicação mas devem ser lidos do web service e da base de dados
 */

public class ATerminadasActivity extends AppCompatActivity {
    static int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aterminadas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView n11 =findViewById(R.id.n11);
        TextView n22 =findViewById(R.id.n22);
        TextView n33 =findViewById(R.id.n33);
        TextView d11 =findViewById(R.id.d11);
        TextView d22 =findViewById(R.id.d22);
        TextView d33 =findViewById(R.id.d33);
        TextView l11 =findViewById(R.id.l11);
        TextView l22 =findViewById(R.id.l22);
        TextView l33 =findViewById(R.id.l33);
        int i= MainActivity.logged.getAcoes().size();
        for(int j=0;j<i;j++){
            if(j==0){
                if(MainActivity.logged.getAcoes().get(j).getTerminada()==1) {
                    n11.setText("" + MainActivity.logged.getAcoes().get(j).getNome());
                    d11.setText("" + MainActivity.logged.getAcoes().get(j).getDatainicio());
                    l11.setText("" + MainActivity.logged.getAcoes().get(j).getLocalidade());
                    n11.setVisibility(View.VISIBLE);
                    d11.setVisibility(View.VISIBLE);
                    l11.setVisibility(View.VISIBLE);
                }
            }
            if(j==1){
                if(MainActivity.logged.getAcoes().get(j).getTerminada()==1) {
                    n22.setText("" + MainActivity.logged.getAcoes().get(j).getNome());
                    d22.setText("" + MainActivity.logged.getAcoes().get(j).getDatainicio());
                    l22.setText("" + MainActivity.logged.getAcoes().get(j).getLocalidade());
                    n22.setVisibility(View.VISIBLE);
                    d22.setVisibility(View.VISIBLE);
                    l22.setVisibility(View.VISIBLE);
                }
            }
            if(j==2) {
                if (MainActivity.logged.getAcoes().get(j).getTerminada() == 1) {
                    n33.setText("" + MainActivity.logged.getAcoes().get(j).getNome());
                    d33.setText("" + MainActivity.logged.getAcoes().get(j).getDatainicio());
                    l33.setText("" + MainActivity.logged.getAcoes().get(j).getLocalidade());
                    n33.setVisibility(View.VISIBLE);
                    d33.setVisibility(View.VISIBLE);
                    l33.setVisibility(View.VISIBLE);
                }
            }
    }
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade=MainActivity.logged.getAcoes().get(0).getTerminada();
                startActivity(new Intent(v.getContext(), OsMeusDocumentosTerminados.class));
            }
        });
        n22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade=MainActivity.logged.getAcoes().get(0).getTerminada();
                startActivity(new Intent(v.getContext(), OsMeusDocumentosTerminados.class));
            }
        });
        n33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grade=MainActivity.logged.getAcoes().get(0).getTerminada();
                startActivity(new Intent(v.getContext(), OsMeusDocumentosTerminados.class));
            }
        });
}
}
