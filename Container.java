package Assignment.A3;

import java.util.ArrayList;

public abstract class Container extends Item{
    private static ArrayList<Item> items = new ArrayList<>();
    private boolean used;
    public Container(String id){
        super(id);
        this.used = false;
    }
    public static void addItem(Item item){

        items.add(item);
    }
    public Item removeItem(){
        if(!isUsed() && items.isEmpty()){
            Item item = items.get(items.size() - 1);
            items.remove(items.size() - 1);
            return item;
        }
        return null;
    }
}
