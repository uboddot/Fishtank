package GUI;

import javax.swing.*;
import java.awt.*;

import model.*;

public class JFrame_Shop extends JFrame{
    
    Shop shop;
    //TODO: mechanism to add fish to the tank. show more than one fish icon. (idea as panels or whatever that on clicking will be added to the aquarium...)
    public JFrame_Shop(Shop shop){

        this.shop = shop;

        this.setTitle("Shop");
        this.setSize(500 ,500);
        this.setLocationRelativeTo(null);

        

        JPanel panel = new JPanel();
        JTextField text = new JTextField(this.shop.stuff_to_buy_to_string());
        // add image of fish
        ImageIcon icon = new ImageIcon(this.shop.get_FishToBuy().getFirst().picture);
        JLabel fish_image = new JLabel(icon);
        panel.setLayout(new BorderLayout());
        //panel.add(text, BorderLayout.NORTH);
        panel.add(fish_image, BorderLayout.CENTER);
        
        this.add(panel);
        
        this.setVisible(true);

    }
}
