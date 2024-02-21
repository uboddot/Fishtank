package model;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    String name;
    List<Fish> fish_in_tank = new ArrayList<>();
    //just a comment
    public Aquarium(String str){
        this.name = str;
    }
    public Aquarium(){}

    public void addFish(Fish f){
        this.fish_in_tank.add(f);
    }
    public List<Fish> getFish(){
        return fish_in_tank;
    }

}
