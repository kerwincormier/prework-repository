import java.util.Scanner;

public class ArrayFunReverseIt {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //Decide the number of integers
            System.out.print("Enter how many integers to use: ");
            int numOfFriends = Integer.parseInt(scan.nextLine());

            int arrayOfInts[]=new int[numOfFriends];
            for (int i = 0; i<arrayOfInts.length; i++);
            System.out.println("Enter an integer: ");
            arrayOfInts[i]=scan.nextLine();

            //How to reverse the array?

        }

        //Now show your friend's numbers one by one
        for(int i = 0; i <arrayOfInts.length, i++) {
            System.out.print("Your numbers are " + (i + 1) + " : ");
            System.out.print(arrayOfInts[i] + "\n");
        }

    }



}

}
