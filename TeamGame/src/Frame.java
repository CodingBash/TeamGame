import javax.swing.JFrame;

public class Frame {

  public static void main(String[] args) {
    JFrame f = new JFrame("Frame Title Goes Here"); 
    Panel p = new Panel();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(p);
    f.pack();
    f.setVisible(true);
    p.setFocusable(true);
    p.requestFocusInWindow();
    p.run();
    f.dispose();
  }
}