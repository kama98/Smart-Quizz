// authour: ngum buka fon nyuydze

package com.example.myapplication;

import java.util.ArrayList;

public class QuestionCategory
{
    private String CategoryTitle;
    private String CategoryTextDescription;


    public QuestionCategory()
    {}
    public QuestionCategory(String CategoryTitle, String CategoryTextDescription)
    {
        this.CategoryTitle=CategoryTitle;
        this.CategoryTextDescription=CategoryTextDescription;

    }

    //attribute setters
    public void setCategoryTitle(String categoryTitle) {
        CategoryTitle = categoryTitle;
    }

    public void setCategoryTextDescription(String categoryTextDescription) {
        CategoryTextDescription = categoryTextDescription;
    }


    //attribute getter methods
    public String getCategoryTitle() {
        return CategoryTitle;
    }

    public String getCategoryTextDescription() {
        return CategoryTextDescription;
    }

    public static ArrayList<QuestionCategory> createCategoryList(int numCategories) {
        ArrayList<QuestionCategory> QuestionCategory_sample = new ArrayList<QuestionCategory>();

        for (int i = 1; i <= numCategories; i++) {
            QuestionCategory_sample.add(new QuestionCategory("CategoryNumber_n","please remember, you have to create multiple instances of " +
                    "the object and instantiate its various attributes"));
        }

        return QuestionCategory_sample;
    }

}
