import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;

public class PicnicItemStore{
    Map <String, List<String>> map;

    public PicnicItemStore(){

        this.map = new HashMap<String, List<String>>();

    }
    public PicnicItemStore(String filename){

        try{

            FileReader file = new FileReader(filename);
            BufferedReader reader = new BufferedReader(file);
            String line ;//strItem

            this.map = new HashMap<String, List<String>>();
            while ((line = reader.readLine()) != null){
                String lc = line.toLowerCase();
                this.put(lc.substring(0,1) , lc);
            }
            reader.close();


        }
        catch(IOException e){

            System.out.println("Exception: ");
            e.printStackTrace();

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

        //converts the key into lowercase from the arg input in PicnicPlanner
        key = key.toLowerCase();

        if (containsKey(key) != false){

            List<String> ItemList = this.map.get(key);
            int length = ItemList.size();

            if(length > 0){

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

        }

        return null;

    }


}