public class NotSureMan {

    public static void main(String[] args){
        System.out.println("Full time hours: " + hours);
        System.out.println("Full time wage: ");
        printPay();
        hours = 20;
        System.out.println("In main - Hours: ");
        System.out.println(hours);
        System.out.println("In main - Pay: ");
        printPay();
    }
}
