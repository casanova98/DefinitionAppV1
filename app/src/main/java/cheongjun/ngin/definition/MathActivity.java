package cheongjun.ngin.definition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import cheongjun.ngin.definition.Topics.Chinese_topic1;
import cheongjun.ngin.definition.Topics.Chinese_topic2;
import cheongjun.ngin.definition.Topics.Chinese_topic3;
import cheongjun.ngin.definition.Topics.Comp_topic1;
import cheongjun.ngin.definition.Topics.Comp_topic2;
import cheongjun.ngin.definition.Topics.Comp_topic3;
import cheongjun.ngin.definition.Topics.Math_topic1;
import cheongjun.ngin.definition.Topics.Math_topic2;
import cheongjun.ngin.definition.Topics.Math_topic3;

/**
 * Created by Dennis on 20/11/2015.
 */
public class MathActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void math_topic1(View v) {
        startActivity(new Intent(MathActivity.this, Math_topic1.class));
    }

    public void math_topic2(View v) {
        startActivity(new Intent(MathActivity.this, Math_topic2.class));
    }
    public void math_topic3(View v) {
        startActivity(new Intent(MathActivity.this, Math_topic3.class));
    }


}
