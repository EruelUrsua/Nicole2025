import java.util.Scanner;
 class Main {
public static void main(String[] args) {

    // myMethod();
//   numCheck();
numComp();
}

 static void myMethod()
{
    Scanner myInput = new Scanner(System.in);

    System.out.println("What is your name?: ");
    String name = myInput.nextLine();
    
    System.out.println("How old are you?: ");
    int age = myInput.nextInt();


    System.out.println("Hi I am " + name + " I am " + age + " years old");
}

static void numComp() {

    Scanner myInput = new Scanner(System.in);
     
    System.out.println("Enter first numer: ");
    int x = myInput.nextInt();

    System.out.println("Enter second numer: ");
    int y = myInput.nextInt();

    int sum = x + y;

    System.out.println("The sum of " + x + " and " + y + " is " + sum);
}

static void numCheck() {

    int x = 5;

    if (x%2 == 0)
     {
        System.out.println(x + " is an even number");
    }
    else
    {
        System.out.println(x + " is an odd number");
    }

} 


}
