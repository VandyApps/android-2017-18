package club.vandyapps.vandyapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button feedbackButton;
    private Button changeActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        feedbackButton = (Button) findViewById(R.id.feedback);
        changeActivityButton = (Button) findViewById(R.id.changeActivity);

        feedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Feedback", Toast.LENGTH_LONG).show();
            }

        });
        changeActivityButton.setOnClickListener(new OurListener());
    }

    public class OurListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Wrapper.class);
            startActivity(intent);
        }
    }
}
