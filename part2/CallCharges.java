import java.util.*;


public class CallCharges{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int time = scan.nextInt();
        scan.close();

        if (input.equals("ordinary")) {
            Ordinary user1 = new Ordinary();
            user1.charge(time);
        } else if (input.equals("urgent")) {
            Urgent user1 = new Urgent();
            user1.charge(time);
        } else if (input.equals("lightening")) {
            Lightening user1 = new Lightening();
            user1.charge(time);
        } else {
            System.out.println("Wrong Input");
        }

    }
}
class Trunckcall {
    protected int timeCharge;
    public String input;

    Trunckcall() {

    }

    public void charge(int duration) {
        System.out.println("your charges is: rs" + timeCharge + " per min");
        System.out.println("your charges is: " + timeCharge * duration + " rs");
    }

}

class Ordinary extends Trunckcall {
    Ordinary() {
        super.timeCharge = 1;
    }
}

class Urgent extends Trunckcall {
    Urgent() {
        super.timeCharge = 2;
    }
}

class Lightening extends Trunckcall {
    Lightening() {
        super.timeCharge = 3;
    }
}


