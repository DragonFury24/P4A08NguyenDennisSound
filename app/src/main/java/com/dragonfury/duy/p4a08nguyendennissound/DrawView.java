package com.dragonfury.duy.p4a08nguyendennissound;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 1383504 on 2/10/2017.
 */
public class DrawView extends View {
    private int streamID;

    public DrawView(Context context) {
        super(context);
        //Preload Sounds
        SoundPlayer.InitSound(context);
        //Play Sound
        SoundPlayer.playSound(context, 1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            streamID = SoundPlayer.playSound(getContext(), 1);
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            SoundPlayer.stopSound(1);
        }
        return super.onTouchEvent(event);
    }
}
