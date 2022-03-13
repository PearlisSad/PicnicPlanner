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

       /*DrinkStore ds0 = new DrinkStore();
       ds0.put("a", "Aquafina 0");
       ds0.put("c", "Clos de los Siete Uco Valley 8");
       ds0.put("s", "Salvatore Molettieri Taurasi Vigna Cinque Querce 16");
       System.out.println(ds0.getRandomItem("c"));*/

   }
}
