package com.example.picit_stk.uitestandroid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickOCR(View view)
    {
        SurfaceView sv = findViewById(R.id.surfaceView);
        sv.setVisibility(View.VISIBLE);
        Camera cam = null;

        try {
            cam = Camera.open(); // attempt to get a Camera instance
            cam.setPreviewDisplay(sv.getHolder());
            cam.startPreview();
            sv.setClipBounds(new Rect(100,100,100,100));

        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }



    }
}
