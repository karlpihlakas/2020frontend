public class Saga {

        public static void main(String[] args) {

            String name = "Saga";
            int year = 2021;
            byte bait = Byte.MAX_VALUE - 1;
        

       
            
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }

            for (String text : args) {
                System.out.println(text);
            }
            
            int length = args.length;

            while (length > 0 ) {
                length--;
                System.out.println("Inside while");
            }

            System.out.println("Hello World!");
            System.out.println("\n");
            

            String hello = "Hello World";

            if ( year == 2021) {
                System.out.println("MINE MUNNI ONGI '='!" );
            } else if (year > 2021){
                System.out.println("RIP, 2021 oli juba mõnda aega tagasi sa vana pedeeeeeeeee. :D ");
            }
        }
    }

