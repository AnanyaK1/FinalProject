package com.example.finalproject

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory


/**
 * Represents the main screen of the app, where the user can view and enter games.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            ImageView image = (ImageView) findViewById(R.id.test_image);
            Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
            image.setImageBitmap(bMap);
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
