package lesson15.examples;

public class Practice8 {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(findMax(a, b));
    }
    private static byte findMax(byte firstNumber, byte secondNumber) {
        int maxOfBytes = Integer.min((int) firstNumber, (int) secondNumber);
        return (byte) maxOfBytes;
    }
}
