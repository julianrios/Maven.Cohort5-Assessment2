package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
   private List<String> strings = new ArrayList<>();
    private int numberInStock;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = strings;
        this.numberInStock = 0;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strings = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        strings.add(item);
        this.numberInStock++;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        strings.remove(item);
        this.numberInStock--;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        int numberInStock = 0;
        for(String thing : this.strings) {
            if(thing.equals(item)) {
                numberInStock++;
            } else {
                numberInStock = 0;
            }
        }
        return numberInStock;
    }
}
