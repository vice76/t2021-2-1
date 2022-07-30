import java.util.Scanner;

class Series {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int arr[]=new int[n];
    int count[]=new int[10];
    //created a hash array where I will store the count of number are multiple 1,2..,8,9.
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<=9;j++)
        {
            if(arr[i]%j==0)
                count[j]++;
        }
    }
    //time complexity will be O(n*10) that will be approx O(n)
    for(int i=1;i<10;i++)
    {
        System.out.print(i+":"+count[i]+", ");
    }
    System.out.println();
    sc.close();
  }
}