//String Adjustable Array
public class FoodList {
    private Food[] list;
    protected String[] listNames;
    private int position;
    public FoodList(){
        this.list = new Food[0];
        this.listNames = new String[0];
        this.position = -1;
    }
    public void add(Food food){
        Food[] tempList = list;
        list = new Food[tempList.length+1];
        for(int i = 0; i < tempList.length; ++i){
            list[i] = tempList[i];
        }
        ++position;
        list[position] = food;
    }
    public void remove(Food food){
        Food[] tempList = list;
        list = new Food[tempList.length-1];
        int counter = 0;
        for(int i = 0; i < tempList.length; ++i){
            if (food != tempList[i]){
                list[counter] = tempList[i];
                ++counter;
            }
        }
        --position;
    }
    public void printFood(){
        for(int i = 0; i < list.length; ++i){
            System.out.println(list[i].getName());
        }
    }
}
