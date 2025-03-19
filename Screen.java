import javax.swing.*;

  public class Screen extends JFrame {
    public Screen(){
      setTitle("TImeSkip"); //Window title
      setVisible(true); //Visible window
      setSize(800,500); //Window frame size
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit frame on close button
      setLocationRelativeTo(null);//The frame starts centered on screen
}}
