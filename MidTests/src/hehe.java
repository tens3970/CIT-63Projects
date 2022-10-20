public class hehe {
    public static void main(String[] args){
        double number = 3.333333;
        String formatted = String.format("%8.1f", number).replace(' ', '>');
        System.out.println("Point to three: " + formatted);
        formatted.length();
    }
}
