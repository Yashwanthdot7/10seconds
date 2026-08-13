// teacher gives a pen to a student. student opens the cap, writes something and closes the cap.

class Teacher {
    Student s = new Student();

    public void givesPen(Pen p) {
        System.out.println("Teacher has given the pen.");
        s.takesPen(p);
    }
}

class Student {
    public void takesPen(Pen p) {
        System.out.println("Student has taken the pen.");
        p.capOpen();
        p.writing();
        p.capClose();
    }
}

class Pen {
    public void capOpen() {
        System.out.println("Cap is open.");
    }

    public void writing() {
        System.out.println("Pen is writing.");
    }

    public void capClose() {
        System.out.println("Cap is closed.");
    }
}

public class Requirement {
    public static void main(String[] args) {
        Pen p = new Pen();
        Teacher t = new Teacher();
        t.givesPen(p);
    }
}
