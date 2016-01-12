package cheongjun.ngin.definition;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import cheongjun.ngin.definition.Topics.Bio_topic1;
import cheongjun.ngin.definition.Topics.Bio_topic2;
import cheongjun.ngin.definition.Topics.Bio_topic3;
import cheongjun.ngin.definition.Topics.Chem_topic1;
import cheongjun.ngin.definition.Topics.Chem_topic2;
import cheongjun.ngin.definition.Topics.Chem_topic3;
import cheongjun.ngin.definition.Topics.Econs_topic1;

/**
 * Created by Dennis on 20/11/2015.
 */
public class EconsActivity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void econs_topic1(View v) {
        startActivity(new Intent(EconsActivity.this, Econs_topic1.class));
    }


}