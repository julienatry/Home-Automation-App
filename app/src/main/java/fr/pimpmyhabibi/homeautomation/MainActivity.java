package fr.pimpmyhabibi.homeautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writeJSON();
    }

    public void writeJSON() {
        JSONObject object = new JSONObject();
        try {
            object.put("test1", "aaaaaa");
            object.put("test2", "bbbbbb");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jsonStr = object.toString();
        TextView testView = findViewById(R.id.testTextView);
        testView.setText(jsonStr);
    }
}