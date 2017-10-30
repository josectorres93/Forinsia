package app.insia.forinsiaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import app.insia.forinsiaapp.Modelo.Utilizador;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button log=findViewById(R.id.loginBtn);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 EditText login=findViewById(R.id.userEdt);
                 EditText password=findViewById(R.id.passEdt);
                String txt1=""+login.getText();
                String txt2=""+password.getText();
                 String user="teste";
                 String pass="123";
                if(MainActivity.logged.getPermissao()==1){
                    if(txt1.equals(user)&&txt2.equals(pass)) {

                        startActivity(new Intent(v.getContext(), FormandoActivity.class));
                    }
                }else if(MainActivity.logged.getPermissao()==2) {
                    if(txt1.equals(user)&&txt2.equals(pass)) {
                        startActivity(new Intent(v.getContext(), FormadorActivity.class));
                    }
                }
            }
        });
    }
}