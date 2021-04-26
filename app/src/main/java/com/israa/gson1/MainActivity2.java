package com.israa.gson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.israa.gson1.mode.CVInfo;


public class MainActivity2 extends AppCompatActivity {

    private ImageView img ;
    private EditText edtEducation;
    private EditText edtWork;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String dateofbirth = intent.getStringExtra("DATA");
        String gender = intent.getStringExtra("GENDER");
        String hobbies = intent.getStringExtra("Skills");

        ImageView imge = findViewById(R.id.imageView2);
        EditText Education = findViewById(R.id.edtEducation);
        EditText work = findViewById(R.id.edtWork);


    }

    public void btnSaveOnClick(View view) {
     CVInfo cv = new CVInfo( "Israa","israa@gmail.com","Chef","18/12/1999","Female");

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();

        String CVString = gson.toJson(cv);

        editor.commit();
        Toast.makeText(this, "CV Saved:\n" + CVString,
               Toast.LENGTH_SHORT).show();
    }



    public void btnLoadOnClick(View view) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("", "");
        CVInfo cv = gson.fromJson(str, CVInfo.class);

        Toast.makeText(this, "the Cv  "
                , Toast.LENGTH_SHORT).show();

    }
}