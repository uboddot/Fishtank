package model;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
public class Fish {

    public Image picture;

    String color;
    String name;

    public Fish(){
        File file = new File("pictures/clown_fish.png");
        Image image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.picture = image;
    }

    //TODO: for different fish give different pictures based on name of fish. with if else or data structure like map?
    public Fish(String name, String color){
        this.color = color;
        this.name = name;
        File file = new File("pictures/clown_fish.png");
        Image image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.picture = image;
    }

    public String toString(){
        if (this.name == null) {
            return "Fish";
        }
        else{
            return "Fish " +  this.name;
        }
    }
    
    public void set_name(String str){
        this.name = str;
    }
}
