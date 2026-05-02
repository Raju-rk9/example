// recuessive method
import java.util.Scanner;
class task{
    public static void main(String args[]){
        expenseve s = new expenseve();
        int ans = s.add();
        System.out.println("total expense: "+ans);

    }

}
class expenseve{
    int total = 0;
    int add(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the expenseive name");
    String expensevename = s.next();
    System.out.println("Enter the expense amount");
    double expenseveamount = s.nextDouble();
    total+=expenseveamount;
    System.out.println("press 0 if u want to exit and press 1 to continue");
    int exit = s.nextInt();
    if(exit == 0){
        System.out.println("Thank you");
        return total;
    }
    else{
        return add();
    }
    }



// import java.util.Scanner;
// class task{
//     public static void main(String args []){

//     }
// }
// class exp{
//     int total = 0
//     int ans ;
//     Scanner s = new Scanner(System.in);
//     System.out.println("enter the product name");
//     String expname = s.next();
//     System.out.println("Enter th exp amount");
//     double expamount = s.nextDouble();
//     total+=expamount;
//     System.out.println("press 0 to exit and 1 to continue");
//     int exit = s.nextInt
//     if(exit == 0){
//         System.out.println
//     }

    
// }