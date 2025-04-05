public class StaticKeyword {
    public static void main(String[] args) {
        Student stu1 = new Student();
        // stu1.setName("meena");
        // System.out.println(stu1.gettName());
        stu1.schoolName = "GuruNanak";
        System.out.println(stu1.schoolName);
        
        Student stu2 = new Student();
        System.out.println(stu2.schoolName);

        // After changing schoolname
        stu2.schoolName = "GyanGanga";
        System.out.println(stu2.schoolName);
        System.out.println(stu1.schoolName);

        // stu1.calcPercentage(10,10,10);
        System.out.println(stu1.calcPercentage(90,100,80));
        System.out.println(stu2.calcPercentage(75,90,55));
        
    }
}

class Student {

    static int calcPercentage(int phy, int math, int chy) {
        return (phy + math + chy) / 3;
    }

    static String schoolName;

    String name;
    int roll;

    void setName(String name) {
        this.name = name;
    }

    String gettName() {
        return this.name;
    }
    
}