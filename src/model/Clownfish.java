package model;
public class Clownfish extends Fish{
  

    public Clownfish(){
        super();
    }

    public Clownfish(String name, String color){
        super(name,color);
    }

    @Override
    public String toString(){
        if (this.name == null) {
            return "Clownfish";
        }
        else{
            return "Clownfish " +  this.name;
        }
    }

}

