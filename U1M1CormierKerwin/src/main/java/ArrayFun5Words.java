    import java.util.Scanner;
    public class ArrayFun5Words {


        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            //Decide the number of friends
            System.out.print("Enter how many words: ");
            int numOfFriends = Integer.parseInt(scan.nextLine());

            //Create a string array to store the names of your friends
            String arrayOfWords[] = new String[numOfFriends];
            for (int i = 0; i < arrayOfWords.length; i++) {
                System.out.print("Enter a word " + (i+1) + " : ");
                arrayOfWords[i] = scan.nextLine();
            }

            //Now show your friend's name one by one
            for (int i = 0; i < arrayOfWords.length; i++) {
                System.out.print("Your words " + (i+1) + " : ");
                System.out.print(arrayOfWords[i] + "\n");
            }

        }}
