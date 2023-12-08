/*8.	A files system is a way of storing data on a storage device.
The data is organised in computer files and folders.
A folder is a container, where many files can be placed.
Create a class diagram that shows classes for a folder and file, their attributes and methods, and their relationships.
Assume that a folder can contain any number of files and does not contain other folders.
Then, define the classes, their attributes and methods.
To store any number of files in a folder, you can use a resizable array such as ArrayList. Finally, write a program that:
a.	Create a folder
b.	Add two files to the folder
c.	Display the folder contents
d.	Add another file to the folder
e.	Display the folder contents 
f.	Remove the named file from the folder
g.	Display the folder contents 
 */

package AggregationAndComposition;

import java.util.ArrayList;

public class Folder {
    ArrayList<File> folder = new ArrayList<File>();

    public void display(){
        for(int i = 0; i<this.folder.size(); i++){
            System.out.print(this.folder.get(i).getName()+" ");
        }
        System.out.println();
    }

    public void addFile(File file){
        this.folder.add(file);
    }

    public void removeFile(String file){
        for(int i = 0; i<this.folder.size(); i++){
            if (this.folder.get(i).getName()==file){
                this.folder.remove(i);
            }
        }
    }
}
