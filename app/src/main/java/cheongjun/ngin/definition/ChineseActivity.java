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

/**
 * Created by Dennis on 20/11/2015.
 */
public class ChineseActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void chinese_topic1(View v) {
        startActivity(new Intent(ChineseActivity.this, Chinese_topic1.class));
    }

    public void chinese_topic2(View v) {
        startActivity(new Intent(ChineseActivity.this, Chinese_topic2.class));
    }
    public void chinese_topic3(View v) {
        startActivity(new Intent(ChineseActivity.this, Chinese_topic3.class));
    }

}
