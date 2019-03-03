package com.example.home.punctuality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class Browse extends Activity implements SwipeInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.browse_in, R.anim.saved_out);
        setContentView(R.layout.browse);

        //swipe on layout
        ActivitySwipeDetector swipe = new ActivitySwipeDetector(Browse.this, this);
        RelativeLayout swipe_layout = (RelativeLayout) findViewById(R.id.relLay);
        swipe_layout.setOnTouchListener(swipe);

        //swipe on linearLayout
        ActivitySwipeDetector swipe2 = new ActivitySwipeDetector(Browse.this, this);
        LinearLayout swipe_lin = (LinearLayout) findViewById(R.id.ll);
        swipe_layout.setOnTouchListener(swipe2);

        //swipe on SV
        ActivitySwipeDetector swipe3 = new ActivitySwipeDetector(Browse.this, this);
        ScrollView swipe_sv = (ScrollView) findViewById(R.id.sv);
        swipe_layout.setOnTouchListener(swipe3);



    }

    /*@Override
    protected void onStart(){
        super.onStart();
        overridePendingTransition(R.anim.browse_in, R.anim.saved_out);
    }*/

    @Override
    public void onLeftToRight(View v) {
        Intent intent = new Intent(Browse.this, SavedSchedules.class);
        startActivity(intent);
    }

    @Override
    public void onRightToLeft(View v) {

    }
}


