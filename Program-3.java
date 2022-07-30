import java.util.Scanner;

class Series {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    int count=0,init=1;
    x=sc.nextInt();
    x=(x%2==0)?x-1:x;
    while(count<x)
    {
        System.out.print(init+" ");
        count+=1;
        init+=2;
    }
    System.out.println();
    sc.close();
  }
}