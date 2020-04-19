package com.example.finalproject.logic;
//import javax.imageio.ImageIO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.example.finalproject.R;
import java.io.File;
import java.io.IOException;

import android.content.Intent;
import android.graphics.Point;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

//import java.awt.image.BufferedImage;



public class Grid {
    public String fileName;
    public int columns;
    public int rows;

    public void SplitImage(String setFileName, int setRows, int setColumns) {
        fileName = setFileName;
        columns = setColumns;
        rows = setRows;
    }
        //Read more: https://javarevisited.blogspot.com/2011/12/read-write-image-in-java-example.html#ixzz6K07Fhsaj
        //try is used to make sure program won't crash even if exception is spotted
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Required by Android
        setContentView(R.layout.activity_new_game);
    }

        public static void main(String[]args){

            //BufferedImage image = null;
            //image = ImageIO.read(new File(fileName));
            try {
                ImageView image = (ImageView) findViewById(R.id.test_image);
                Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
                image.setImageBitmap(bMap);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}


