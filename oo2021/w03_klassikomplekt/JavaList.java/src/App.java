import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class App {
     public static void main(String[] args) throws Exception {
    //    String[] fruits = new String[3];
    //    fruits[0] = "Mango";
    //    fruits[1] = "Apple";
    //    fruits[2] = "Banana"; 
    //    System.out.println(fruits[1]);

    //    ArrayList fruitList = new ArrayList();
    //    fruitList.add("Mango");
    //    fruitList.add("Banana");
    //    fruitList.add("Apple");
    //    System.out.println(fruitList);
    // }

    // int a = 10;
    // int b = 3;
    // int c = 88;

    // HashMap<String, Integer> happy = new HashMap<String, Integer>();

    // happy.put("a", 10);
    // happy.put("b", 3);
    // happy.put("c", 88);

    // System.out.println(happy);



    //  HashMap<String, String> fun = new HashMap<String, String>();
     
    //  fun.put("Tarmo123", "monuspass14");
    //  fun.put("Artur21", "heapass212");
    //  fun.put("Tommiboi2", "vihmaneilm123");

    //  fun.replace("Tarmo123", "Oikuiheapass");
    //  fun.remove("Artur21");
    //  System.out.println(fun);

    // LinkedList<Integer> fun = new LinkedList<Integer>();
    //   fun.add(5);
    //   fun.add(4);
    //   fun.add(534);
    //   System.out.println(fun.contains(534));


    // HashSet monus = new HashSet<String>();

    // monus.add("Timooo");
    // monus.add("Laura");
    // monus.add("Timoo");

    // System.out.println(monus);

    // monus.add("Tarno");
    // monus.add("Timoo");

    // System.out.println(monus);
   
    HashMap<String, String> user = new HashMap<String, String>();
    user.put("Tallinn", "Tarmo Kuusk");
    user.put("Tartu", "Timo Maasikas");

System.out.println(user);


    HashSet<String> tallinnPeople = new HashSet<String>();
    HashSet<String> tartuPeople = new HashSet<String>();

        if(user.containsValue("Tarmo Kuusk")){
           
           tallinnPeople.add(user.get("Tallinn"));

           System.out.println("Tallinnas elavad: " + tallinnPeople.size() + " inimest");
        }

        if(user.containsValue("Timo Maasikas")){
           
            tartuPeople.add(user.get("Tartu"));
 
            System.out.println("Tartus elavad: " + tartuPeople);
        }
    }
}

//KUI USER SISESTAB VÄLJALE TEKSTI MIS ON TEMA NIMI SIIS ANDMEBAAS SAAB TEADA MITU INIMEST ELAB TLN
//-..- SIIS SAAB TEADA KES ELAB TALLINNAS. muuta tuleks ss if lauses getinfo, mitte konkreetne nimi.
                  