/*I enjoy writing programs.
I write a program that me have been given a file named “people.txt” – this contains the details of a person in the following
format:
Line 1 --- <firstname> <surname>
Line 2 --- <age>
Line 3 --- <gender>
The firstname and surname should be text; the age should be a number between 0 and 100, and the
gender should be either ‘M’ (for Male), ‘F’ (for Female), or ‘T’ (for Transgender)
Example:
Tiago Murphy
23
M
my task is to:
1) Read the information and store it in appropriate variables in my program.
2) Check that the data obeys the validation rules. These are:
a. The firstname and surname must be TEXT ONLY. No numbers are allowed. There
must be 1 space in the line to separate firstname from surname. If there is more
than 1 space, everything after the 1st space is considered to be the surname.
b. The age must be an integer between 0 and 100
c. The gender must be only the letter ‘M’, or the letter ‘F’ or the letter ‘T’.
If any of the validation rules have been broken, then I must output an appropriate error
message that tells the user clearly why it is not valid.
3) Output the data to a new file called “status.txt” in the following format:
<title> <surname>, <first initial>
<status>
MLO 1 - Understand and employ fundamental concepts and principles of programming such as
variables, Boolean expressions, control flow structures, methods, arrays, etc.
MLO 2 - demonstrate a structured approach to algorithmic design and problem solving and
exhibit professional development best practices in designing and developing robust,
maintainable software 
CA 1 – File Access & String Manipulation Page 3 of 4
The surname must be exactly as input.
The first initial must be the first letter of the firstname that was input. It must be output
after the surname. Note also that a comma must be output between the surname and the
first initial.
The title must be “Mr” if the gender was “M”, or “Ms” if the gender was “F”, or “Mx” if the
gender was “T”
The status must be “School” if the age was 18 or less, or “College” if the age was between 19
and 25, or “Worker” if the age was between 26 and 66, or “Retired” if the age is 67 or over.
Example output: (based on Tiago Murphy from above)
Mr. Murphy, T
College 
*"@Author Jurijus Pacalovas";
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1_;

/**
 *
 * @author Jurijus Pacalovas
 */


import java.io.File;  // Import the File class.
import java.io.FileNotFoundException;  // Import this class to handle errors.
import java.util.Scanner; // Import the Scanner class to read text files.
import java.io.BufferedWriter;// Writes text to character output stream.
import java.io.FileWriter;//Class is a convenience class for writing character files.
import java.io.IOException;//IOException is the base class for exceptions thrown while accessing information using streams,
                           //files and directories. 



public class Ass1_ {

  
   public static int agew(String age) {
            int i, i2=-1;
            int num;
           String age1;

            //The program check numbers of years.
            for (i = 0; i < 101; i++) {
            age1=String.valueOf(i); //int to String
            if ( age.equals(age1)){ 
            i2=0;

                    }
             if (i2==-1 && i==100)
            {
               i2=1; 
               if (i2==1)
            { System.out.println("\nError this isn't a number or incorect the number of years. \n");
                 System.exit(0);
            }
                }
            }
   


                num = Integer.parseInt(age);   //String to int
                
                return num;
                
   }

    public static void main(String[] args) {

        //I have created the Ass1 main class.
        //I have created the myObj.x.
        MyAuthor myObjl = new MyAuthor();
        System.out.println(myObjl.x);//I have created classes and object with the author with my name of the Ass1 program.


  /*     Line 1 --- <firstname> <surname>
Line 2 --- <age>
Line 3 --- <gender>
The firstname and surname should be text; the age should be a number between 0 and 100, and the
gender should be either ‘M’ (for Male), ‘F’ (for Female), or ‘T’ (for Transgender)
Example:
Tiago Murphy
23
M
  */    

        Scanner myKB = new Scanner(System.in);

        checkpeople checkpeople = new checkpeople();



        String MF;

        boolean founded = false;
            System.out.println("Please enter your full name. ");
            checkpeople.x = myKB.nextLine();



       //note use of .equals() -- this is for an exact match
       // in many situations I might use .equalsIgnoreCase() instead

  /*      
   My task is to:
1) Read the information and store it in appropriate variables in my program.
2) Check that the data obeys the validation rules. These are:
a. The firstname and surname must be TEXT ONLY. No numbers are allowed. There
must be 1 space in the line to separate firstname from surname. If there is more
than 1 space, everything after the 1st space is considered to be the surname.
b. The age must be an integer between 0 and 100
c. The gender must be only the letter ‘M’, or the letter ‘F’ or the letter ‘T’.
If any of the validation rules have been broken, then I must output an appropriate error
message that tells the user clearly why it is not valid.
3) Output the data to a new file called “status.txt” in the following format:
<title> <surname>, <first initial>
<status>
*/

           try {
      File myObj = new File("people.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {//I have created the loop while.
        String data = myReader.nextLine();//Here the program reads the people.txt file

        if ( checkpeople.x.equals(data)){
            //got it right
            System.out.print(data);//Here the program show the data of the file.

            String data1 = myReader.nextLine();
            System.out.print(" "+data1+" ");
            MF=data1;
            if (MF.equals("M")){
                      String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write("MR, M"); //the write method will  write a STRING to the file
            myWriter.newLine();




            myWriter.close(); //IMPORTANT -- this saves changes  to the file

        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);
        }
            }
            else if (MF.equals("F")){
                String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write("MS, F"); //the write method will  write a STRING to the file
            myWriter.newLine();




            myWriter.close(); //IMPORTANT -- this saves changes  to the file

        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);
        }
            }
            
       else if (MF.equals("T")){
                      String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write("MX, T"); //the write method will  write a STRING to the file
            myWriter.newLine();




            myWriter.close(); //IMPORTANT -- this saves changes  to the file

        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);
        }
            }
            else
             {
                System.out.println();
                 System.exit(0);

             }

            String data2 = myReader.nextLine();
            System.out.print(data2);

            String age=data2;
            
            int num;
            num = agew(age);





           System.out.println();
 /*           The status must be “School” if the age was 18 or less, or “College” if the age was between 19
and 25, or “Worker” if the age was between 26 and 66, or “Retired” if the age is 67 or over.
Example output: (based on Tiago Murphy from above)
Mr. Murphy, T
College 
*/

            String filename = "output.txt"; 
          
            if (num>18)
            {
               //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write("Work"); //the write method will  write a STRING to the file
            myWriter.newLine();




            myWriter.close(); //IMPORTANT -- this saves changes  to the file

        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);
        } 
            }   
            else if (num<18)
            {
               String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write("College"); //the write method will  write a STRING to the file
            myWriter.newLine();




            myWriter.close(); //IMPORTANT -- this saves changes  to the file

        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);
        } 
            }    
        else if (num>=67)
            {
               String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write("Retired"); //the write method will  write a STRING to the file
            myWriter.newLine();




            myWriter.close(); //IMPORTANT -- this saves changes  to the file

        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);
        } 


            }





            founded = true;

        }
        else {
            //must have failed - ran out of attempts

        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");//Here the program has one catch where error that can show: The file doesn't exist.
       System.exit(0);
      e.printStackTrace();

    }
    System.out.println();       
    System.out.println(founded);
    //The program check founded the name or not.


    if (founded){
        {


        //<surname>    


        String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times

        //Step 1 -- I need a BufferedWriter and FileWriter

        try {


            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true));
            //true = append to the file
            //false = overwrite the file

            myWriter.write(checkpeople.x); //the write method will  write a STRING to the file

            myWriter.newLine();


            myWriter.close(); //IMPORTANT -- this saves changes  to the file
        }
        catch(Exception e){

            System.out.println("Error writing to file " +  filename);
             System.exit(0);

        }


}