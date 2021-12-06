package com.example.biodata_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    Button alamat;
    Button telp;
    Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alamat = findViewById(R.id.alamat);
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Pesta+%26+Uttah+Ria/@-6.9690074,110.4110858,19z/data=!4m13!1m7!3m6!1s0x2e70f4b13ee87e2b:0x1624f0425e88d66b!2sJl.+Satria+Utara,+Plombokan,+Kec.+Semarang+Utara,+Kota+Semarang,+Jawa+Tengah+50171!3b1!8m2!3d-6.9693422!4d110.4097492!3m4!1s0x0:0x3e281d094bc39267!8m2!3d-6.9691391!4d110.4107265");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        startActivity(mapIntent);
                    }
                },1000);
            }
        });

        telp = findViewById(R.id.telp);
        telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telpIntent = new Intent (Intent.ACTION_DIAL);
                telpIntent.setData(Uri.parse("tel:081216351929"));
                startActivity(telpIntent);
            }
        });

        email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:ee.guy.42@gmail.com?subject=");
                emailIntent.setData(data);
                startActivity(emailIntent);
            }
        });

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }

    @Override
    protected void onStart(){
        super.onStart();

    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState){
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onLowMemory(){
        super.onLowMemory();

    }
}