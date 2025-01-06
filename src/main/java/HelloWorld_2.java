import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;

public class HelloWorld_2
{
    public static void main(String[] args)
    {
        NumberClass numbers = new NumberClass();

        System.out.println("This was repo was created in Github then used the URL to add it via IntelliJ.");
        System.out.print("What number is it? : ");
        int theNumber = numbers.getNumber();

        System.out.println("The number is: " + theNumber);
    }

    public void awesomeFunction()
    {
        System.out.println("This is the awesome function. It does what you want. Almost... apart from that it" +
                " doesn't do anything. This means the possibilities are endless! Imagine that!");
    }

    public void mergeConflict_Created_in_Master_branch()
    {
        System.out.println("This function was created in the master branch. Merge conflict exercise.");
        System.out.println("Adding this from Master, now changing it from the master.");
    }

    public void mergeConflict_Created_in_Feature_branch()
    {
        System.out.println("This function was created in the feature-branch. Merge conflict exercise.");
        System.out.println("Added this from the feature-branch. Now changing it as well from the feature.");
    }
}
