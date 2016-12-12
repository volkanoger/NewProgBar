package com.example.volkan.newprogbar;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.*;
import android.view.inputmethod.EditorInfo;
import android.widget.*;
import android.view.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Draw_the_Circle(View view) {

        final EditText tfRadius=(EditText) findViewById(R.id.tfRadius);
        final ImageView imgCircle=(ImageView) findViewById(R.id.imgCircle);
        float radius=Float.valueOf(tfRadius.getText().toString());
        /*
        Paint paint=new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        Bitmap bmp=Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bmp);
        canvas.drawArc(15,15,bmp.getWidth()/2,bmp.getHeight()/2,270,radius,false,paint);
        //canvas.drawCircle(bmp.getWidth()/2,bmp.getHeight()/2,radius,paint);
        imgCircle.setImageBitmap(bmp);
        */
        DaireselProgressBar mybar=(DaireselProgressBar) findViewById(R.id.myProgresBar);
        mybar.setAngle(radius);

    }
}
