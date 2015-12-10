package br.com.mrcsfelipe.templatevalverde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccordingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_according);

        Button btnProfile = (Button) findViewById(R.id.btnProfile);
        Button btnSettings = (Button) findViewById(R.id.btnSettings);
        Button btnPrivacy = (Button) findViewById(R.id.btnPrivacy);

        View panelProfile = findViewById(R.id.panelProfile);
        panelProfile.setVisibility(View.GONE);

        View panelSettings = findViewById(R.id.panelSettings);
        panelSettings.setVisibility(View.GONE);

        View panelPrivacy = findViewById(R.id.panelPrivacy);
        panelPrivacy.setVisibility(View.GONE);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DO STUFF
                View panelProfile = findViewById(R.id.panelProfile);
                panelProfile.setVisibility(View.VISIBLE);

                View panelSettings = findViewById(R.id.panelSettings);
                panelSettings.setVisibility(View.GONE);

                View panelPrivacy = findViewById(R.id.panelPrivacy);
                panelPrivacy.setVisibility(View.GONE);

            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DO STUFF
                View panelProfile = findViewById(R.id.panelProfile);
                panelProfile.setVisibility(View.GONE);

                View panelSettings = findViewById(R.id.panelSettings);
                panelSettings.setVisibility(View.VISIBLE);

                View panelPrivacy = findViewById(R.id.panelPrivacy);
                panelPrivacy.setVisibility(View.GONE);

            }
        });

        btnPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DO STUFF
                View panelProfile = findViewById(R.id.panelProfile);
                panelProfile.setVisibility(View.GONE);

                View panelSettings = findViewById(R.id.panelSettings);
                panelSettings.setVisibility(View.GONE);

                View panelPrivacy = findViewById(R.id.panelPrivacy);
                panelPrivacy.setVisibility(View.VISIBLE);

            }
        });

    }

}
