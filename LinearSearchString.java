public class LinearSearchString {

    public static int LinearStringSearch(String menu[], String key) {

        for(int i = 0; i < menu.length; i++) {
            if(menu[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"samosa" , "rasgulla" , "icecreame" , "dosa" , "choclate"};
        String key = "icecreame";

        int index = LinearStringSearch(menu, key);
        if (index == -1) {
            System.out.println("Not Found");
        }
        else { 
            System.out.println("String at index : " + index);
        }
    }
}
