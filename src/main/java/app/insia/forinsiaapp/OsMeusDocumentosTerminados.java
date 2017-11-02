package app.insia.forinsiaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

/**
 * Esta atividade possui as funcionalidades das acçoes que ja se encontram terminadas
 * O web service nesta ativdade tem duas funções:
 * - Devolver a nota do formando
 * - Possibilidade de download de documentos da acção(certificado)
 */

public class OsMeusDocumentosTerminados extends AppCompatActivity {
        public int grade=ATerminadasActivity.grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_meus_documentos_terminados);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button downBtn = findViewById(R.id.downBtn1);

    }

}
