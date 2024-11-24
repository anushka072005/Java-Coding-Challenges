public class Scope {

    public static void sum(int a) {

        int add = 1;
        add = add + a;
        {
            int Scope = 1;
            System.out.println(Scope);
        }
        //System.out.println(Scope); //error
        
    System.out.print(add);    

}
    
    public static void main(String[] args) {
        sum(2);
       // System.err.println(add); // errorlocation: class Scope
    }
}
