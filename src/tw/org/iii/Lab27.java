package tw.org.iii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab27 extends JFrame implements ActionListener{
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;

    public Lab27(){
        //super();
        super("視窗練習");
        setLayout(new BorderLayout());

        newFile = new JButton("New");
        openFile = new JButton("Open");
        saveFile = new JButton("Save");
        saveAsFile = new JButton("Save as");
        exit = new JButton("Exit");
        editor = new JTextArea();

        newFile.addActionListener(new MyListener());
        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("C");
            }
        });

        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);top.add(openFile);top.add(saveAsFile);
        top.add(saveFile);top.add(exit);

        add(top,BorderLayout.NORTH);
        add(editor, BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Lab27();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("B");
    }
}
class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("A");
    }
}