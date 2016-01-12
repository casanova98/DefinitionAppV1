package cheongjun.ngin.definition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.parse.Parse;
import com.parse.ParseInstallation;




public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_appbar);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_layout), toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.navigate) {
            startActivity(new Intent(this, TopicActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
    public void button_computing(View v) {
        startActivity(new Intent(MainActivity.this, ComputingActivity.class));
    }

    public void button_chineses(View v) {
        startActivity(new Intent(MainActivity.this, ChineseActivity.class));
    }

    public void button_biology(View v) {
        startActivity(new Intent(MainActivity.this, BiologyActivity.class));
    }
    public void button_physics(View v) {
        startActivity(new Intent(MainActivity.this, PhysicsActivity.class));
    }
    public void button_chem(View v) {
        startActivity(new Intent(MainActivity.this, ChemActivity.class));
    }
    public void button_english(View v) {
        startActivity(new Intent(MainActivity.this, EngActivity.class));
    }
    public void button_geo(View v) {
        startActivity(new Intent(MainActivity.this, GeoActivity.class));
    }
    public void button_math(View v) {
        startActivity(new Intent(MainActivity.this, MathActivity.class));
    }
    public void button_econs(View v) {
        startActivity(new Intent(MainActivity.this, EconsActivity.class));
    }


}
