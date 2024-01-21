package Assignment.A3;

public class Key extends Item{
    public Key(String id){
        super(id);
    }
    public String toString(){
        return this.getId() + " key";
    }
}
