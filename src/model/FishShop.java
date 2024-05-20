package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FishShop implements Shop{
    
    List<Fish> FishToBuy = new ArrayList<>();

    public FishShop(){
        this.FishToBuy.add(new Clownfish());
    }

    //TODO: shows picutre of fish aswell
    //TODO: mechanism to add fish to the tank
    public List<Fish> get_FishToBuy(){return FishToBuy;};

    public String stuff_to_buy_to_string(){
        return FishToBuy.toString();
    }

}
