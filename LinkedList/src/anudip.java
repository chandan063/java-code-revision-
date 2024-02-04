import java.util.scanner;

public class temperature{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter temperaure");
//            for input validation
            while(!sc.hasNextDouble()){
                System.out.println("invalid i/p ,please enter valid value");
                sc.next();
            }

            double celcius=sc.nextDouble();
            double fahrenheit=(9.0/5.0)*celcius+32;
            System.out.println("fahrenheit temp: "+fahrenheit);

            if(fahrenheit<32){
                System.out.println("Very cold");
            }
            else if(fahrenheit>=32 && fahrenheit<50){
                System.out.println("cold");
            }
            else if (fahrenheit>=50 && fahrenheit<70) {
                System.out.println("Mild");
            }
            else  {
                System.out.println("Warm");
            }

            System.out.println("Do you want to convert more temperature?(yes/No): ");
            String response=sc.next().toLowerCase();

            if(response.equals("no") ||(response.equals("n") )){
                break;
            }
            if(response.equals("yes") ||(response.equals("y") )){
                continue;
            }
        }
        sc.close();
    }
}