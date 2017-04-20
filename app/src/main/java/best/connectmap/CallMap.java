package best.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);

    }   //onCreate Method

    public void runCallmap(View view){

     //Initalview
        EditText Latitude = (EditText) findViewById(R.id.mapLat);
        EditText Longtitude = (EditText) findViewById(R.id.mapLong);
        EditText Labeltitude = (EditText) findViewById(R.id.mapLabel);

        String lat = Latitude.getText().toString();
        String lng = Longtitude.getText().toString().trim();

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:xxxx,xxx");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.app.maps"); //ใช้กับจินนี่ไม่ได้
        startActivity(mapIntent);
    }  //runcallmap
}     //Main Class
