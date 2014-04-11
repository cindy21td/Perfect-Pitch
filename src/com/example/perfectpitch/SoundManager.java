package com.example.perfectpitch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager {

	private SoundPool sp;
	private Map<String, Integer> notes;
	private Map<Integer, Boolean> soundIds;
	private List<String> notesName;
	private int listSize;
	
	public SoundManager(Context context) {
		notes = new HashMap<String, Integer>();
		soundIds = new HashMap<Integer, Boolean>();
		notesName = new ArrayList<String>();
		storeNotes(context);
		listSize = notesName.size();
	}
	
	public void playSound(String s) {
		int id = notes.get(s);
		if(soundIds.get(id)) {
			sp.play(id, 100, 100, 1, 0, 1);
		}
	}
	
	private void storeNotes(Context context) {
		sp = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
		sp.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
			
			@Override
			public void onLoadComplete(SoundPool arg0, int arg1, int arg2) {
					if(arg2 == 0) {
						soundIds.put(arg1, true);
					}
			}
		});
		int soundID = sp.load(context, R.raw.c3, 1);
		soundIds.put(soundID, false);
		notes.put("c3", soundID);
		notesName.add("c3");
		
		soundID = sp.load(context, R.raw.d3, 1);
		soundIds.put(soundID, false);
		notes.put("d3", soundID);
		notesName.add("d3");
		
		soundID = sp.load(context, R.raw.e3, 1);
		soundIds.put(soundID, false);
		notes.put("e3", soundID);
		notesName.add("e3");
		
		soundID = sp.load(context, R.raw.f3, 1);
		soundIds.put(soundID, false);
		notes.put("f3", soundID);
		notesName.add("f3");
		
		soundID = sp.load(context, R.raw.g3, 1);
		soundIds.put(soundID, false);
		notes.put("g3", soundID);
		notesName.add("g3");
		
		soundID = sp.load(context, R.raw.a3, 1);
		soundIds.put(soundID, false);
		notes.put("a3", soundID);
		notesName.add("a3");
		
		soundID = sp.load(context, R.raw.b3, 1);
		soundIds.put(soundID, false);
		notes.put("b3", soundID);
		notesName.add("b3");
		
		soundID = sp.load(context, R.raw.c4, 1);
		soundIds.put(soundID, false);
		notes.put("c4", soundID);
		notesName.add("c4");
		
	}

}
