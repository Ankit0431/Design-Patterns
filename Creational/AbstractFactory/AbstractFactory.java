package AbstractFactory;

import java.util.*;

public class AbstractFactory {
    public static void main(String[] args) {

            Pen p;
            System.out.println("Welcome to Pens:");
            System.out.println("Enter what type of pen you want");
            Scanner s = new Scanner(System.in);
            String choice = s.nextLine();
            choice.toLowerCase();
            switch (choice) {
                case "gel":
                    PenFactory pf0 = new PenFactory();
                    p = pf0.getPen(choice);
                    p.write();
                    break;
                case "sketch":
                    PenFactory pf1 = new PenFactory();
                    p = pf1.getPen(choice);
                    p.write();
                    break;
                default:
                    System.out.println("Invalid Input!!");
                    break;
            }
        }
    }
