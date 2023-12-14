package model;
public class Fish {


    String color;
    String name;

    public Fish(){}

    public Fish(String name, String color){
        this.color = color;
        this.name = name;
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
