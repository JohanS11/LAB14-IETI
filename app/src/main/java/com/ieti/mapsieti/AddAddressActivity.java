package com.ieti.mapsieti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddAddressActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addform);
    }

    public void onClick(View view) {
        TextView latitude = findViewById(R.id.lat);
        TextView longitude = findViewById(R.id.longi);

        Intent intent = new Intent();
        intent.putExtra("info",new String[]{latitude.getText().toString(),longitude.getText().toString()});
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}
