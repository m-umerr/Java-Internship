package Array;

public class Array {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=i;
                System.out.print(" | "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
