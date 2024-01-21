package Assignment.A3;

public class Prize extends Item{
    private String name;
    public Prize(String id, String name){
        super(id);
        this.name = name;
    }
    public String getName(){return name;}
    public String toString(){
        return name;
    }
}
