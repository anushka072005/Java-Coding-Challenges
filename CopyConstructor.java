public class CopyConstructor {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.name = "Cripa";
        h1.room = 10;
        h1.password = "maa";

        h1.marks[0] = 90;
        h1.marks[1] = 95;
        h1.marks[2] = 100;
        
        
        System.out.println("Original Home: " + h1.name + ", " + h1.room + ", " + h1.password);
        for(int i=0; i<3; i++) {
            System.out.println(h1.marks[i] + " ");
        }
        
        h1.marks[2] = 50;
        h1.name = "anushka";
        
        Home h2 = new Home(h1);   //coping properties of obj1 in onj2
        h2.password = "papa";
        System.out.println("Copied Home: " + h2.name + ", " + h2.room +  ", " + h2.password);
        for(int i=0; i<3; i++) {
            System.out.println(h2.marks[i] + " ");
        }   
    }
}

class Home {
    String name;
    int room;
    String password;
    int marks[];

    // COPY CONSTRUCTOR
    Home(Home h1) { 
        marks = new int[3];
        this.name = h1.name;
        this.room = h1.room;
        this.password = h1.password;
        this.marks = h1.marks;
    }

    Home() {
        marks = new int[3];
        // System.out.println("Calling default Constructor");
    }

    Home(String name) {
        marks = new int[3];
        this.name = name;
    }

    Home(int room) {
        marks = new int[3];
        this.room = room;
    }
}