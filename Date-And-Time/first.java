import java.util.*;
class first {
    public static void main(String[] args) {
        System.out.println("miliseconds since 1 jan 1970 = "+System.currentTimeMillis());//miliseconds since 1970
        System.out.println("second till now: " + System.currentTimeMillis() / 1000);
        System.out.println("Minitues till now: " + System.currentTimeMillis() / 1000 / 60);
        System.out.println("Hours till now: " + System.currentTimeMillis() / 1000 / 60 / 60);
        System.out.println("Days till now: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24);
        System.out.println("Years till now: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
    }
}
