import javax.swing.*;

public class Screen {
    public Screen(String name){
        //Frame
        JFrame frame = new JFrame(name);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //TODO:: Set up icon image

        //Food List


        JList testList = new JList();
        testList.setBounds(30, 30 , 100, 100);

        //Button -> New Food
        JButton addFood = new JButton("+");
        addFood.setBounds(700, 200, 30, 30);

        //Frame Adding
        frame.add(addFood);
        frame.add(testList);

        //End
        frame.setVisible(true);
    }
}
