package cheongjun.ngin.definition;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TopicActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void qns_comp(View v) {
        startActivity(new Intent(TopicActivity.this, ComputingQuestion.class));
    }

    public void qns_chinese(View v) {
        startActivity(new Intent(TopicActivity.this, ChineseQuestion.class));
    }

    public void qns_math(View v) {
        startActivity(new Intent(TopicActivity.this, MathQuestion.class));
    }

    public void qns_bio(View v) {
        startActivity(new Intent(TopicActivity.this, BioQuestion.class));
    }

    public void qns_chem(View v) {
        startActivity(new Intent(TopicActivity.this, ChemQuestion.class));
    }

    public void qns_physics(View v) {
        startActivity(new Intent(TopicActivity.this, PhysicsQuestion.class));
    }

    public void qns_econs(View v) {
        startActivity(new Intent(TopicActivity.this, EconsQuestion.class));
    }

    public void qns_gp(View v) {
        startActivity(new Intent(TopicActivity.this, GPQuestion.class));
    }



}
