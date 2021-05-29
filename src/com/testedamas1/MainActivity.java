package com.testedamas1;




//import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button menuButton = (Button) this.findViewById(R.id.game_button);
		menuButton.setOnClickListener(this);
		menuButton = (Button) this.findViewById(R.id.website_button);
		menuButton.setOnClickListener(this);
		menuButton = (Button) this.findViewById(R.id.settings_button);
		menuButton.setOnClickListener(this);
		menuButton = (Button) this.findViewById(R.id.about_us_button);
		menuButton.setOnClickListener(this);
		menuButton = (Button) this.findViewById(R.id.license_button);
		menuButton.setOnClickListener(this);
		menuButton = (Button) this.findViewById(R.id.quit_button);
		menuButton.setOnClickListener(this);
		
		
	}

	
	public void onClick(View view) {
		// Determine which view fired off this event.
		switch (view.getId()) {
		case R.id.game_button:
			this.startGame();
			break;
		case R.id.quit_button:
			this.quitApp();
			break;
		};
	}
	
	private void quitApp() {
		this.finish();
	}

	private void startGame() {
		Intent launchDisplay = new Intent(this, PlayActivity.class);
		startActivity(launchDisplay);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
