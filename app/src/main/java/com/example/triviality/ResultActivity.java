package com.example.triviality;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get rating bar object
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
		bar.setNumStars(5);
		bar.setStepSize(0.5f);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		bar.setRating(score);
		MediaPlayer lose= MediaPlayer.create(ResultActivity.this,R.raw.lose);
		MediaPlayer win= MediaPlayer.create(ResultActivity.this,R.raw.win);
		switch (score)
		{
		case 0:
			t.setText("Are You Even Trying?");
			lose.start();
		break;
		case 1:
		case 2:
			t.setText("Oopsie! Better Luck Next Time!");
			lose.start();
		break;
		case 3:
		case 4:
			t.setText("Hmmmm.. Someone's been reading a lot of trivia");
			win.start();
		break;
		case 5:
			t.setText("Who are you? A trivia wizard???");
			win.start();
		break;
		}
		final View button = findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = getBaseContext().getPackageManager()
						.getLaunchIntentForPackage(getBaseContext().getPackageName());
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}
}
