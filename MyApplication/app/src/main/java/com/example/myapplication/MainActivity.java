package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.rengwuxian.materialedittext.MaterialEditText;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    MaterialEditText Name;
    Button submit;
    String [] SpinnerList={"Animation","Horror","Thriller","Romance","Drama","Adventure","Comedy"};
    String genre,gender,mood,oldfilm, timeAvail, englishCine;
    CheckBox male,female,yes,no,yes1,no1;
    RadioButton mood1,mood2,mood3,little,many;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner betterSpinner=findViewById(R.id.edit_emailid);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,SpinnerList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        betterSpinner.setAdapter(arrayAdapter);
        betterSpinner.setOnItemSelectedListener(this);

        Name = (MaterialEditText) findViewById(R.id.edit_name);
        male=(CheckBox)findViewById(R.id.male);
        female=(CheckBox) findViewById(R.id.female);
        yes=(CheckBox)findViewById(R.id.Yes);
        no=(CheckBox)findViewById(R.id.No);
        mood1=(RadioButton)findViewById(R.id.Sad);
        mood2=(RadioButton)findViewById(R.id.Happy);
        mood3=(RadioButton) findViewById(R.id.Normal);
        little=(RadioButton) findViewById(R.id.Little);
        many=(RadioButton) findViewById(R.id.Many);
        yes1=(CheckBox)findViewById(R.id.yes1);
        no1=(CheckBox)findViewById(R.id.No1);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="Male";
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="Female";
            }
        });

        mood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood="Sad";
            }
        });

        mood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood="Happy";
            }
        });

        mood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mood="Normal";
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldfilm="Yes";
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldfilm="No";
            }
        });

        little.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeAvail="Little";
            }
        });

        many.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeAvail="Many";
            }
        });

        yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                englishCine="Yes";
            }
        });

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                englishCine="No";
            }
        });

        submit = (Button) findViewById(R.id.register_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Genre"+genre+"Gender "+gender+"Mood "+mood+"OldFlim "+oldfilm+"Time Avail"+timeAvail+"English "+englishCine);
                Intent intent = new Intent(MainActivity.this, Result.class);
                intent.putExtra("Name", Name.getText().toString());
                intent.putExtra("Gender", gender);
                intent.putExtra("Mood", mood);
                intent.putExtra("OldFilms", oldfilm);
                intent.putExtra("Gendre", genre);
                intent.putExtra("TimeAvail", timeAvail);
                intent.putExtra("EnglishCinema", englishCine);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        genre=SpinnerList[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
