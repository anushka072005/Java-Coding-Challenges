public class BreakStatement {
    public static void main(String[] args) {
        
        for(int i=1; i <= 5 ; i++){
            if (i==3){
                break;
                // continue;
            }
            System.out.println(i + " = 1-caror");
        }
        System.out.println("I am out of the loop");
    }
}
