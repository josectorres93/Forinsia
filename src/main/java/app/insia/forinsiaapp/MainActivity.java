package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button credencial = (Button)findViewById(R.id.credencialBtn);
        Button log = (Button)findViewById(R.id.entrarBtn);
        ImageButton facebook = (ImageButton) findViewById(R.id.faceIBtn);
        final EditText user = (EditText)findViewById(R.id.userEdit);
        final EditText pass = (EditText)findViewById(R.id.passEdit);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),TipoActivity.class));




            }
        });
        credencial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),CredencialActivity.class));
               /* String txt1 = "" + user.getText();
                String txt2 = "" + pass.getText();*/


                    //email implementado só precisa de ser configurado no emulador\dispositivo móvel
                  /*  Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL,"josecarlostorres93@gmail.com");
                    email.putExtra(Intent.EXTRA_SUBJECT, "teste");
                    email.putExtra(Intent.EXTRA_TEXT,"erty");
                    email.setType("message/rfc822");
                    startActivity(Intent.createChooser(email, "josecarlostorres93@gmail.com"));*/
                /*  if(MainActivity.verifyUser(txt1,txt2)==1) {


                        finish();
                    }*/



            }
        });
        log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //startActivity(new Intent(this, .class));
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),TipoActivity.class));




            }
        });



    }
    public static int verifyUser(String s1, String s2){

        return 1;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
