import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String valasztott = "";
        do {
            System.out.println("----------------------");
            System.out.println("1) Program inditasa");
            System.out.println("2) Nevjegy");
            System.out.println("3) Kilepes");
            System.out.println();
            System.out.print("Valasztas: ");
            valasztott = sc.nextLine();
            switch(valasztott) {
                case "1": 
                    System.out.println("Program...");
                    //ide 
                    break;
                case "2": 
                    System.out.println("Nevjegy...");
                    break;
                case "3": 
                    System.out.println("Kilepes...");
                    break;
            }
    
        }while(!valasztott.equals("3"));

        
    }
}
