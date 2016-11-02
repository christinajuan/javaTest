package tw.org.iii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by iii-user on 2016/11/2.
 */
public class Lab20 extends JFrame{
    private JButton open, save, exit;

    public Lab20(){
        super("我的視窗程式");
        setSize(640,480);
        setLayout(new FlowLayout());

        open = new JButton("Open");
        save = new JButton("Save");
        exit = new JButton("Exit");
        add(open); add(save); add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
        System.out.println("I am Lab20()");
    }
    public static void main(String[] args){
        Lab20 b1 = new Lab20();
    }
}
