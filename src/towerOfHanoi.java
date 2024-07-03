import java.util.Scanner;

public class towerOfHanoi {
    public static void solve(int n, String from, String to, String auxRod){
        if (n == 1){
            System.out.println("Move disk 1 from "+from+" to "+ to);
        }
        else {
            solve(n-1, from, auxRod, to);
            System.out.println("Move disk "+n+ " from "+from+ " to "+to);
            solve(n-1, auxRod, to, from);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        solve(n, "A", "C", "B");
    }
}
