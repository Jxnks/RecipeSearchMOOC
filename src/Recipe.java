import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private static ArrayList<String> recipeName = new ArrayList<>();
    private static ArrayList<String> recipeTime = new ArrayList<>();
    private static ArrayList<String> recipeDetails = new ArrayList<>();

    public Recipe() {
        recipeName = new ArrayList<String>();
        recipeTime = new ArrayList<String>();
        recipeDetails = new ArrayList<String>();
    }

    public static void addRecipe(String recipe) {
        recipeName.add(recipe);

    }

    public static void addRecipeTime(String recipeTime) {
        recipeName.add(recipeTime);

    }

    public static void addRecipeDetails(String recipeDetails) {
        recipeName.add(recipeDetails);
    }


}
