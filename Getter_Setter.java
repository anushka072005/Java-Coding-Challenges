public class Getter_Setter {
    public static void main(String[] args) {

        Workers obj = new Workers();
        obj.setName("Anuj");
        System.out.println(obj.getName());

        obj.setSalary(2.5f);
        System.out.println(obj.getSalary());
        
    }
}

class Workers {
    private String name;
    private float salary;

    // (SETTER)
    void setName(String name) {
        this.name = name;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    // (GETTER)
    String getName() {
        return this.name;
    }

    float getSalary() {
        return this.salary;
    }
}
