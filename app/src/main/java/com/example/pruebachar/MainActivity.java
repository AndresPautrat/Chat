package com.example.pruebachar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInputLayout keyname = findViewById(R.id.keyname);
        AppCompatButton cancontinue =
                (AppCompatButton) findViewById(R.id.fab);
        cancontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keynameText = keyname.getEditText().getText().toString();
                if(keynameText.equals("Owl Gal") || keynameText.equals("Fox Boy")){
                    Intent intent = new Intent(getBaseContext(), ChatActivity.class);
                    intent.putExtra("keyname", keynameText);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getBaseContext(), keynameText, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}