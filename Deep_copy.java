public class Deep_copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nidhi";
        s1.roll = 30;

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        System.out.println("Original.. :- " + s1.name + ", " + s1.roll); 
        for(int i=0; i<3; i++) {
            System.out.println(s1.marks[i] + " ");
        }
        System.out.println();

        // Deep copy
        Student s2 = new Student(s1);
        s1.marks[2] = 70;  // chnage in original  dont affect to object 2
        s1.name = "hbsdcu";
        
        System.out.println("Deep copy.. :- " + s2.name + ", " + s2.roll); 
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i] + " ");
        }
        System.out.println();
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    Student() {
        marks = new int[3];
    }

    // Shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = name;
    //     this.roll = roll;
    //     this.marks = s1.marks[i];
    // }

        // deep copy constructor
        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0; i<marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }
}
