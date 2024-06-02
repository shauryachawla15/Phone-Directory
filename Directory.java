// SHAURYA CHAWLA
// PROJECT-3 (FILE-1)

import java.util.*;
import java.io.*;

public class Directory {                               // THE DIRECTORY CLASS
    HashMap<String, String> phonebook;
    
Directory(String names) throws FileNotFoundException, IOException{
phonebook = new HashMap<>();
BufferedReader br = new BufferedReader(new FileReader(names));
String line;
while((line = br.readLine())!=null) {
String tokens[]= line.split(":");
 phonebook.put(tokens[0].trim(), tokens[1].trim());
        }
    }
    
public String getPhoneNumber(String name)     // This method adds the name and the phone number of the person.
{
if(phonebook.containsKey(name))
     return phonebook.get(name);
else
     return "The name does not exist in the directory";
    }
    
public void delete(String name)                // This method removes or deletes the name of the number to the person it belongs to.
{
if(phonebook.containsKey(name))
      phonebook.remove(name);
else
     System.out.println("The name already does not exist in the directory.");
    }
    
public void add(String name, String number)    // This method adds a phone number with the name to the person it belongs to.
 {
if(phonebook.containsKey(name))
      System.out.println("Name already in directory");
else
      phonebook.put(name, number);
    }
    
public void change(String name, String number)  // This method is used to change the name and phone number of the person.
{
if(!phonebook.containsKey(name))
       System.out.println("Name not in directory");
else
       phonebook.put(name, number);
    }
    
public void displayDirectory()                 // This method displays all friends with their names.
{
ArrayList<String> a = new ArrayList<>(phonebook.keySet());
Collections.sort(a);
   for(String name: a) {
       System.out.println(name+":" + phonebook.get(name));
        }
    }
    
public void merge(Directory phoneDirectory)     // This method is used to merge the directories.It updates the existing ones by updating phone numbers and adding new friends.
 {
   for(String name: phoneDirectory.phonebook.keySet()) {
        if(phonebook.containsKey(name)) {
                change(name, phoneDirectory.getPhoneNumber(name));
            }
        else {
                add(name, phoneDirectory.getPhoneNumber(name));
            }
        }
    }
}