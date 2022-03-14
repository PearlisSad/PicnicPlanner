import java.util.*;
import java.io.*;

public class DrinkStore extends PicnicItemStore {
    public DrinkStore() {
        super(); //Super() for this class
    }

    @Override
    public String getRandomItem(String key) throws NumberFormatException{
        //Remove everything up to last space from string
        String value = super.getRandomItem(key).substring(super.getRandomItem(key).lastIndexOf(' ')+1);

        int alcohol;
        alcohol = Integer.parseInt(value);

        //Based on size return string with alcohol level
        if (12 <= alcohol) {
            return super.getRandomItem(key) + "(strong wine)";
        } else if (alcohol > 0) {
            return super.getRandomItem(key) + "(wine)";
        }
        return super.getRandomItem(key) + "(soft drink)";
    }
}