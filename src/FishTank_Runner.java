import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import GUI.Aqua_frame;
import model.Aquarium;
import model.Clownfish;
import model.FishShop;




public class FishTank_Runner {
    
    public static void main(String[] args){

        Aquarium tank = new Aquarium();
        FishShop fish_shop = new FishShop();
        
        Aqua_frame main_window = new Aqua_frame(fish_shop);

        

    }
}
