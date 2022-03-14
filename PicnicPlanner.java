import java.util.*;
import java.io.*;

public class PicnicPlanner {
    public PicnicItemStore picnic;
    public PicnicItemStore fruit;
    public CheeseStore cheese;
    public DrinkStore drink;

    public PicnicPlanner(){
        this.picnic = new PicnicItemStore();
        this.fruit = new PicnicItemStore("fruits.txt");
        this.cheese = new CheeseStore("cheese.txt");
        this.drink = new DrinkStore("drinks.txt");
    }

    public List<String> generate(String input){
        List<String> plan;

    }
}
