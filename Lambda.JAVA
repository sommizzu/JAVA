interface Calculator {
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a +b;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}


6+27+30 = 63'!!