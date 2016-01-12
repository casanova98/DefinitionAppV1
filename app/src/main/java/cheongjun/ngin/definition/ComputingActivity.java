package cheongjun.ngin.definition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import cheongjun.ngin.definition.Topics.Comp_topic1;
import cheongjun.ngin.definition.Topics.Comp_topic2;
import cheongjun.ngin.definition.Topics.Comp_topic3;
import cheongjun.ngin.definition.Topics.Comp_topic4;
import cheongjun.ngin.definition.Topics.Comp_topic5;
import cheongjun.ngin.definition.Topics.Comp_topic6;

/**
 * Created by Dennis on 20/11/2015.
 */
public class ComputingActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void comp_topic1(View v) {
        startActivity(new Intent(ComputingActivity.this, Comp_topic1.class));
    }

    public void comp_topic2(View v) {
        startActivity(new Intent(ComputingActivity.this, Comp_topic2.class));
    }
    public void comp_topic3(View v) {
        startActivity(new Intent(ComputingActivity.this, Comp_topic3.class));
    }
    public void comp_topic4(View v) {
        startActivity(new Intent(ComputingActivity.this, Comp_topic4.class));
    }
    public void comp_topic5(View v) {
        startActivity(new Intent(ComputingActivity.this, Comp_topic5.class));
    }
    public void comp_topic6(View v) {
        startActivity(new Intent(ComputingActivity.this, Comp_topic6.class));
    }



}
