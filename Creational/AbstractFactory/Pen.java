package AbstractFactory;

public abstract class Pen {
    Refill refill;
    Tube tube;

    // Pen(String refill, String tube) {
    //     this.refill = refill;
    //     this.tube = tube;
    // }

    abstract void write();
}

class Gel extends Pen {
    Gel(Refill refill, Tube tube) {
        this.refill = refill;
        this.tube = tube;
    }

    void write() {
        System.out.println("\nGel pen writes with " + refill + " refill and " + tube + " tube\n");
    }
} 

class Sketch extends Pen {
    Sketch() {
        // super("Sponge", "Fiber");
    }

    void write() {
        System.out.println("\nSketch pen writes with " + refill + " refill and " + tube + " tube\n");
    }
}



// public class Pens {
//     public static void main(String[] args) {
//         Pen p;
//         while (true) {
//             System.out.println("Welcome to Pens:");
//             System.out.println("1: Gel");
//             System.out.println("2: Sketch");
//             System.out.println("3: Exit");
//             Scanner s = new Scanner(System.in);
//             int choice = s.nextInt();
//             switch (choice) {
//                 case 1:
//                     p = new Gel();
//                     p.write();
//                     break;
//                 case 2:
//                     p = new Sketch();
//                     p.write();
//                     break;
//                 case 3:
//                     System.out.println("Thank you see you again later!");
//                     System.exit(0);
//                 default:
//                     System.out.println("Invalid Input!!");
//                     break;
//             }
//         }
//     }
// }
