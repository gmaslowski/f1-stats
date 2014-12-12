package com.gmaslowski.f1stats.activity.main;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.gmaslowski.f1stats.R;

import butterknife.InjectView;

public class F1MainActivity extends ButterknifedActivity {

    @InjectView(R.id.track_select_list)
    private ExpandableListView trackListView;

    @InjectView(R.id.driver_select_list)
    private ExpandableListView driverListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f1_main);
    }
}

