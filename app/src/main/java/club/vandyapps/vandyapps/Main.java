package club.vandyapps.vandyapps;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import club.vandyapps.vandyapps.wrapper.Wrapper;

public class Main extends AppCompatActivity {

    private Button feedbackButton;
    private Button changeActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        feedbackButton = (Button) findViewById(R.id.feedback);
        changeActivityButton = (Button) findViewById(R.id.changeActivity);

        final NotificationManager notificationManager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        feedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Wrapper.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(Main.this,
                        (int) System.currentTimeMillis(), intent, 0);
                Notification notification = new Notification.Builder(Main.this)
                        .setContentTitle("Your van is here!")
                        .setContentText("The Gold van is outside Kissam. Make your way there already!")
                        .setAutoCancel(false)
                        .setStyle(new Notification.BigTextStyle().bigText("The Gold van is outside Kissam. .Make your way there already!"))
                        .setSmallIcon(R.mipmap.ic_launcher).build();
                notificationManager.notify(0, notification);
            }

        });
        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Wrapper.class);
                startActivity(intent);
                notificationManager.cancel(0);
            }
        });
    }
}
