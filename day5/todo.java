import java.util.Scanner;
class todo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the message");
        String a = sc.nextLine();
        doto x = new doto ();
        x.str(a);
    }

}
class doto{
    void str (String b)
    {
        if(b.isBlank()){
            System.out.println("Task not entered");
            return;
        }
        else
            System.out.println("your task: "+b);
        System.out.println(" thank u for adding your task");

}
}

// import java.util.Scanner;
// public class ExpenceTracker {
//     public static void main(String[] args) {
//         Tracker t = new Tracker();
//         int ans = t.add();
//         System.out.println("The total expence : "+ans);
//     }
// }
// class Tracker{
//     int total=0;
//     int add(){
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter your Expence name: ");
//         String expname = s.nextLine();
//         System.out.println("Enter your Expence amount: ");
//         double expamount = s.nextDouble();
//         total+=expamount;
//         System.out.println("If you want to exit press 0 or press 1 to continue");
//         int exit = s.nextInt();
//         if(exit == 0){
//             System.out.println("Exiting...");
//             return total;
//         }else{
//             return add();
//         }
//     }
// }