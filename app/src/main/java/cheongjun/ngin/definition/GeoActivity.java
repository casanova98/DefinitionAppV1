package cheongjun.ngin.definition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import cheongjun.ngin.definition.Topics.Geo_topic1;
import cheongjun.ngin.definition.Topics.Geo_topic2;
import cheongjun.ngin.definition.Topics.Geo_topic3;


public class GeoActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void geo_topic1(View v) {
        startActivity(new Intent(GeoActivity.this, Geo_topic1.class));
    }

    public void geo_topic2(View v) {
        startActivity(new Intent(GeoActivity.this, Geo_topic2.class));
    }
    public void geo_topic3(View v) {
        startActivity(new Intent(GeoActivity.this, Geo_topic3.class));
    }

}
