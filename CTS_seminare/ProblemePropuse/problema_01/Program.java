package cts.prototype.problema_01;

public class Program {
	public static void main(String[] args) throws CloneNotSupportedException {
		//Creare de obj
		Client original = new Client("Goga Cristina", "goga_cristina08@yahoo.com", "0742256307");
		 //Creare de copii folosind metodele
		Client shallowCopy =original.clone();
		ClientManagerDeepCopy clientDeepCopy = new ClientManagerDeepCopy(); 
		Client deepCopy= clientDeepCopy.deepCopy(original);
		original.setNume("Goga Maria");
		 System.out.println("Original name: " + original.getNume()); // 
	     System.out.println("Shallow copy name: " + shallowCopy.getNume()); //
	     System.out.println("Deep copy name: " + deepCopy.getNume()); // 
		
	} 

}
