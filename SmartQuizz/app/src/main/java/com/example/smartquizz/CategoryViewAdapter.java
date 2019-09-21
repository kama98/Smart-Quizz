package com.example.myapplication;



import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class CategoryViewAdapter extends RecyclerView.Adapter<CategoryViewAdapter.ViewHolder>
{

    // Store a member variable for the contacts   QuestionCategory
    private List<QuestionCategory> categories;

    // overriden constructors
    public CategoryViewAdapter(List<QuestionCategory> categories)
    {
        this.categories = categories;
    }
    // default constructors
    public CategoryViewAdapter() { }

    //inflating a layout from XML and returning the holder
    @Override
    public CategoryViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View categoryView = inflater.inflate(R.layout.category_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(categoryView);
        return viewHolder;
    }

    // populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get the data model based on position
        QuestionCategory questionCategory = categories.get(position);

        // Set item views based on your views and data model

        try
        {
            TextView categoryTitle_text = viewHolder.categoryTitle;
            TextView categoryDescription_text = viewHolder.categoryDescription;
            categoryTitle_text.setText(questionCategory.getCategoryTitle());
            categoryDescription_text.setText(questionCategory.getCategoryTextDescription());

        }
        catch (Exception e) { }

    }
    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return categories.size();
    }


    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView categoryTitle;
        public TextView categoryDescription;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView)
        {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            categoryTitle = (TextView) itemView.findViewById(R.id.category_title);
            categoryDescription = (TextView) itemView.findViewById(R.id.category_description);
        }
    }
 }

