package com.spaga.demoapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText myTextField = findViewById(R.id.myTextField);
        Log.i("Info", myTextField.getText().toString());
        Toast.makeText(this, myTextField.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void changeImage(View view) {
        ImageView image = findViewById(R.id.image1);
        image.setImageResource(R.drawable.dog1);

        Log.i("test", "Button clicked");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
