package tw.org.iii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class MyPanel extends JPanel {
    private LinkedList<LinkedList<HashMap<String,Integer>>> lines, recycle;

    public  MyPanel(){
        MyMouseListener myMouseListener = new MyMouseListener();
        addMouseMotionListener(new MyMouseListener());
        addMouseListener(myMouseListener);
        lines = new LinkedList<>();
        recycle = new LinkedList<>();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("paintComponent()");
        Graphics2D g2d = (Graphics2D)g;

        setBackground(Color.BLACK);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(2));

        for (LinkedList<HashMap<String,Integer>> line : lines){
            //4
            for(int i=1; i<line.size();i++){
                HashMap<String,Integer> p0 = line.get(i-1);
                HashMap<String,Integer> p1 = line.get(i);
                g2d.drawLine(p0.get("x"),p0.get("y"),
                        p1.get("x"),p1.get("y"));
            }
        }
    }
    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
            int x = e.getX();int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",x);point.put("y",y);
            line.add(point);
            lines.add(line);
            recycle.remove();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getX();int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x",x);point.put("y",y);
            lines.getLast().add(point);
            repaint();
        }
    }

    void clear(){
        lines.clear();
        repaint();
    }

    void undo(){
        if(lines.size()>0){
            recycle.add(lines.removeLast());
            repaint();
        }
    }

    void redo(){
        if(recycle.size()>0){
            lines.add(recycle.removeLast());
            repaint();
        }
    }
}
