package com.gmaslowski.f1stats.activity.main;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

class ButterknifedActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.inject(this);
    }
}
