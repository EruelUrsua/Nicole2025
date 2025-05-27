import java.util.Scanner;
import javax.swing.JOptionPane;

 class Main {
public static void main(String[] args) {

simpleGui();

}

static void simpleGui() {

JOptionPane.showMessageDialog(null, "Hi Nicole");

}

static  void myTriangle (){

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
 System.out.println("");
}

}

static void myCalc(int a, int b, String o)
{
   int ans = 0;

   switch (o) {
       case "+":
           ans = a+b;
           break;
       case "-":
           ans = a-b;
           break;
       case "/":
           ans = a/b;
           break;
       case "*":
           ans = a*b;
           break;
   }

System.out.println("The answer is "+ans);

}


//Method for introduction
 static void myMethod()
{
    Scanner myInput = new Scanner(System.in);

    System.out.println("What is your name?: ");
    String name = myInput.nextLine();
    
    System.out.println("How old are you?: ");
    int age = myInput.nextInt();


    System.out.println("Hi I am " + name + " I am " + age + " years old");
}
//Method for finding the sum of two numbers
static void numComp() {

    Scanner myInput = new Scanner(System.in);
     
    System.out.println("Enter first numer: ");
    int x = myInput.nextInt();

    System.out.println("Enter second numer: ");
    int y = myInput.nextInt();

    int sum = x + y;

    System.out.println("The sum of " + x + " and " + y + " is " + sum);
}
//Method for checking if a number is odd or even
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

//Method for Gui
static void myGui() {

 JOptionPane.showMessageDialog(null, "Hello Nicole");
		// String name = JOptionPane.showInputDialog("Enter your name");
		// JOptionPane.showMessageDialog(null, "Hello "+name);
		
		// int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		// JOptionPane.showMessageDialog(null, "You are "+age+" years old");

}

}
