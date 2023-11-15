public class question5 {
    public static void main(String args[]){
        System.out.println(2+3+"bc"+'c'+'a');//5bcca - after string all are considered as string
        System.out.println('c'+'a'+2+3+"bc");//(c=99)+(a=97)+5+bc
        System.out.println("bc"+'c'+'a'+2+3);//bcca23  after string all are considered as string
        System.out.println("bc"+('c'+'a')+(2)+3); //bc+(97+99)+(2)+3=bc19623 because 2 is inside bracket .

    }
}
