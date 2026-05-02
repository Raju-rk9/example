// import java.util.Scanner;

//  class tak1{
//      static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String input = sc.nextLine();
        
//         if (input.length() < 5) {
//             System.out.println("Short");
//         } else {
//             System.out.println("Long");
//         }
        
//         sc.close();
//     }
// }
// import java.util.Scanner;

// public class tak1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         String input = sc.nextLine();
        
//         if (input.length() > 0) {
//             System.out.println(input.charAt(0));
//         }
        
//         sc.close();
//     }
// }
// import java.util.Scanner;

//  class tak1{
//      static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String input = sc.nextLine();

//         if (input.startsWith("Java")) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

 class Tak1{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tasks = new String[3];

        // Input
        System.out.print("Enter task 1: ");
        tasks[0] = sc.nextLine();

        System.out.print("Enter task 2: ");
        tasks[1] = sc.nextLine();

        System.out.print("Enter task 3: ");
        tasks[2] = sc.nextLine();

        // Output
        System.out.println("Your To-Do List:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".\t" + tasks[i]);
        }

        sc.close();
    }
}