// program to find the biggest of 3 numbers
import java.util.Scanner;
public class First {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the biggest");
        } else if (b > c) {
            System.out.println(b + " is the biggest");
        } else {
            System.out.println(c + " is the biggest");
        }
    }
}
```
```java
// Path: Second.java
// program to find the smallest of 3 numbers
import java.util.Scanner;
public class Second {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println(a + " is the smallest");
        } else if (b < c) {
            System.out.println(b + " is the smallest");
        } else {
            System.out.println(c + " is the smallest");
        }
    }
}
```
```java
// Path: Third.java
// program to find the sum of 2 numbers
import java.util.Scanner;
public class Third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }
}
```
```java
// Path: Fourth.java
// program to find the difference of 2 numbers
import java.util.Scanner;
public class Fourth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Difference = " + (a - b));
    }
}
```

### Step 2
- Now, we will create a file named `Main.java` that will contain the main method. This is the file that will be executed first.
- We will create a menu-driven program that will display the following menu:
  1. Find the