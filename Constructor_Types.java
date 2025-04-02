public class Constructor_Types {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Sanju");
        System.out.println(s2.name);

        Student s3 = new Student(30);
        System.out.println(s3.age);

        // Student s1 = new Student(24, 24);  // error because there are constructor who taking 2 argument
    }
}

class Student {
    String name;
    int age;

    Student() {   // non Parameterized constructor
        System.out.println("Constructor calling");
    }

    Student(String name) {   // Parameterized constructor
        this.name = name;
    }

    Student(int age) {   // Parameterized constructor
        this.age = age;
    }
}