import java.util.Scanner;

public class Villegas_List {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
            System.out.print("Input the number of elements: ");

            int elements = input.nextInt();
            
            int [] A = new int[elements];
            int [] B = new int[elements];
            int [] C = new int[elements];

            System.out.println("List A\t\t\tListB\t\t\tListC");

            for(int i = 0; i < elements; i++){
                A[i] = (int) (Math.random()*(69-5)+5);
            }
            for(int i = 0; i < elements; i++){
                B[i] = (int) (Math.random()*(69-5)+5);
            }
            for(int i = 0; i < elements; i++){
                C[i] = A[i] * B[i];
                System.out.println(A[i]+"\t\t\t"+B[i]+"\t\t\t"+C[i]);
            }
    }
}
