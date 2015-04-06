package com.jordanpeterson.textly;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class TextlyApplication extends Application {
	public void onCreate() {
		
		super.onCreate();
	Parse.enableLocalDatastore(this);
	Parse.initialize(this, "VdZyTBoSH6BdPEialgpibPwlEWxJQAHcpoAeEoOy", "rSRHYBGgVFLPQdBwcdAWPdHe5ABIsgWoDaCHMsoW");
	
	}
}
