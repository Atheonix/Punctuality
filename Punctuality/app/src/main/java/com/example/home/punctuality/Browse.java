package com.example.home.punctuality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class Browse extends Activity implements SwipeInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.browse_in, R.anim.saved_out);
        setContentView(R.layout.browser);

        //swipe on layout
        ActivitySwipeDetector swipe = new ActivitySwipeDetector(Browse.this, this);
        RelativeLayout swipe_layout = (RelativeLayout) findViewById(R.id.relLay);
        swipe_layout.setOnTouchListener(swipe);

        //swipe on scrollview
        ActivitySwipeDetector swipe2 = new ActivitySwipeDetector(Browse.this, this);
        ScrollView swipe_scroll = (ScrollView) findViewById(R.id.scrollView);
        swipe_layout.setOnTouchListener(swipe2);

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


