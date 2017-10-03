package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity   {

    static ArrayList<Utilizador> users = new ArrayList<>();
    public static int permission=0;
   // Utilizador logged= new Utilizador();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        addUser("perfil1","123",1);
        addUser("perfil2","123",2);
        addUser("perfil3","123",3);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       //Button credencial = (Button)findViewById(R.id.credencialBtn);
        ImageButton googlep = (ImageButton)findViewById(R.id.googleplusBtn);
        ImageButton facebook = (ImageButton) findViewById(R.id.faceIBtn);
        //final EditText user = (EditText)findViewById(R.id.userEdit);
        //final EditText pass = (EditText)findViewById(R.id.passEdit);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),TipoActivity.class));
            }
        });
        googlep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),TipoActivity.class));

            }
        });
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

    public static void addUser(String s1, String s2, int s3) {
        Utilizador u = new Utilizador(s1, s2, s3);
        users.add(u);

    }

 /* public void updatePermission (Utilizador u){
     if(u.getKey()==1){
         this.permission=1;
     }else if(u.getKey()==2){
         this.permission=2;
     }else if(u.getKey()==3){
         this.permission=3;
     }

  }*/

    /*public void verifyUser(String s1, String s2){
        for(Utilizador u:users){
            if(u.getUser().equals(s1)&&u.getPass().equals(s2)){

            }

    }
    }*/


}
