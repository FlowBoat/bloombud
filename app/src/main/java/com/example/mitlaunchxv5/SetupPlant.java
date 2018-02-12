package com.example.mitlaunchxv5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.net.ServerSocket;

public class SetupPlant extends AppCompatActivity {

    ArrayList<String> PlantName = new ArrayList<>();

    ArrayList<String> PlantType = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_plant);

        EditText PlantName = (EditText)findViewById(R.id.NameOfPlant);
        //initializing spinner
        Spinner ChooseTypeOfPlant = (Spinner) findViewById (R.id.TypeOfPlantSpinner);
        ArrayAdapter<CharSequence> ArrayHolder= ArrayAdapter.createFromResource (this, R.array.
                Type_Of_Plants_Available_Array, android.R.layout.simple_spinner_item);
        ArrayHolder.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ChooseTypeOfPlant.setAdapter (ArrayHolder);
    }

    public void ReturnToDashboard (View view) {
        Intent ReturnToDashboard = new Intent(this, MainActivity.class);
        startActivity(ReturnToDashboard);
    }

    public void AddPlant (View view) {
        //download from server
        EditText PlantNameBox = (EditText) findViewById(R.id.NameOfPlant);
        Spinner PlantSpinner = (Spinner) findViewById(R.id.TypeOfPlantSpinner);
        String PlantNameHolder = PlantNameBox.getText().toString();
        String PlantTypeHolder = PlantSpinner.getSelectedItem().toString();
        Collections.addAll(PlantName,PlantNameHolder);
        Collections.addAll(PlantType,PlantTypeHolder);
        Intent AddPlant = new Intent(this, MainActivity.class);
        startActivity(AddPlant);
        //upload data to server
    }

}
