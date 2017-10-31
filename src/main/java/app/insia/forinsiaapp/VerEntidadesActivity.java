package app.insia.forinsiaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Vai ler do web service as entidades em que o utilizador se encontra associado e vai mostra-las no ecra
 */

public class VerEntidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_entidades);
    }
}
