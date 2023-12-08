/*a.	Create a folder
b.	Add two files to the folder
c.	Display the folder contents
d.	Add another file to the folder
e.	Display the folder contents 
f.	Remove the named file from the folder
g.	Display the folder contents  */

package AggregationAndComposition;

public class FileSystem {
    public static void main(String[] args){
        Folder folder1 = new Folder();
        File plik1 = new File("Plik1");
        File plik2 = new File("Plik2");
        File plik3 = new File("Plik3");
        
        folder1.addFile(plik1);
        folder1.addFile(plik2);
        folder1.display();
        folder1.addFile(plik3);
        folder1.display();
        folder1.removeFile("Plik3");
        folder1.display();


    }
}
