package com.example.volkan.newprogbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.RectF;

/**
 * Created by volkan on 4.9.2016.
 */
public class DaireselProgressBar extends View {

    private Paint _paintDPB1=new Paint();
    private Paint _paintDPB2=new Paint();
    private Paint _paintDPB3=new Paint();
    private Canvas canvas;
    private float Angle=0;

    public DaireselProgressBar(Context context) {
        super(context);
        init(null,0);
    }

    public DaireselProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs,0);
    }

    public DaireselProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs, int defStyleAttr){
        _paintDPB1.setColor(Color.parseColor("#D94D2E"));
        _paintDPB1.setAntiAlias(true);
        _paintDPB1.setStyle(Paint.Style.STROKE);
        _paintDPB1.setStrokeWidth(20);
        _paintDPB2.setColor(Color.GREEN);
        _paintDPB2.setAntiAlias(true);
        _paintDPB2.setStyle(Paint.Style.FILL);
        _paintDPB2.setStrokeWidth(25);
        _paintDPB3.setColor(Color.BLACK);
        _paintDPB3.setAntiAlias(true);
        _paintDPB3.setTextSize(40);
    }

    @Override
    public void onDraw(Canvas canvas1){
        super.onDraw(canvas1);
        //canvas.drawLine(0,0,150,150,_paintDPB);//getWidth(),getHeight()
        this.canvas=canvas1;
        //canvas=canvas1;
        RectF DisCemberCerceve=new RectF(15,15,150,150);
        RectF ProgressDaireDilimi=new RectF(5,5,160,160);
        this.canvas.drawArc(DisCemberCerceve,0,360,false,_paintDPB1);
        this.canvas.drawArc(ProgressDaireDilimi,270,this.Angle,true,_paintDPB2);

        this.canvas.drawText("%99",45,95,_paintDPB3);
    }

    public void setAngle(float angle){
        this.Angle=angle;

        invalidate();;
    }

}
