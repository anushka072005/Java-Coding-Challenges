public class SingleLevel {
    public static void main(String[] args) {
        Room space = new Room();
        space.name = "Krishna";
        System.out.println(space.name);
        space.floor = 8;
        System.out.println(space.floor);
    }
}

class Home {
    String name;

    public void bulid(String name) {
        this.name = name;
    }
}

class Room extends Home {
    int floor;

    void stay(int floor) {
        this.floor = floor;
    }
}
