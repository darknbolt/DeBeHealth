import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

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
        FoodList userList = new FoodList();
        JList testList = new JList(userList.getNameList());
        testList.setBounds(30, 30 , 100, 100);

        //Button -> New Food
        JButton addFood = new JButton("+");
        addFood.setBounds(200, 200, 40, 40);
        addFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameFood = new JFrame();
                frameFood.setSize(100, 180);
                frameFood.setLayout(null);

                JTextField name = new JTextField("Name");
                JTextField calorie = new JTextField("Calorie");
                JTextField grams = new JTextField("Grams");
                JButton enter = new JButton("Enter");

                name.setBounds(20, 20, 60, 20);
                calorie.setBounds(20, 40, 60, 20);
                grams.setBounds(20, 60, 60, 20);
                enter.setBounds(20, 80, 60, 20);

                frameFood.add(name);
                frameFood.add(calorie);
                frameFood.add(grams);
                frameFood.add(enter);

                enter.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        userList.add(new Food(name.getText(), Integer.parseInt(calorie.getText()), Integer.parseInt(grams.getText())));
                        testList.setListData(userList.getNameList());
                        frameFood.dispatchEvent(new WindowEvent(frameFood, WindowEvent.WINDOW_CLOSING));
                    }
                });

                frameFood.setVisible(true);
            }
        });

        //Frame Adding
        frame.add(addFood);
        frame.add(testList);

        //End
        frame.setVisible(true);
    }
}
