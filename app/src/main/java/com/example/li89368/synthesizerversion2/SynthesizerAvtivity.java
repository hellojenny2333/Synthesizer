package com.example.li89368.synthesizerversion2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;

import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.id.button3;

public class SynthesizerAvtivity extends AppCompatActivity {

    private final int WHOLE_NOTE = 1000;
    private static final String TAG = SynthesizerAvtivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpFs;
    private MediaPlayer mpHighe;
    private MediaPlayer mpHighf;
    private MediaPlayer mpHighfs;
    private MediaPlayer mpHighg;




    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer_avtivity);

        button1 = (Button) findViewById(R.id.eButton);
        button2 = (Button) findViewById(R.id.fButton);
        button3 = (Button) findViewById(R.id.gButton);
        button4 = (Button) findViewById(R.id.gsButton);
        button5 = (Button) findViewById(R.id.aButton);
        button6 = (Button) findViewById(R.id.bButton);
        button7 = (Button) findViewById(R.id.bbButton);
        button8 = (Button) findViewById(R.id.cButton);
        button9 = (Button) findViewById(R.id.csButton);
        button10 = (Button) findViewById(R.id.dButton);
        button11 = (Button) findViewById(R.id.dsButton);
        button12 = (Button) findViewById(R.id.fsButton);
        button13 = (Button) findViewById(R.id.higheButton);
        button14 = (Button) findViewById(R.id.highfButton);
        button15 = (Button) findViewById(R.id.highfsButton);
        button16 = (Button) findViewById(R.id.highgButton);
        button17 = (Button) findViewById(R.id.scaleButton);
        button18 = (Button) findViewById(R.id.littlestar1Button);
        button19 = (Button) findViewById(R.id.littlestar2Button);
        button20 = (Button) findViewById(R.id.arrayButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpHighe = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighf = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighfs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighg = MediaPlayer.create(this, R.raw.scalehighg);

    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onButton1Click(View view) {
        mpE.seekTo(0);
        Log.i(TAG, "e Button clicked");
        mpE.start();

    }
    public void onButton2Click(View view) {
        mpF.seekTo(0);
        Log.i(TAG, "f Button clicked");
        mpF.start();
    }
    public void onButton3Click(View view) {
        mpG.seekTo(0);
        Log.i(TAG, "g Button clicked");
        mpG.start();
    }
    public void onButton4Click(View view) {
        mpGs.seekTo(0);
        Log.i(TAG, "gs Button clicked");
        mpGs.start();
    }
    public void onButton5Click(View view) {
        mpA.seekTo(0);
        Log.i(TAG, "a Button clicked");
        mpA.start();
    }
    public void onButton6Click(View view) {
        mpB.seekTo(0);
        Log.i(TAG, "b Button clicked");
        mpB.start();
    }
    public void onButton7Click(View view) {
        mpBB.seekTo(0);
        Log.i(TAG, "bb Button clicked");
        mpBB.start();
    }
    public void onButton8Click(View view) {
        mpC.seekTo(0);
        Log.i(TAG, "c Button clicked");
        mpC.start();
    }
    public void onButton9Click(View view) {
        mpCs.seekTo(0);
        Log.i(TAG, "cs Button clicked");
        mpCs.start();
    }
    public void onButton10Click(View view) {
        mpD.seekTo(0);
        Log.i(TAG, "d Button clicked");
        mpD.start();
    }
    public void onButton11Click(View view) {
        mpDs.seekTo(0);
        Log.i(TAG, "ds Button clicked");
        mpDs.start();
    }
    public void onButton12Click(View view) {
        mpFs.seekTo(0);
        Log.i(TAG, "fs Button clicked");
        mpFs.start();
    }
    public void onButton13Click(View view) {
        mpHighe.seekTo(0);
        Log.i(TAG, "highe Button clicked");
        mpHighe.start();
    }
    public void onButton14Click(View view) {
        mpHighf.seekTo(0);
        Log.i(TAG, "highf Button clicked");
        mpHighf.start();
    }
    public void onButton15Click(View view) {
        mpHighfs.seekTo(0);
        Log.i(TAG, "highfs Button clicked");
        mpHighfs.start();
    }
    public void onButton16Click(View view) {
        mpHighg.seekTo(0);
        Log.i(TAG, "highg Button clicked");
        mpHighg.start();
    }
    public void onClick(View v) {
        Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpG.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighe.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onClick2(View v) {
        Log.e("SynthesizerActivity", "Challenge 1 Button clicked");
        try {
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpHighe.start();
            delayPlaying(WHOLE_NOTE);
            mpHighe.start();
            delayPlaying(WHOLE_NOTE);
            mpHighfs.start();
            delayPlaying(WHOLE_NOTE);
            mpHighfs.start();
            delayPlaying(WHOLE_NOTE);
            mpHighe.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onClick3(View v) {
        Log.e("SynthesizerActivity", "Challenge 2 Button clicked");
        try {
            mpHighe.start();
            delayPlaying(WHOLE_NOTE);
            mpHighe.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    MediaPlayer[] myList = {mpA,mpB,mpBB,mpC,mpCs,mpD,mpDs,mpE,mpF,mpFs,mpG,mpGs,mpHighe,mpHighf,mpHighfs,mpHighg};
    public void onClick4(View v) {
        Log.e("SynthesizerActivity", "Challenge 3 Button clicked");
        for (int i=0; i < myList.length; i++)
        {
            myList[i].start();
        }
    }


}




