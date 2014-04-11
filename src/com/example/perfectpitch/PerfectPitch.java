package com.example.perfectpitch;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

/*
 	App for practice hearing pitch. Contains C Major note.
 	Plays the note assigned to the button.
 */
public class PerfectPitch extends Activity {

	public Context context;
	public SoundManager sm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = getApplicationContext();
		sm = new SoundManager(context);
		setContentView(R.layout.activity_perfect_pitch);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.perfect_pitch, menu);
		return true;
	}

	public Context getContext() {
		return context;
	}
	
	public void learning(View v) {
		setContentView(R.layout.learning);
	}
	
	public void practicing(View v) {
		setContentView(R.layout.practicing);
	}
	
	public void startPractice(View v) {
		RadioButton rb = (RadioButton) v;
		String option = rb.getText().toString();
		ImageButton playPause = (ImageButton) findViewById(R.id.playButton);
		playPause.setImageResource(R.drawable.play);
		setContentView(R.layout.start_practice);
	}
	
	public void playSound(View v) {
		Button b = (Button) v;
		String note = b.getText().toString().toLowerCase();
		sm.playSound(note);
	}
	
}
