package com.salim.webviewwithbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button fb_btn, goo_btn, twi_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fb_btn = findViewById(R.id.facebook_btn);
        goo_btn = findViewById(R.id.google_btn);
        twi_btn = findViewById(R.id.twitter_btn);

        buttonHandlear buttonHandlear = new buttonHandlear();

        goo_btn.setOnClickListener(buttonHandlear);
        fb_btn.setOnClickListener(buttonHandlear);
        twi_btn.setOnClickListener(buttonHandlear);

    }

    class buttonHandlear implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            if (view.getId()==R.id.google_btn){
                Intent intent = new Intent(getApplicationContext(), Browse.class);
                intent.putExtra("social", "google");
                startActivity(intent);
            }
            else if (view.getId()==R.id.facebook_btn){

                Intent intent = new Intent(getApplicationContext(), Browse.class);
                intent.putExtra("social", "facebook");
                startActivity(intent);
            }
            else if (view.getId()==R.id.twitter_btn){

                Intent intent = new Intent(getApplicationContext(), Browse.class);
                intent.putExtra("social", "twitter");
                startActivity(intent);
            }

        }
    }
}
