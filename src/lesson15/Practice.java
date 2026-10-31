package lesson15;

import java.util.ArrayList;
import java.util.List;

public class Practice {

        public static void main(String[] args) {
            byte a = 40;
            byte b = 30;
            System.out.println(findMax(a, b));
        }
        private static byte findMax(byte firstNumber, byte secondNumber) {

          int a = Integer.max(firstNumber, secondNumber);
          return (byte) a;
        }
}
