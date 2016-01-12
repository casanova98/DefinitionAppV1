package cheongjun.ngin.definition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import cheongjun.ngin.definition.Topics.Eng_topic1;
import cheongjun.ngin.definition.Topics.Eng_topic2;
import cheongjun.ngin.definition.Topics.Eng_topic3;

/**
 * Created by Dennis on 20/11/2015.
 */
public class EngActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void eng_topic1(View v) {
        startActivity(new Intent(EngActivity.this, Eng_topic1.class));
    }

    public void eng_topic2(View v) {
        startActivity(new Intent(EngActivity.this, Eng_topic2.class));
    }

    public void eng_topic3(View v) {
        startActivity(new Intent(EngActivity.this, Eng_topic3.class));
    }

}