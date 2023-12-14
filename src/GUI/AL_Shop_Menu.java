package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Shop;

public class AL_Shop_Menu implements ActionListener {

    Shop shop;

    public AL_Shop_Menu(Shop shop){
        this.shop = shop;
    }

    public void actionPerformed(ActionEvent e){
        JFrame_Shop shop_window = new JFrame_Shop(this.shop);
    }
    
}
