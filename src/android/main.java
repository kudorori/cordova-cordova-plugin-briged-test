package com.clk.cordova.sample;

import org.apache.cordova.*;
import org.json.*;
import android.widget.Toast; 

public class main extends CordovaPlugin {
	
	// methods
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		
		// show
		if(action.equals("show")) {

			// test
          		String message = "Hi world";

			// execute
			Toast.makeText(this.cordova.getActivity(), message, Toast.LENGTH_LONG).show();
		
			// return
			return true;
		}
		
		// default
		return false;		
    }
}