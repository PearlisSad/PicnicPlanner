public class CheeseStore extends PicnicItemStore {
    public CheeseStore(String filename) {
        super(); //Super() for this class
    }

    @Override
    public String getRandomItem(String key) {
        return super.getRandomItem(key) + "(cheese)"; //Use from PicnicItemStore
    }
}