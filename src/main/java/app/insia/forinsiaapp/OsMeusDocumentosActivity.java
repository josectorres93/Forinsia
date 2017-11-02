package app.insia.forinsiaapp;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta atividade corresponde as opções de cada açao
 * O servidor tem que ser capaz de receber documentos e quarada-los numa base de dados
 * O botão download só irá receber da base de dados documentos se lá existirem como um certificado e o pedido tem que ser feito
 * O botão escrever sumário é exclusiva dos formadores portanto encontra-se escondida para os formandos
 * Para gerar notificações basta alterar a função getnotifecation() para cada caso
 * Os metodos estaticos devem ser alterados em prol da base de dados e do web service para esta atividade ser dinamica
 * O web service deverá enviar uma notificação para a aplicaçao caso exista uma avaliação disponível
 * o web service deverá lançar uma notificação caso existam inqueritos para responder
 */
public class OsMeusDocumentosActivity extends AppCompatActivity {

    Button buttonOpenDialog;
    Button buttonUp;
    Button downBtn;
    TextView textFolder;
    static final int CUSTOM_DIALOG_ID = 0;
    ListView dialog_ListView;
    File root;
    File curFolder;
    private List<String> fileList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_meus_documentos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        downBtn = findViewById(R.id.downBtn);
        buttonOpenDialog =  findViewById(R.id.upBtn);
        buttonOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(CUSTOM_DIALOG_ID);
            }
        });
        root = new File(Environment.getExternalStorageDirectory().getAbsolutePath());
        curFolder = root;
        Button inq=findViewById(R.id.inqBtn);

        Button sum = findViewById(R.id.sumBtn);
        if(MainActivity.logged.getPermissao()==2){
            sum.setVisibility(View.VISIBLE);
        }
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), SumarioActivity.class));
            }
        });

    }
    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        switch (id) {
            case CUSTOM_DIALOG_ID:
                dialog = new Dialog(OsMeusDocumentosActivity.this);
                dialog.setContentView(R.layout.upload_form);
                dialog.setTitle("Selecione o Ficheiro");
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);
                textFolder =  dialog.findViewById(R.id.folder);
                buttonUp =  dialog.findViewById(R.id.up);
                buttonUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ListDir(curFolder.getParentFile());
                    }
                });
                dialog_ListView =  dialog.findViewById(R.id.dialoglist);
                dialog_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        File selected = new File(fileList.get(position));
                        if(selected.isDirectory()) {
                            ListDir(selected);
                        } else {
                            Toast.makeText(OsMeusDocumentosActivity.this, selected.toString() + " selected",
                                    Toast.LENGTH_LONG).show();
                            dismissDialog(CUSTOM_DIALOG_ID);
                        }
                    }
                });

                break;
        }
        return dialog;
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
        switch (id) {
            case CUSTOM_DIALOG_ID:
                ListDir(curFolder);
                break;
        }
    }
    void ListDir(File f) {
        if(f.equals(root)) {
            buttonUp.setEnabled(false);
        } else {
            buttonUp.setEnabled(true);
        }
        curFolder = f;
        textFolder.setText(f.getPath());
       // File[] files = f.listFiles();
        fileList.clear();
        /*for(File file : files) {
            fileList.add(file.getPath());
        }*/
        ArrayAdapter<String> directoryList = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, fileList);
        dialog_ListView.setAdapter(directoryList);
    }
    // Esta funçao serve para gerar notificações
    public void getnotification(View view) {

        NotificationManager notificationmgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

       // Intent intent = new Intent(this, TipoActivity.class);
       // PendingIntent pintent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);
        Notification notif = new Notification.Builder(this)
                .setSmallIcon(R.drawable.fifi)
                .setContentTitle("Não tem inqueritos para responder!")
                .setContentText("ForInsia")
                //.setContentIntent(pintent)
                .build();
        notificationmgr.notify(0, notif);



    }
}
