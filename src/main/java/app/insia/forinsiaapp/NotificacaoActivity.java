package app.insia.forinsiaapp;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NotificacaoActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacao);
        btn = findViewById(R.id.noti);
    }

    public void getnotification(View view){

        NotificationManager notificationmgr = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        if(MainActivity.logged.getPermissao()==1) {
            Intent intent = new Intent(this, ADecorrerActivity.class);
            PendingIntent pintent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);
            Notification notif = new Notification.Builder(this)
                    .setSmallIcon(R.drawable.fi)
                    .setContentTitle("Bem vindo!")
                    .setContentText("ForInsia")
                    .setContentIntent(pintent)
                    .build();
            notificationmgr.notify(0,notif);
        }else if (MainActivity.logged.getPermissao()==2) {
            Intent intent = new Intent(this, ADecorrerActivity.class);
            PendingIntent pintent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);
            Notification notif = new Notification.Builder(this)
                    .setSmallIcon(R.drawable.fi)
                    .setContentTitle("Bem vindo!")
                    .setContentText("ForInsia")
                    .setContentIntent(pintent)
                    .build();
            notificationmgr.notify(0,notif);
        }
        //  PendingIntent pintent = PendingIntent.getActivities(this,(int)System.currentTimeMillis(),intent, 0);
    }
}
