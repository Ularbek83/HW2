import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int age = generateRandomAge();
        String res = permission(age, -30);
        System.out.println( "age = " + age + " temp=  -30 " + "  " + res);

        age = generateRandomAge();
        res = permission(10, 2);
        System.out.println( "age = " + age + " temp=  2 " + "  " + res);

        age = generateRandomAge();
        res = permission(70, -15);
        System.out.println( "age = " + age + " temp=  -15 " + "  " + res);

        age = generateRandomAge();
        res = permission(23, -10);
        System.out.println( "age = " + age + " temp=  -10 " + "  " + res);

        age = generateRandomAge();
        res = permission(50, -5);
        System.out.println( "age = " + age + " temp=  -5 " + "  " + res);

    }

    public static String permission(int age, int temperature) {

        String result = " Можно идти гулять";
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30))

        {
            return result;
        }

        if (age < 20 && temperature > 0 && temperature < 28) {
            return result;
        }

        if (age < 45 && temperature > 10 && temperature < 25) {
            return result;
        }
            return " Оставайтесь дома";
    }

    static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(101);
    }
}