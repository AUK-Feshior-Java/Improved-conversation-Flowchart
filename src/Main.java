import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String personName = sc.nextLine();
        System.out.print("Enter your age: ");
        int personAge = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your favorite genre: ");
        String personGender = sc.nextLine();

        if(personGender.equals("non-fiction")){
            if(personAge<13)
                System.out.println("You can read The Ship Beneath the Ice by Mensun Bound");
            else if(personAge<17)
                System.out.println("You can read The Book of Minds by Philip Ball");
            else if(personAge<25)
                System.out.println("You can read Scary Smart by Mo Gawdat");
            else
                System.out.println("You can Making It by Jay Blades");
        }else if(personGender.equals("detective")){
            if(personAge<17)
                System.out.println("You can read I Am Princess X by Cherie Priest");
            else if (personAge<25)
                System.out.println("You can read Jackaby by William Ritter");
            else
                System.out.println("You can read The Inheritance Games by Jennifer Lynne Barnes");
        }else if(personGender.equals("fantastic")){
            if(personAge<17)
                System.out.println("You can read Harry Potter");
            else if(personAge<25)
                System.out.println("You can read 1984");
            else
                System.out.println("You can read Lord of the Rings");
        }else
            System.out.println("Sorry, but we don`t know what can you read");
    }
}