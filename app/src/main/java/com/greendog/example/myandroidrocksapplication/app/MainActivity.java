package com.greendog.example.myandroidrocksapplication.app;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    MediaPlayer backgroundmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Investigate", "onCreate");
    }

    @Override
    protected void onPause() {
        backgroundmusic.stop();
        backgroundmusic.release();
        Log.e("Investigate", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        backgroundmusic = MediaPlayer.create(this, R.raw.mysong);
        backgroundmusic.start();
        Log.e("Investigate", "onResume");
        super.onResume();
    }

    public void openSC(View v) {
		String url = "https://github.com/janebabra";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

	public void openBLOG(View v) {
		String url = "http://google-android-studio.blogspot.com/";
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse(url));
		startActivity(intent);
	}
}
