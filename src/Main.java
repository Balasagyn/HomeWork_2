public class Main {
    public static void main(String[] args) {

        System.out.println(myTest(23, 42));
        System.out.println(myTest(42, 33));
        System.out.println(myTest(23, 35));
        System.out.println(myTest(12, 21));
        System.out.println(myTest(29, 42));
    }

    public static String myTest(int age, int temperature){
        if ((age >= 25 && age <= 45) && (temperature >= -20 && temperature <= 30)){
            return "Можно идти гулять";
        }
        else if ((age <= 20) && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        }
        else if ((age > 45) && (temperature >= -10 && temperature <= 25)){
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
    }
}