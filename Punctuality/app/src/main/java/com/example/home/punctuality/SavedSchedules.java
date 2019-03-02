package com.example.home.punctuality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SavedSchedules extends Activity implements SwipeInterface{

    String popUpContents[];
    PopupWindow popupWindowOptions;
    Button buttonShowDropDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.saved_in, R.anim.browse_out);
        setContentView(R.layout.saved);

        //swipe on layout
        ActivitySwipeDetector swipe = new ActivitySwipeDetector(SavedSchedules.this, this);
        RelativeLayout swipe_layout = (RelativeLayout) findViewById(R.id.relLayo);
        swipe_layout.setOnTouchListener(swipe);

        //swipe on scroll view
        ActivitySwipeDetector swipe2 = new ActivitySwipeDetector(SavedSchedules.this, this);
        ScrollView swipe_scroll = (ScrollView) findViewById(R.id.scrollView);
        swipe_scroll.setOnTouchListener(swipe2);

        ActivitySwipeDetector swipe3 = new ActivitySwipeDetector(SavedSchedules.this, this);
        TextView swipe_title = (TextView) findViewById(R.id.textView5);
        swipe_scroll.setOnTouchListener(swipe3);



        /*TextView tx = (TextView)findViewById(R.id.textView);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "font/elixia.ttf");
        tx.setTypeface(custom_font);*/


    }

        /*@Override
        protected void onStart(){
        super.onStart();
        overridePendingTransition(R.anim.saved_in, R.anim.browse_out);
        }*/

        @Override
        public void onLeftToRight(View v) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onRightToLeft(View v) {
            Intent intent = new Intent(SavedSchedules.this, Browse.class);
            startActivity(intent);
        }
    }





