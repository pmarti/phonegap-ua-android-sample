package org.minimoesfuerzo;

import android.os.Bundle;

import com.phonegap.DroidGap;
import com.urbanairship.UAirship;

public class MainActivity extends DroidGap {
	private static MainActivity instance = null;

	public MainActivity () {
		instance = this;
	}

	public static MainActivity getInstance() {
		return instance;
	}

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public void onStart() {
        super.onStart();
        UAirship.shared().getAnalytics().activityStarted(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        UAirship.shared().getAnalytics().activityStopped(this);
    }
}
