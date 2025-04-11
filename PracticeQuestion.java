public class PracticeQuestion {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "anushka";
        System.out.println(s.name);        
    }
}

class Student {
    String name;
    int marks;
}