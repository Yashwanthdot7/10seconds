import java.util.Scanner;

class Elevator {
    private int currentFloor = 0;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveToFloor(int destination) {
        System.out.println("\nElevator moving...");

        if (currentFloor < destination) {
            while (currentFloor < destination) {
                currentFloor++;
                System.out.println("Elevator at floor " + currentFloor);
            }
        } else if (currentFloor > destination) {
            while (currentFloor > destination) {
                currentFloor--;
                System.out.println("Elevator at floor " + currentFloor);
            }
        } else {
            System.out.println("Elevator already at floor " + currentFloor);
        }
    }
}

class Person {
    private String name;
    private int sourceFloor;
    private int destinationFloor;

    Person(String name, int sourceFloor, int destinationFloor) {
        this.name = name;
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
    }

    public void callElevator(Elevator e) {
        System.out.println(name + " called the elevator to floor " + sourceFloor);
        e.moveToFloor(sourceFloor);
    }

    public void enterElevator() {
        System.out.println(name + " entered the elevator.");
    }

    public void selectFloor(Elevator e) {
        System.out.println(name + " selected floor " + destinationFloor);
        e.moveToFloor(destinationFloor);
    }

    public void exitElevator() {
        System.out.println(name + " exited the elevator.");
    }
}

public class ElevatorDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Elevator elevator = new Elevator();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter current floor: ");
        int source = sc.nextInt();

        System.out.print("Enter destination floor: ");
        int dest = sc.nextInt();

        Person p = new Person(name, source, dest);

        p.callElevator(elevator);
        p.enterElevator();
        p.selectFloor(elevator);
        p.exitElevator();

        sc.close();
    }
}