package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class child extends AppCompatActivity {
    Button btnBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        /*GradientDrawable gradientDrawable = new GradientDrawable(

                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{ContextCompat.getColor(this, R.color.color_mediaGradientTop),
                        ContextCompat.getColor(this, R.color.color_mediaGradientTop),
                        ContextCompat.getColor(this, R.color.color_mediaGradientSecond),
                        ContextCompat.getColor(this, R.color.color_mediaGradientThird),
                        ContextCompat.getColor(this,R.color.colorWhite),
                        ContextCompat.getColor(this,R.color.colorWhite),
                        ContextCompat.getColor(this, R.color.color_mediaGradientBottom),
                        ContextCompat.getColor(this, R.color.color_mediaGradientBottom),
                        ContextCompat.getColor(this, R.color.color_mediaGradientBottom),
                        ContextCompat.getColor(this, R.color.color_mediaGradientBottom)}
                );


        findViewById(R.id.lytConstraint).setBackground(gradientDrawable);*/

        btnBirth = (Button)findViewById(R.id.btnBirth);

        btnBirth.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(child.this, JPGBackground.class);


            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
            }
        });
    }


}
