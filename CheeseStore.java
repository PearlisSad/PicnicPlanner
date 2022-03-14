import java.util.*;
import java.io.*;

public class CheeseStore extends PicnicItemStore {
    public CheeseStore() {
        super(); //Super() for this class
    }

    @Override
    public String getRandomItem(String key) {
        return super.getRandomItem(key) + "(cheese)"; //Use from PicnicItemStore
    }
}