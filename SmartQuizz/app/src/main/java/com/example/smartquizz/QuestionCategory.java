// authour: ngum buka fon nyuydze

package com.example.smartquizz;

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
    
    
    //TODO 1.1 querry and get the list of categories title and sqve it in an array of type string
    //TODO 2 querry qnd get the description of each category into into an array of type string
    //TODO 3 ensure that the array of title equals in lenght the array of description and that
    // for any i-titles is a corresponding i-description
    //TODO 3.1 pass corresponding parameters to the createCategoryList(String[] titles,String[] description)
    //TODO 3.2 create an array of type QuestionCategory and assign to it the called function createCategoryList
    // which returns an array of QuestionCategory.

    public static ArrayList<QuestionCategory> createCategoryList(String[] titles,String[] description)
    {
        int numCategories=titles.length;
        ArrayList<QuestionCategory> QuestionCategory_LIST = new ArrayList<QuestionCategory>();
        for (int i = 1; i <= numCategories; i++) {
            QuestionCategory_LIST.add(new QuestionCategory(titles[i],description[i]));
        }
        return QuestionCategory_LIST;
    }

    //TODO 4 in case you do not yet have categories then run the createSampleCategoryList method and
    // pass the number of sample caterories you wish to have in the app
    

    public static ArrayList<QuestionCategory> createCategoryList(int numCategories) {
        ArrayList<QuestionCategory> QuestionCategory_sample = new ArrayList<QuestionCategory>();

        for (int i = 1; i <= numCategories; i++) {
            QuestionCategory_sample.add(new QuestionCategory("CategoryNumber_n","please remember, you have to create multiple instances of " +
                    "the object and instantiate its various attributes"));
        }

        return QuestionCategory_sample;
    }

}
