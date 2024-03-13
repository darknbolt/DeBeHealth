public class main {
    public static void main(String[] args) {

        FoodList test = new FoodList();
        test.add(new Food("pizza", 500, 100));
        test.add(new Food("Sandwhich", 300, 100));
        Food burger = new Food("Burger", 700, 100);
        test.add(burger);
        test.printFood();
        test.remove(burger);
        test.printFood();
        //Screen mainScreen = new Screen("DeBeHealth");
    }
}
