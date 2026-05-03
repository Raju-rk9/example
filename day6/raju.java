import java.util.ArrayList;
class raju{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(57);
        System.out.println(arr);
        arr.set(1,77);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        
    }
}