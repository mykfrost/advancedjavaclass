import javax.swing.*;
import java.awt.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MGui {
    public static void main(String[] args){
        JFrame fram = new JFrame("My First GUI");
        fram.setSize(400,300);
        //fram.setBackground(Color.DARK_GRAY);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Click Here");
        //button.setBackground(Color.BLUE);
        fram.add(button);
        fram.setVisible(true);
    }
}
