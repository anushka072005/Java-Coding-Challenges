public class ClassAndObject {
    public static void main(String[] args) { 
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color is : " + p1.color);

        p1.setTip(4);
        System.out.println("Pen tip is : " + p1.tip);
        
        // we want to change color of pen
        // p1.setColor("black");
        // System.out.println("Pen color is : " + p1.color);
        p1.color = "Red";
        System.out.println("Pen color is : " + p1.color);

        Student obj2 = new Student();
        obj2.totalMarks(50, 50, 50);
        System.out.println(obj2.percentage);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class Student {
    String name;
    int age;
    float percentage;

    void totalMarks(int math, int phy, int chy) {
        percentage = (math+phy+chy) / 3;
    }
}

