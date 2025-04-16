public class sum_range {
    public static void sums(int m, int n) {
        int sum = 0;
        for(int i=m ; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
        int m = 0;
        int n = 3;
        sums(m, n);
    }
}
// IN PYTHON
//  def sum(m,n):
//      sums = 0
//      for i in range(m,n+1):
//          sums += i
//      print(sums)    
//  sum(0,3)

   