package ad211.dolgih.lab1;
import java.util.Scanner;

public class Program {

    public static void main (String args[]){
    int menu = 0;
        while(menu!=4) {
            System.out.println("1.Method #1 'more than the previous'");
            System.out.println("2.FizzBuzz");
            System.out.println("3.Method #2 'equally'");
            System.out.println("4.Exit");
            Scanner answer = new Scanner(System.in);
            menu = answer.nextInt();
            switch (menu) {
                case 1: {
                    method1();
                    break;
                }
                case 2: {
                    FizzBuzz();
                }
                case 3: {
                    method2();
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("Error");
                }
            }
        }
   
    }

        static void method1(){
            int size;
            boolean flag = false;

            System.out.print("Enter length array: ");
            Scanner console = new Scanner(System.in);
            size = console.nextInt();
            while(size<2){
                System.out.println("Size must be more than 2!!!");
            }
            System.out.println("Enter array elements: ");
            int []array = new int[size];
            for(int i=0;i<size; i++){
                array[i]=console.nextInt();
                if(flag){
                    if(array[i-1]>array[i]){
                        System.out.println("element ["+ ++i +"] less than ["+ --i+"]");
                        flag = false;
                        break;

                    }
                }
                flag = true;
            }
            if(flag){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        static void FizzBuzz(){

        for(int i =1;i<=100;i++){

            if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
                continue;
            }else if(i%5==0 && i%3!=0){
                System.out.println("Buzz");
                continue;
            }else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(i);
        }

        }

        static void method2(){
        int size;
        int sum=0,sum1=0,sum2=0,sum3=0;
            System.out.println("Enter size: ");
            Scanner console = new Scanner(System.in);
            size = console.nextInt();
            while (size<=1){
                System.out.println("size cannot be less 0!!");
                size = console.nextInt();
            }
        int []array = new int[size];

            for(int i=0;i<size;i++){
                array[i]=console.nextInt();
                if(i<size/2){
                    sum=sum+array[i];
                }else{
                    sum1=sum1+array[i];
                }
                if(i>size/2){
                    sum2+=array[i];
                }else{
                    sum3+=array[i];
                }

            }
            if(sum==sum1 || sum2==sum3){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }

}
