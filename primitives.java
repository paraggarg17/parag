import java.util.Scanner;

public class primitives {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("please enter the input");
        // int rollno =input.nextInt();
        // System.out.println("your rollno is"+rollno);
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = a+b;
        // int product = a*b;
        // System.out.println(product);
        // int a =45;
        // int b =56;
        // System.out.println(a>b);
        // System.out.println(b>a);
        // System.out.println(a==b);
        // System.out.println(a!=b);
        // System.out.println((a>b) && (a==b));
        // a+=14;
        // System.out.println(a);
        // b-=34;
        // System.out.println(b);
        // a*=2;
        // System.out.println(a);
        //  Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // if(a%2==0){
        //     System.out.println("even");
        //  }
        //  else{
        //     System.out.println("odd");
        //  }
        //  System.out.println("tax");
        // Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c= sc.nextInt();
        // if(a>b &&a>c){
        //     System.out.println("largest number is:"+a);


        // }
        // else if(b>a && b>c){
        //     System.out.println("largest number is:"+b);
        // }
        // else{
        //     System.out.println("largest number is:"+c);
        // }
        // int a =35;
        // string c =((a%2)==0) ? "even" : "odd";
        // System.out.println(c);
        // Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // if(a>33){
        //     System.out.println("pass");

        // }
        // else{
        //     System.out.println("fail");
        // }
         Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int sum =0;
        int counter = 1;
        while(counter<=a){
            sum+=counter;
            
            counter++;

        }
        System.out.println(sum);





        
        
    }
}