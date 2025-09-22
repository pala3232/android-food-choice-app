package com.example.quepuedocomer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {
    
    private String[] foodOptions = {
        "smash burgers", 
        "spaghetti", 
        "pie", 
        "pizza", 
        "sorrentinos"
    };
    
    private Random random = new Random();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button foodButton = findViewById(R.id.food_button);
        TextView resultText = findViewById(R.id.result_text);
        
        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomIndex = random.nextInt(foodOptions.length);
                String selectedFood = foodOptions[randomIndex];
                resultText.setText("Puedes comer: " + selectedFood);
            }
        });
    }
}