package com.example.home.punctuality;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextView;

public class OptionsDDOICL implements AdapterView.OnItemClickListener {

    @Override
    public void onItemClick(AdapterView<?> arg0, View v, int arg2, long arg3) {

        // get the context and main activity to access variables
        Context mContext = v.getContext();
        SavedSchedules savedSchedules = ((SavedSchedules) mContext);

        // add some animation when a list item was clicked
        Animation fadeInAnimation = AnimationUtils.loadAnimation(v.getContext(), android.R.anim.fade_in);
        fadeInAnimation.setDuration(10);
        v.startAnimation(fadeInAnimation);

        // dismiss the pop up
        savedSchedules.popupWindowOptions.dismiss();

        // get the text and set it as the button text
        String selectedItemText = ((TextView) v).getText().toString();
        savedSchedules.buttonShowDropDown.setText(selectedItemText);



    }

}

