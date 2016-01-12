package cheongjun.ngin.definition;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.PushService;
import com.parse.SaveCallback;


public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "PfYMJUWkXQ1irq6WxCU3AHLqQ5XO6eYkPTWFS3Mo", "duD6XAFmuEMf5ZaPdj3rBifZYNYE05Ekx6lePXwN");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}


