package com.example.githubhello1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GitubHello1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gitub_hello1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_gitub_hello1, menu);
		return true;
	}

}
