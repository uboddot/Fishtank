package model;
public class Fish {

    //TODO: a fish has a picutre
    //TODO: you can give a picture when instanciating.
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
