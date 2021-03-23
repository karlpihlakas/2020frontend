
public class Main {
    public static void main(String [] args ) {

       calc();
     
        
    }


    public static void calc() {

        float fileSize = 1000;
        float internetSpeed = 2.048f;
        float overHeadInput = 13;
        float overHead = overHeadInput / 100;

       float fullTime = ((fileSize / internetSpeed) * overHead);
       float timeInMinutes = fullTime / 60;
       System.out.println(Math.round(fullTime));
       System.out.println(timeInMinutes);
    }
}

