package lesson15.examples;


//У классов Byte и Short методов по поискумаксимального и
// минимального значения нет. При работе с переменными типов byte и short минимум и максимум можно
// вычислить при помощи соответствующих методов класса Integer. Для этого нужно воспользоваться явным приведением типов.
public class Practice7 {

    public static void main(String[] args) {

        byte num1 = 12;
        byte num2 = -12;
        maxValueByte(num1, num2);

    }

    public static void maxValueByte(byte a, byte b) {

        int maxC = Integer.max((int)a, (int) b);
        System.out.println(maxC);
    }
}
