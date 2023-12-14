package model;
import java.util.ArrayList;
import java.util.List;

public class FishShop implements Shop{
    
    List<Fish> FishToBuy = new ArrayList<>();

    public FishShop(){
        this.FishToBuy.add(new Clownfish());
    }

    public List<Fish> get_FishToBuy(){return FishToBuy;};

    public String stuff_to_buy_to_string(){
        return FishToBuy.toString();
    }

}
