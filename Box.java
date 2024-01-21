package Assignment.A3;

public class Box extends Container{
    private Key key;
    private boolean locked;
    public Box(String id) {
        super(id);
        this.locked = false;
    }
    public void lockWith(Key key){
        this.key = key;
        this.locked = true;
    }
    public boolean unlockWith(Key key){
        if(locked && this.key.equals(key)){
            this.locked = false;
            return true;
        }
        return false;
    }
    public boolean isOpen(){
        return !locked;
    }
    public String toString(){
        return getId() + " box";
    }

}
