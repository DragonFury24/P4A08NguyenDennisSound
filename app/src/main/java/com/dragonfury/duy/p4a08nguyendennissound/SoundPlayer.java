package com.dragonfury.duy.p4a08nguyendennissound;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import java.util.HashMap;

/**
 * Created by 1383504 on 2/10/2017.
 */
public class SoundPlayer {
    private static final int S1 = R.raw.droid;
    private static SoundPool soundPool;
    private static HashMap soundPoolMap;
    public static void InitSound(Context context) {
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 100);
        soundPoolMap = new HashMap(3); //3 is the initial capacity
        soundPoolMap.put (S1, soundPool.load(context, S1, 1));

    }
    //Play Sound
    public static int playSound (Context context, int soundID){
        if (soundPool == null){
            InitSound(context);
        }
        float volume = .5f;// Sets sound from 0.0 to 1.0
        return soundPool.play(soundID, volume, volume, 1, 0, 1f);
    }
    public static void stopSound (int streamID){
        soundPool.stop(streamID);
    }
}
