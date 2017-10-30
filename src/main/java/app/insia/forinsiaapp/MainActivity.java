package app.insia.forinsiaapp;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
//import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
/*import android.widget.TextView;
import android.widget.Toast;


import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.api.GoogleApiClient;

import com.google.android.gms.auth.api.signin.GoogleSignInResult;
/*import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.Auth;
import com.androidquery.AQuery;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
 */
//import org.json.JSONObject;
import java.util.ArrayList;

import app.insia.forinsiaapp.Modelo.Acao;
import app.insia.forinsiaapp.Modelo.Entidade;
import app.insia.forinsiaapp.Modelo.Utilizador;

public class MainActivity extends AppCompatActivity //implements GoogleApiClient.OnConnectionFailedListener
{
    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
    /* private SignInButton signInButton;
      private GoogleSignInOptions gso;
      private GoogleApiClient mGoogleApiClient;
      private int SIGN_IN = 30;
    CallbackManager callbackManager;*/
    static ArrayList<Utilizador> users = new ArrayList<>();
    public ArrayList<Acao> acoes = new ArrayList<>();
    //public static int permission = 0;
    static Utilizador logged;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                getUserDetails(loginResult);
            }
            @Override
            public void onCancel() {
                // App code
            }
            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });*/
      /*  gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        signInButton = (SignInButton) findViewById(R.id.sign_in_button);
        mGoogleApiClient = new GoogleApiClient.Builder(this)
               .enableAutoManage(this /* FragmentActivity *///, this /* OnConnectionFailedListener*/ )
        // .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
        // .addApi(Plus.API)
        //    .build();
       /* signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                startActivityForResult(signInIntent, SIGN_IN);
            }
        });*/
        Entidade e7=new Entidade();
        final Acao a1= new Acao("Agricultura", "01/10/2017","Porto", (float) 0.0,0);
        final Acao a2= new Acao("Pesca", "01/09/2017","Lisboa", (float) 11.1,1);
        final Acao a3= new Acao("Pecuaria", "10/10/2017","Coimbra", (float) 0.0,0);
        final Acao a4= new Acao("Construçao Civil", "01/05/2017","Porto", (float) 14.5,1);
       /* acoes.add(a1);
        acoes.add(a2);
        users.add(new Utilizador("perfil1", "123", 1,acoes));
        acoes.remove(a2);
        users.add(new Utilizador("perfil2", "123", 2,acoes));
        acoes.add(a3);
        acoes.add(a4);
        users.add(new Utilizador("perfil3", "123", 3,acoes));*/
        ImageButton googlep = findViewById(R.id.googleplusBtn);
        ImageButton facebook = findViewById(R.id.faceIBtn);
        users.add(new Utilizador("perfil1", "123", 1,acoes));
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acoes.add(a1);
                acoes.add(a2);
               // users.add(new Utilizador("perfil1", "123", 1,acoes));
                logged=new Utilizador(users.get(0).getUser(),users.get(0).getPass(),users.get(0).getPermissao(),users.get(0).getAcoes());
                finish();
                startActivity(new Intent(v.getContext(), TipoActivity.class));

            }
        });
        googlep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acoes.add(a4);
                acoes.add(a3);
                acoes.add(a2);
                users.add(new Utilizador("perfil2", "123", 2,acoes));
                logged=new Utilizador(users.get(1).getUser(),users.get(1).getPass(),users.get(1).getPermissao(),users.get(1).getAcoes());
                finish();
                startActivity(new Intent(v.getContext(), TipoActivity.class));


            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    /*protected void getUserDetails(LoginResult loginResult) {
        GraphRequest data_request = GraphRequest.newMeRequest(
                loginResult.getAccessToken(),
                new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(
                            JSONObject json_object,
                            GraphResponse response) {
                      /*  Intent intent = new Intent(MainActivity.this,
                                UserProfile.class);
                        intent.putExtra("userProfile", json_object.toString());
                        startActivity(intent);
                    }
                });
        Bundle permission_param = new Bundle();
        permission_param.putString("fields", "id,name,email,
                picture.width(120).height(120)");
                data_request.setParameters(permission_param);
        data_request.executeAsync();
    }*/
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
//private void handleSignInResult(GoogleSignInResult result) {
/*     //If the login succeed
     if (result.isSuccess()) {
         //Getting google account
         final GoogleSignInAccount acct = result.getSignInAccount();
         //Displaying name and email
         String name = acct.getDisplayName();
         final String mail = acct.getEmail();
         // String photourl = acct.getPhotoUrl().toString();
         final String givenname="",familyname="",displayname="",birthday="";
        /* Plus.PeopleApi.load(mGoogleApiClient, acct.getId()).setResultCallback(new ResultCallback<People.LoadPeopleResult>() {
             @Override
             public void onResult(@NonNull People.LoadPeopleResult loadPeopleResult) {
                 Person person = loadPeopleResult.getPersonBuffer().get(0);
                 Log.d("GivenName ", person.getName().getGivenName());
                 Log.d("FamilyName ",person.getName().getFamilyName());
                 Log.d("DisplayName ",person.getDisplayName());
                 Log.d("gender ", String.valueOf(person.getGender())); //0 = male 1 = female
                 String gender="";
                 if(person.getGender() == 0){
                     gender = "Male";
                 }else {
                     gender = "Female";
                 }
                 Log.d("Uriddd",acct.getPhotoUrl().toString());
                  //   Log.d(TAG,"CurrentLocation "+person.getCurrentLocation());
                    //Log.d(TAG,"AboutMe "+person.getAboutMe());
                 // Log.d("Birthday ",person.getBirthday());
                 // Log.d(TAG,"Image "+person.getImage());
             }
         });
     } else {
         //If login fails
         Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show();*/
    //}
 /*   @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
    }*/
 /*@Override
 protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
     super.onActivityResult(requestCode, resultCode, data);
     callbackManager.onActivityResult(requestCode, resultCode, data);
 }*/
}