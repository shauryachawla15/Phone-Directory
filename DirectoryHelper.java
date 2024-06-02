// SHAURYA CHAWLA
// PROJECT-3 (FILE-2)

import java.io.*;
import java.util.*;
public class DirectoryHelper     //THE HELPER CLASS
{ 
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //Creating Directory
        Directory phoneDirectory = new Directory("names.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Display Menu 
        while(true) {
            System.out.println("Choose an option: ");
            System.out.println("option d: displayDirectory");
            System.out.println("Option a: Add a friend");
            System.out.println("Option r: Remove a friend");
            System.out.println("Option s: Search for a friend:");
            System.out.println("Option c: Change a friends phone number");
            System.out.println("Option m: Merge files (update phone directory)");
            System.out.println("Option q: Quit");
            
            String input_string = br.readLine();
            char[] input = input_string.toCharArray();
            if(input_string.equals("")) {
                System.out.println("Please choose a valid option.");
                continue;
            }
            else if(input[0]=='d' || input[0]=='D') {   // This option displays the directory. It displays all the names in the phone directory.
                phoneDirectory.displayDirectory();
            }
            else if(input[0]=='a' || input[0]=='A') {   // This option adds the name and the phone number of the person.

                System.out.println("Enter name: ");
                String name = br.readLine();
                System.out.println("Enter phone number: ");
                String phone = br.readLine();
                phoneDirectory.add(name, phone);
            }
            else if(input[0]=='r' || input[0]=='R') {   // This option removes or deletes the name of the number to the person it belongs to.
            
                System.out.println("Enter name to remove");
                String name = br.readLine();
                phoneDirectory.delete(name);
            }
            else if(input[0]=='s' || input[0]=='S') {   // This option searches for the name of a friend.
                System.out.println("Enter name to search");
                String name = br.readLine();
                System.out.println(phoneDirectory.getPhoneNumber(name));
            }
            else if(input[0]=='c' || input[0]=='C') {   // This option changes the name and the phone number.
                System.out.println("Enter name to change");
                String name = br.readLine();
                System.out.println("Enter phone number to change: ");
                String phone = br.readLine();
                phoneDirectory.change(name, phone);
            }
            else if(input[0]=='m' || input[0]=='M') {   // This option is used to merge the directories.It updates the existing ones by updating phone numbers and adding new friends.

               Directory d = new Directory("Update.txt");
                phoneDirectory.merge(d);
            }
            else if(input[0]=='q' || input[0]=='Q') {  // When the user chooses an invalid option. 
                break;
            }
            else {
                System.out.println("Please choose a valid option.");
            }
        }
    }
}