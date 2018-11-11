package com.example.vincentpc.sda_assign_2_2018_vincent_hamilton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    TextView txt;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        txt1 = findViewById(R.id.textView3);

        txt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);

            }
        });

        // here

        txt1.setOnClickListener(new View.OnClickListener() {
            ImageView selectedImage = findViewById(R.id.imageView);
            @Override
            public void onClick(View v) {

                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 1);


            }
        });






}


}