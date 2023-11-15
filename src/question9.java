public class question9 {
    public static void main(String args[]){
        int i = 4;
        int j = 21;
        int k = ++i * 7 + 2 - j--;//5*7+2-21=16 and j = 10
        System.out.println("k = " + k);
    }
}
