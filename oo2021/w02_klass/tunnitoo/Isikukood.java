
public class Isikukood {
    String sisu;
    public Isikukood (String uusSisu) {
        sisu = uusSisu;
        if(sisu.length() != 11) {
            throw new RuntimeException("Vigane Pikkus!");
        }
    }

    public String kuuNumber() {
        return sisu.substring(3, 5);
    }

    public String kuuPaev() {
        return sisu.substring(5, 7);
    }

    public String sugu() {
        int nr = Integer.parseInt(sisu.substring(0, 1));
        if (nr % 2 == 0){
         return "n";
        } else return "m";
    }   
}

