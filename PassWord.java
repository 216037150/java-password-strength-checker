import java.util.Scanner;
/*
 * Create a program that checks if a given password is strong based on criteria like:
 *  length, use of numbers, special characters, and uppercase letters.
 */
class PassWord{

    public static void main(String[] args){

        try (Scanner password = new Scanner(System.in)) {
            System.out.print("Please create a strong password: ");
            String myPassword = password.nextLine();

            if(myPassword.length()>8){
                System.out.println("Your password meet the requirement of the password's length");
            }else{
                System.out.println("Your password is week");
            }
        }


    }
}

