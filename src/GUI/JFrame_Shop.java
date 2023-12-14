package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import model.*;

public class JFrame_Shop extends JFrame{
    
    Shop shop;

    public JFrame_Shop(Shop shop){

        this.shop = shop;

        this.setTitle("Shop");
        this.setSize(500 ,500);
        this.setLocationRelativeTo(null);

        

        JPanel panel = new JPanel();
        JTextField text = new JTextField(this.shop.stuff_to_buy_to_string());
        System.out.println(this.shop.stuff_to_buy_to_string());
        panel.setLayout(new BorderLayout());
        panel.add(text, BorderLayout.NORTH);
        
        this.add(panel);
        
        this.setVisible(true);

    }
}
