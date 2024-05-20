package GUI;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import model.*;


public class Aqua_frame extends JFrame {
        
        Shop fish_shop;

        public Aqua_frame(Shop fish_shop){

            this.fish_shop = fish_shop;

            this.setTitle("Start window");
            this.setSize(500 ,500);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JMenuBar menubar = new JMenuBar();
            JMenu menu = new JMenu("shop");
            JMenuItem shop = new JMenuItem("shop");
            JMenuItem item = new JMenuItem("item");
            
            AL_Shop_Menu al = new AL_Shop_Menu(this.fish_shop);
            shop.addActionListener(al);

            menu.add(item);
            menu.add(shop);
        
            menubar.add(menu);
            this.setJMenuBar(menubar);

            JPanel main_panel = new JPanel();
            JButton button_show_aquarium = new JButton("Show Aquarium");
            main_panel.add(button_show_aquarium);
            main_panel.setBackground(Color.red);
            this.add(main_panel);

            this.setVisible(true);

        }

        //Todo: should be able to display the picutres of fishes in the tank
        // todo: the fish in the tank actually move.


}
