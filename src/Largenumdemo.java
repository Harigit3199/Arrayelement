import java.util.Scanner;

public class Largenumdemo
{
    public static void main(String[] args)
    {
        int num,k,temp;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of elements you want");
        num=input.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter the elements: ");
        for(int i=0;i<num;i++)
        {
            arr[i]= input.nextInt();
        }
        Scanner scan= new Scanner(System.in); //To get the input of k
        System.out.println("Enter the Kth input number");
        k= scan.nextInt();

        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }


            }
        }
        System.out.println(k +"th largest element is: "+arr[k-1]);
        System.out.println(k+"th smallest number "+arr[num-k]);

    }

}



