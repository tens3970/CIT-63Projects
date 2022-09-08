public class WarmUp {
    public static void main(String[] args){
        //initialize
        int outerLoop = 0;
        int innerLoop = 0;
        while (outerLoop < 5) {
            innerLoop = 0;
            System.out.println("Loop #" + outerLoop);
            while (innerLoop < 5){
                System.out.println("Inner loop: " + innerLoop);
                innerLoop++;
            }
            System.out.println("");
            outerLoop++;
        }
    }
}
