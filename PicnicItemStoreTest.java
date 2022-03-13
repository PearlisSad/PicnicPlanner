import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class PicnicItemStoreTest {

    public PicnicItemStoreTest(){

    }
    public static void main(String[] args)throws AssertionError, IOException{
        PicnicItemStore store = new PicnicItemStore();
        store.put("a", "abiu");
        store.put("bl", "blackberry");
        store.put("bl", "blackcurrent");
        store.put("a", "apricot");

        //if(!store.map.containsKey("apricot")){
        //    throw new java.lang.AssertionError();
        //}
        
        PicnicItemStore storeNew = new PicnicItemStore("cheeses.txt");
        try{
            File file = new File("cheeses.txt");
            Scanner reader = new Scanner(file);
            String word = reader.nextLine();
            if (!storeNew.map.containsKey(word)){
                throw new java.lang.AssertionError();
            }
            reader.close();
        } catch(FileNotFoundException e){
            System.err.println("File not found different one" + e);
        }
        System.out.println(storeNew);

    }
}
