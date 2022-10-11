package Lesson_23_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

//https://www.examclouds.com/ru/java/java-core-russian/lesson12-tasks
//https://qna.habr.com/q/450435

public class main {
    public static void main(String[] args) throws IOException {
        String str1 = "Java";
        //Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
//        String str = "I like Java!!&";
//
//        //Распечатать последний символ строки. Используем метод String.charAt().
//        System.out.println(str.charAt(str.length() - 1));
//
//        //Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        System.out.println(str.endsWith("!!!"));
//
//        //Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        System.out.println(str.startsWith("I like"));
//
//        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        System.out.println(str.contains("Java"));
//
//        //Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        System.out.println(str.indexOf(str1));
//
//        //Заменить все символы “а” на “о”.
//        str.replace('a', 'o');
//
//        //Преобразуйте строку к верхнему регистру.
//        System.out.println(str.toLowerCase(Locale.ENGLISH));
//
//        //Преобразуйте строку к нижнему регистру.
//        System.out.println(str.toUpperCase(Locale.ENGLISH));
//
//        //Вырезать строку Java c помощью метода String.substring().
//        int startIndex, endIndex;
//        System.out.println(str.substring(str.indexOf("I like"),
//                str.indexOf("I like") + "I like".length()));

        // Составляем строку с помощью класса StringBuilder
        //Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //3 + 56 = 59 //переделать в строки //to string
        //3 – 56 = -53
        //3 * 56 = 168.
        //Используем метод StringBuilder.append().

//        Integer x, y;
//        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); //для того что бы читать откуда хошь (с диска, из сети, из БД) а сканер только консоль
//        String str = buf.readLine();    //для локализации программы указываем что в методе мейн возможно IOException
//        x = Integer.parseInt(str);
//        str = buf.readLine();
//        y = Integer.parseInt(str);
//        Integer res = x + y;
//        StringBuilder sb = new StringBuilder(x.toString());
//        sb.append(" + ");
//        sb.append(y.toString());
//        sb.append(" = ");
//        sb.append(res.toString());
//        System.out.println(sb);
//
//        StringBuilder sb1 = new StringBuilder(x.toString());
//        sb1.append(" - ");
//        sb1.append(y.toString());
//        sb1.append(" = ");
//        Integer res2 = x-y;
//        sb1.append(res2.toString());
//        System.out.println(sb1);
//
//        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
//        sb.deleteCharAt(7);
//        System.out.println(sb);
//        sb.insert(7,"равно");
//        System.out.println(sb);
//
//        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        sb1.replace(7,8,"равно");
//        System.out.println(sb1);


        //Заменить каждое второе вхождение строки
        //Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming»
        // (не учитываем регистр символов) на «OOP». Например, строка
        //"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
        //должна быть преобразована в
        //"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."

        String t = "Object-oriented programming is a programming language model organized around " +
                "objects rather than \"actions\" and data rather than logic. Object-oriented programming " +
                "blabla. Object-oriented programming bla.";
        String oop = "Object-oriented programming";
        String oop2 = "OOP";
        System.out.println(pvsm(t,oop,oop2));

    }
    public static String pvsm (String t, String oop,String oop2) {
        StringBuilder SB = new StringBuilder(t);
        while (true) {

            SB.replace(t.indexOf(oop), t.indexOf(oop) + oop.length(), oop2);
            String asd = SB.toString();
            if (!asd.contains(oop))
                    break;
        }


        String toText = SB.toString();
        return toText;
    }
}
