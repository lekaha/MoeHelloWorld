package co.lkh.android.moehelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import co.lkh.android.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld helloWorld = new HelloWorld("John");

        TextView textView = (TextView) findViewById(R.id.textview);
        String text = textView.getText() + helloWorld.getName();
        textView.setText(text);

    }
}
