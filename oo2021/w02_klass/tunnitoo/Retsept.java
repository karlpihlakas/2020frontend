import java.util.*;

public class Retsept {
    Hashtable < String, Double > ained = new Hashtable < String, Double > ();
public kysiAineNimed() {

    return ained.keySet(); 

    }

    public lisa(String aine, Double kogus) {
        if (ained.containsKey(aine)) {
            throw new RuntimeException(aine + "juba olemas");
        }
        ained.put(aine, kogus);
    }

    
}
