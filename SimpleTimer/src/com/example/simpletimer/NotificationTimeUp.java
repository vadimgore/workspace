package com.example.simpletimer;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
// import android.widget.TextView;


public class NotificationTimeUp extends Activity{
	@Override
	   public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      // Create a new view after the notification is set
	      // No need to implement for now
	      // setContentView(R.layout.notification_timeup);
	      
	      int id=0;
	      
	      /*
	      Bundle extras = getIntent().getExtras();
			if (extras == null) {
				s = "error";
			}
			else {
				id = extras.getInt("notificationId");
			}
			*/
			//TextView t = (TextView) findViewById(R.id.text_notification_timeup);
			//s = s+"with id = "+id;
			//t.setText(s);
			NotificationManager myNotificationManager = 
					(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
			
			// remove the notification with the specific id
			myNotificationManager.cancel(id);
	   }
}
