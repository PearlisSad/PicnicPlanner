import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;

public class PicnicItemStore{
    public Map <String, List <String>> map;

    public PicnicItemStore(){

        this.map = new HashMap<String, List<String>>();

    }
    public PicnicItemStore(String filename)throws IOException{
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            line = reader.readLine();
            while (line != null) { //Put all items in the map
                line = reader.readLine();
                if (line != null) {
                    this.put(line.substring(0, 1).toLowerCase(), line.toLowerCase());
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (reader != null) { //Only in the item was opened
                reader.close();
            }
        }
    }

    public boolean containsKey(String key){
        //.get() is needed to return array items
        if(this.map.get(key) != null){
            return true;
        }
        return false;

    }

    public void put(String key, String item){

        if (containsKey(key)){

            List <String> ItemList = this.map.get(key);
            ItemList.add(item);
            this.map.put(key,ItemList);
        }
        else{
            List<String> ItemList = new ArrayList<String>();
            ItemList.add(item);
            this.map.put(key, ItemList);
        }

    }

    public String getRandomItem(String key){

        Random random = new Random();

        if (containsKey(key)){

            List<String> ItemList = this.map.get(key);
            int length = ItemList.size();

            if(length > 0 ){

                int randint = random.nextInt(length);
                String item = ItemList.get(randint);

                char [] KeyArray = key.toCharArray();
                char [] ItemArray = item.toCharArray();

                int keySize = KeyArray.length;

                for (int i = 0; i< keySize; i++){

                    ItemArray[i] = Character.toUpperCase(KeyArray[i]);
                }
                String ItemCombined = new String(ItemArray);
                return ItemCombined;

            }
            return null;


        }

        return null;

    }


}
