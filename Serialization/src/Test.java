import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		Demo obj = new Demo(1,"abc");
		String filename = "file.ser";
		
		FileOutputStream file;
		try {
			file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(obj);
			 out.close(); 
	         file.close(); 
	         System.out.println("Object has been serialized"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Demo object1 = null; 
		  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream fileq = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(fileq); 
              
            // Method for deserialization of object 
            object1 = (Demo) in.readObject(); 
              
            in.close(); 
            fileq.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    } 
} 