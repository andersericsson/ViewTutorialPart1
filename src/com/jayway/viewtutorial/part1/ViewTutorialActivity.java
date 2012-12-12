package com.jayway.viewtutorial.part1;

import android.app.Activity;
import android.os.Bundle;

public class ViewTutorialActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Model model = new Model();

        DurationTextView durationView1 = (DurationTextView) findViewById(R.id.total);
        durationView1.setDuration(model.getTotalDuration());

        DurationTextView durationView2 = (DurationTextView) findViewById(R.id.walking);
        durationView2.setDuration(model.walkingDuration);

        DurationTextView durationView3 = (DurationTextView) findViewById(R.id.running);
        durationView3.setDuration(model.runningDuration);

        DurationTextView durationView4 = (DurationTextView) findViewById(R.id.cycling);
        durationView4.setDuration(model.cyclingDuration);

        DistanceTextView distanceView = (DistanceTextView) findViewById(R.id.distance);
        distanceView.setDistance(model.totalDistance);
    }

    class Model {
        int walkingDuration = 2453;
        int runningDuration = 20314;
        int cyclingDuration = 12012;
        int totalDistance = 38173;

        int getTotalDuration() {
            return walkingDuration + runningDuration + cyclingDuration;
        }
    }
}