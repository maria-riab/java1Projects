import java.util.Scanner;
/* the purpose of this code is to get the birthday of the user
  the birth day has to be between 1 and 31
  the birth month has to be between 1 and 12
  the birth year has to be greater than 1900
  
  I must validate whether the user has inputted an integer, and also if the integer is within desired range
  after checking, output in the terminal their whole birthday

*/

public class javaBirthdayValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int birthday = 0;
        int birthMonth = 0;
        long year = 0;
        
        boolean isValidBirthday = false; 
        boolean isValidBirthMonth = false;
        boolean isValidBirthYear =false;  
        
        
        do {
            // check if user has inputed an int for their birthday, and if not, quit
            System.out.print("Input your birthdate: ");
            if (scan.hasNextInt()){
                birthday = scan.nextInt();
            } else return;
            
            //clear the scanner buffer
            scan.nextLine();

            // check if user has inputed an int for their birth month, and if not, quit
            System.out.print("Input your birth month: ");
            if (scan.hasNextInt()){
                birthMonth = scan.nextInt();
                
            } else return;

            scan.nextLine();
              
             // check if user has inputed an int for their birthyear, and if not, quit
            System.out.print("Input your birth year: ");
            if (scan.hasNextLong()){
                year = scan.nextLong();
                
            } else return;

            scan.nextLine();
            
            // check if the user has the correct number ranges
            isValidBirthday = ((birthday > 0) && (birthday <= 31));
            isValidBirthMonth =  (birthMonth > 0) && (birthMonth <= 12);
            isValidBirthYear = year > 1900;

        } while (!(isValidBirthday && isValidBirthMonth && isValidBirthYear));

        scan.close();
        String birthMonthInLetters =  whatMonth(birthMonth);
        System.out.println("Your birthday is " + birthday + " of " + birthMonthInLetters + " " + year);


    }
  
  
    // function that takes the birth month as an int, and returns it as a string
    public static String whatMonth(int birthMonth) {
        String month = "";
        switch(birthMonth){
            case 1:
                month = "January";
                break;
            case 2:
                month = "Febuary";
                break;
            case 3:
                month = "March";
                break;
            case 4: 
                month = "April";
                break;
            case 5: 
                month = "May";
                break;
            case 6: 
                month = "June";
                break;
            case 7: 
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9: 
                month = "September";
                break;
            case 10: 
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
    }
    
}
