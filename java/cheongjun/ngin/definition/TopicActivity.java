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

    public void button_comp(View v) {
        startActivity(new Intent(TopicActivity.this, SubActivity.class));
    }

    public void button_chinese(View v) {
        startActivity(new Intent(TopicActivity.this, SubActivity2.class));
    }

    public void button_politics(View v) {
        startActivity(new Intent(TopicActivity.this, SubActivity3.class));
    }

}
