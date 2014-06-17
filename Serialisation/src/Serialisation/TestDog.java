package Serialisation;
import java.io.*;

public class TestDog {
	
	public static void main(String [] args)
	{
		Dog d= new Dog();
		Dog d2= new Dog("chris");
		
		try {
			FileOutputStream fileOut = new FileOutputStream("animal.ser");

			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(d2);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in animal.ser");

		} catch (IOException i) {
			i.printStackTrace();
		}
		
		
		
		d = null;
		try
	      {
	         FileInputStream fileIn = new FileInputStream("animal.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         d=(Dog) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	          return;

	      }catch(ClassNotFoundException c)

	      {
	          System.out.println("Employee class not found");
	          c.printStackTrace();
	          return;
	       }
	       System.out.println("Deserialized Employee...");
	       System.out.println("Name: " + d.getName());
	       System.out.println("Type: " + d.getType());
	     }
	 

 }
	
	

	


