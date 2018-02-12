package com.example.mitlaunchxv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> PlantName = new ArrayList<>();
    ArrayList<String> PlantType = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // refresh screen pls
        Collections.addAll(PlantName, -----);////get plant names from server and put them in here
        Collections.addAll(PlantType, -----);////get plant names from server and put them in here

    }



    public void CallsThePlantSetupClass(View view) {
        Intent CallsThePlantSetupClass = new Intent(this, SetupPlant.class);
        startActivity(CallsThePlantSetupClass);
    }

    public void CallsThePreferencesClass(View view) {
        Intent callsThePreferencesClass = new Intent(this, Preferences.class);
        startActivity(callsThePreferencesClass);
    }


}
