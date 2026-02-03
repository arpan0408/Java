public class largest {
    public static void main(String[]args) {
        int[] arr = {2,7,9,21};
        int max = 0;

        for(int i=0; i<4; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.print("Largest number: "+max);
    }
}