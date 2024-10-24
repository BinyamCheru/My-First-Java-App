package com.biniyam.firstappinjava;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void clickButton(View view){
        Log.i("Info","Button Tapped!");
        EditText enteredText = findViewById(R.id.editText);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        ImageView myImage = findViewById(R.id.imageView);
        myImage.setImageResource(R.drawable.pic2);

        Log.i("email", email.getText().toString());
        Log.i("password", password.getText().toString());
        Log.i("some", enteredText.getText().toString());

        Toast.makeText(getApplicationContext(),"Hi " + email.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}