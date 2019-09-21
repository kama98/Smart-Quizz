package com.example.smartquizz.Common;
import com.example.smartquizz.Model.Category;

public class Common {
    public static Category selectedCategory = new Category();

    public enum ANSWER_TYPE{
        WRONG_ANSWER,
        RIGHT_ANSWER,
        NO_ANSWER

    }
}
