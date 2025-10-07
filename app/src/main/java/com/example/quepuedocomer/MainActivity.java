package com.example.quepuedocomer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Create a simple TextView programmatically
        TextView textView = new TextView(this);
        textView.setText("¡Hola! Que Puedo Comer App");
        textView.setTextSize(24);
        textView.setPadding(50, 50, 50, 50);
        
        // Set the TextView as the content view
        setContentView(textView);
    }
}
