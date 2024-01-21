package Assignment.A3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escape1 {
    private final static String prizeID = "EXIT";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        // Equipment
        in.next();
        int equipment = in.nextInt();
        Item prize = new Prize(prizeID, "Escaped!");
        items.add(prize);
        for (int i = 0; i < equipment; i++) {
            Key key = new Key(in.next());
            items.add(key);
            in.next();
            Box box = new Box(in.next());
            items.add(box);
            box.lockWith(key);
        }

        in.next();
        int setup = in.nextInt();
        for (int i = 0; i < setup; i++) {
            Container container = (Container)findItem(items, in.next());
            assert container != null;
            in.next();
            Item item = findItem(items, in.next());
            container.addItem(item);
        }

        in.next();
        int finds = in.nextInt();
        List<Item> table = new ArrayList<>();
        int currentItem = 0;
        for (int i = 0; i < finds; i++) {
            Item foundItem = findItem(items, in.next());
            in.next();//found
            table.add(foundItem);
            System.out.println("Have " + foundItem);

            for ( ; currentItem < table.size(); currentItem++) {
                Item nextItem = table.get(currentItem);
                System.out.println("Check " + nextItem);
                for (Item tableItem : table) {
                    if (!tableItem.isUsed()) {
                        Box box = null;
                        if (nextItem instanceof Key && tableItem instanceof Box) {
                            box = tryKeyOnBox((Key) nextItem, (Box) tableItem);
                        } else if (tableItem instanceof Key && nextItem instanceof Box) {
                            box = tryKeyOnBox((Key) tableItem, (Box) nextItem);
                        }

                        if (box != null) {
                            System.out.println("Open " + box);
                            Item item = box.removeItem();
                            table.add(item);
                            box.setUsed(true);
                            System.out.println("Have " + item);
                            if (item == prize) {
                                return;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    static Box tryKeyOnBox(Key key, Box box) {
        if (box.unlockWith(key) && box.isOpen()) {
            key.setUsed(true);
            System.out.println("Unlock " + box + " with " + key);
            return box;
        }
        return null;
    }

    static Item findItem(List<Item> list, String id) {
        for (Item item : list) {
            if (id.equals(item.getId())) {
                return item;
            }
        }
        return null;
    }
}
