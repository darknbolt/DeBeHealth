public class Food {
    private String name;
    private int calories;
    private int grams;
    public Food(String name, int calories, int grams){
        this.name = name;
        this.calories = calories;
        this.grams = grams;
    }
    public String getName(){
        return name;
    }
    public int getCalories(){
        return calories;
    }
    public int getGrams(){
        return grams;
    }
    public String toString(){
        return name + " Calories: " + calories + " per " + grams;
    }
}
