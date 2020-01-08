import java.util.Scanner;

public class Main
{

    private int count;
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Main countOne = new Main();
        countOne.getCount();
        countOne.showCount();




    }

    public  void getCount()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive number");
        count = keyboard.nextInt();
        if(count < 1)
        {
            System.out.println("Input must be positive");
            System.out.println("Try again");
            getCount();
        }
    }

    public void showCount()
    {
        for(int i = count; i>= 0; i--)
            System.out.print(i + " ");
        System.out.println("Blast off");
    }

}
