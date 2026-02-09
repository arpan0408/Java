public class Menu_cmd {
    public static void main(String[]args) {
        int choice = Integer.parseInt(args[0]);

        switch(choice){
            case 1: 
                System.out.print("North Indian.");
                break;
            case 2:
                System.out.println("South Indian.");
                break;
            case 3:
                System.out.println("Chinese.");
                break;
            case 4:
                System.out.println("Japnese.");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}