package com.example.home.punctuality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Home extends Activity {

    //Timer timer;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                /* Create an intent that will start the main activity. */
                Intent mainIntent = new Intent(Home.this,
                        SavedSchedules.class);
                mainIntent.putExtra("id", "1");

                //SplashScreen.this.startActivity(mainIntent);
                startActivity(mainIntent);
                /* Finish splash activity so user cant go back to it. */
                Home.this.finish();

                     /* Apply our splash exit (fade out) and main
                        entry (fade in) animation transitions. */
                overridePendingTransition(R.anim.browse_in,R.anim.saved_out);
            }
        }, 1500);
    }

        //timer = new Timer();
       // timer.schedule(new TimerTask() {
          //  @Override
          //  public void run() {
           //     Intent intent = new Intent(Home.this, SavedSchedules.class);
           //     startActivity(intent);
           // }
       // }, 2000);
   // }
}
