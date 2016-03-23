package com.example.martin.bloodline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by martin on 3/23/16.
 */
public class Splash_Screen extends Activity {
        /** Duration of wait **/
        private final int SPLASH_DISPLAY_LENGTH = 1000;

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            setContentView(R.layout.content_splash__screen);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
            //int SPLASH_TIME_OUT = 1000;
            new android.os.Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer.
             */

                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    Intent i = new Intent(Splash_Screen.this, SignupActivity.class);
                    startActivity(i);

                    // close this activity
                    finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
        }
    }

