import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class PicnicItemStoreTest {


   public static void main(String[]arg){
        PicnicItemStore store = new PicnicItemStore();

        store.put("a", "abiu");
        store.put("bl", "blackberry");
        store.put("bl", "blackcurrent");
        store.put("a", "apricot");
        

    }
}
