public class Test {
    static void change(String yo){
        yo = "test";
    }

    public static void main(String[] args){
        String test = "What";
        System.out.println(test);
        change(test);
        System.out.println(test);
    }
}
