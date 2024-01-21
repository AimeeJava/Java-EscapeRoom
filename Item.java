package Assignment.A3;

public abstract class Item {
    private String id;
    private boolean used;
    public Item(String id){
        this.id = id;
        this.used = false;
    }
    public String getId(){
        return this.id;
    }
    public void setUsed(boolean used){
        this.used = used;
    }
    public boolean isUsed(){
        return this.used;
    }
}
