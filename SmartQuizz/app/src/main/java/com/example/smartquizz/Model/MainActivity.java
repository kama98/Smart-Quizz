package com.example.smartquizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<QuestionCategory> categories;

        RecyclerView categoriesRecycler = (RecyclerView) findViewById(R.id.categoryRecyclerView);
        // Initialize contacts
        categories = QuestionCategory.createCategoryList(20);
        // Create adapter passing in the sample user data
        CategoryViewAdapter adapter = new CategoryViewAdapter(categories);
        // Attach the adapter to the recyclerview to populate items
        categoriesRecycler.setAdapter(adapter);
        // Set layout manager to position the items
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this));
        // That's all!
        setContentView(R.layout.activity_main);
    }
}
