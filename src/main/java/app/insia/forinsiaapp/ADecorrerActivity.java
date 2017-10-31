package app.insia.forinsiaapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;


/**
 * Esta atividade corresponde apenas as acções a decorrer
 * O web service deve devolver todas as acções a decorrer do formador/formando que se encontra logado
 * Neste momento estão criados 3 textViews mas deverão ser criados mais dependendo do número de acções que um utlizador tem (um
 * formador normalmente tem muitas acções)
 * O utilizador entra na acção ao pressionar no título da mesma
 * Neste momento os dados são criados na aplicação mas devem ser lidos do web service e da base de dados
 */

public class ADecorrerActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adecorrer);
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView n1 =findViewById(R.id.n1);
        TextView n2 =findViewById(R.id.n2);
        TextView n3 =findViewById(R.id.n3);
        TextView d1 =findViewById(R.id.d1);
        TextView d2 =findViewById(R.id.d2);
        TextView d3 =findViewById(R.id.d3);
        TextView l1 =findViewById(R.id.l1);
        TextView l2 =findViewById(R.id.l2);
        TextView l3 =findViewById(R.id.l3);

        int i= MainActivity.logged.getAcoes().size();
        for(int j=0;j<i;j++){
            if(j==0){
                if(MainActivity.logged.getAcoes().get(j).getTerminada()==0) {
                    n1.setText("" + MainActivity.logged.getAcoes().get(j).getNome());
                    d1.setText("" + MainActivity.logged.getAcoes().get(j).getDatainicio());
                    l1.setText("" + MainActivity.logged.getAcoes().get(j).getLocalidade());
                    n1.setVisibility(View.VISIBLE);
                    d1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                }
            }
            if(j==1){
                if(MainActivity.logged.getAcoes().get(j).getTerminada()==0) {
                    n2.setText("" + MainActivity.logged.getAcoes().get(j).getNome());
                    d2.setText("" + MainActivity.logged.getAcoes().get(j).getDatainicio());
                    l2.setText("" + MainActivity.logged.getAcoes().get(j).getLocalidade());
                    n2.setVisibility(View.VISIBLE);
                    d2.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.VISIBLE);
                }
            }
            if(j==2){
                if(MainActivity.logged.getAcoes().get(j).getTerminada()==0) {
                    n3.setText("" + MainActivity.logged.getAcoes().get(j).getNome());
                    d3.setText("" + MainActivity.logged.getAcoes().get(j).getDatainicio());
                    l3.setText("" + MainActivity.logged.getAcoes().get(j).getLocalidade());
                    n3.setVisibility(View.VISIBLE);
                    d3.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                }
            }
            n1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(v.getContext(), OsMeusDocumentosActivity.class));
                }
            });
            n2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(v.getContext(), OsMeusDocumentosActivity.class));
                }
            });
            n3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(v.getContext(), OsMeusDocumentosActivity.class));
                }
            });
        }
    }
}