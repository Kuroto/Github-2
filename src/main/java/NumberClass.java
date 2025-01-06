import java.util.Scanner;

public class NumberClass
{
    int number;

    public int getNumber()
    {
        Scanner input = new Scanner(System.in);
        this.number = input.nextInt();

        return this.number;
    }
}
