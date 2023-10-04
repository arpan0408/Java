// if numeric value is entered as an input

public class command_line {
    public static void main(String[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int num = Integer.parseInt(arr[i]);
            if(num%2==0)
            System.out.println(num);
        }
    }
}
