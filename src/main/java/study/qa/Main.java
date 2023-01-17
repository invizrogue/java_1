package study.qa;

public class Main {
    public static void main(String[] args) {
        // логический
        boolean varBoolean = false;
        // целочисленные
        byte varByte = 100; // -128 ... 127  (-2 ^ 7 ... (2 ^ 7) -1)
        short varShort = 1000; // -321768  ... 321767
        int varInt = 100_000_000;
        long varLong = 0L;
        // символ (под капотом тоже число)
        char varChar = 'f';
        //  числа с плавающей точкой
        float varFloat = 0.0F;
        double varDouble = 36.0;
        String varString = "Selenide";

        int coinNominal = 3;
        String coinCurrency = "EUR";

        // Операторы
        // Операторы математические
        int result = 10;
        // Разное написание инкремента
        result = result + 1;
        result += 1;
        // Постфиксный инкримент (сначала действие, затем увеличение)
        result++;
        // Префиксный инкремент (сначала увеличение, затем действие)
        ++result;

        // Операторы сравнения
        // > < >= <= == !=

        // Логические операторы
        // && || !, ^

        // if - else if - else
        if (coinCurrency.equals("RUB")) {
            System.out.println("Это рубль!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("Это долар!");
        } else {
            System.out.println("Ничего не подошло");
        }

        // switch
        switch (coinCurrency) {
            case "RUB": {
                System.out.println("Это рубль!");
                break;
            }
            case "USD": {
                System.out.println("Это долар!");
                break;
            }
            default: {
                System.out.println("Ничего не подошло");
            }
        }


        // примитивы
        byte varByte2 = 127; //-128 .. 127 (127, т.к. один бит используется для знака - в отрицательных числах)
        short varShort2 = 32767; // -32788 .. 32767
        int varInt2 = 99999; // -2 в 31 степени .. 2 в 31 степени -1
        long varLong2 = 999999L; // -2 в 64 степени .. до 2 в 64 степени -1
        // числа с плавающей запятой
        float varFloat2 = 0.1f; //32 bytes
        double varDouble2 = 1.99d; //64 bytes
        // операции с переменными
        // сначала выполняются операции в скобках, затем выводится в консоль
        // численное значение плюс строка = строка
        System.out.println(varInt2 + " + " + varDouble2 + " = " + (varInt2 + varDouble2));
        System.out.println(varInt2 + " - " + varLong2 + " = " + (varInt2 - varLong2));
        System.out.println(varByte2 + " / " + varFloat2 + " = " + (varByte2 / varFloat2));
        System.out.println(varByte2 + " % " + varShort2 + " = " + (varByte2 % varShort2));

        /*
         переполнение int (на примере вычисления количества микросекунд в день)
         и операция с разными типами числовых переменных
         */
        final long microsWrong = 24 * 60 * 60 * 1000 * 1000; // все вычисления производятся в int и сохраняются в long
        System.out.println("Неверное количество микросекунд в день: " + microsWrong); // в int не хватает места, поэтому результат неправильный
        final long microsRight = 24L * 60 * 60 * 1000 * 1000; // указываем первым числом long
        System.out.println("Верное количество микросекунд в день: " + microsRight); // верный результат

        /*
         если идёт преобразование более ёмкого типа к менее ёмкому,
         то лишние старшие биты отбрасываются
        */
        varInt2 = 1024;
        System.out.println((byte) varInt2); // результат 0

        /*
         если идёт преобразование дробного в целое, то дробная часть отбрасывается
        */
        double pi = 3.14;
        System.out.println((int) pi); // результат 3
    }
}