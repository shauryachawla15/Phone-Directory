This is my Phone Directory project, done in Java language. I built this when I was in my freshman year, in CSUS. It was a part of CSC-20 class( Programming Concepts and Methodology II). I have used OOPs concepts in Java for making this project.





CSC20 HW3               Phone Directory                          Sp2020 
 
You will implement a phone directory program that reads names of friends and their phone numbers from a file called names.txt (given) and stores them in a HashMap<key,value> data structure. Key and value are of String type Your program needs to be menu based and have the following capabilities: 
o	display all names in the phone directory; 
o	add a friend (given name, phone number)
o	search for a friend (given name)
o	remove a friend (given name) 
o	change phone number (given name, new phone number) 
o	merge directories. Given a new directory, update the existing one by updating phone numbers, and adding new friends.

Here is what the menu looks like:
![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/bc536b31-0216-46f7-bf97-e1eb77623c73)

  
You are given the driver DirectoryMain.java   that runs the menu which offers the above features You will need to write the class Directory.java and the helper functions in DirectoryHelper.java.
    
The class Directory.java instantiates a HashMap called directory and should implement the following methods:       
                      


 public Directory(String names) throws FileNotFoundException 
//constructor: reads names and numbers from the file into the map       
public String getPhoneNumber(String name) //number look up given name              public void delete(String name)           //remove a directory entry 
public void add(String name, String number // add friend given number 
public void change(String name, String number)  // change number
public void displayDirectory()// display the entire directory in sorted order
public void merge(Directory phoneDirectory) // reads from update.txt and merges it with the existing phone directory. 
  
You many also have other helper functions in the class. You need to make use of keySet and Sets to traverse through names in the map. You would also need to use the Collections class to sort.

The names file names.txt and update.txt separate names from  phone numbers with a ‘:’. e.g 
            Armando Lopez : 916-333-4444 
  Split the input string into two tokens corresponding to the key and value by splitting the   input string using String tokens[]= inline.split(":");   tokens[0] will is name and tokens[1] is phone number 

Here is what the User Interface for the phone directory should look like:

Main menu: Should accept upper and lower case:
 ![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/44ee775f-1887-4145-927c-4751ea2a530a)

 



Tests: option d:  displayDirectory
 ![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/fb2ebbc2-c8e9-4187-a9b9-89b920073557)

    
 Option a: Add a friend
![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/e798fb8a-0771-4df7-9d0b-df93c4374b6a)

 







Option r:  Remove a friend 

![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/3a99f7db-9d00-4016-9a22-bc3df43c4d70)

Option s: Search for a friend:
![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/35987296-a448-4807-a4d1-9d86b443d891)

 

Option c: Change a friends phone number
![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/e8344871-4e92-43ba-8eb3-793efa35d9b2)

 

Option m: Merge files (update phone directory)
![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/3b1ff251-2db3-44f1-bca7-bcceec0d3f52)


 


Option q: Quit 
![image](https://github.com/shauryachawla15/Phone-Directory/assets/142179616/45b7c553-3598-463a-ad21-dd3a72b97424)

 
