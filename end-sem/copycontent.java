import java.util.*;
import java.io.*;
class CopyContent{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		try{
			System.out.print("Enter file name: ");
			String myFile=sc.nextLine();

			System.out.print("Enter old file name: ");
			String oldFile=sc.nextLine();

			BufferedReader br=new BufferedReader(new FileReader(oldFile));
			BufferedWriter bw=new BufferedWriter(new FileWriter(myFile));
			String line;
           		 while ((line = br.readLine()) != null) {
            		    bw.write(line);
            		    bw.newLine();
           		 }

			System.out.println("copied successfull");
			br.close();
			bw.close();
		}
		       catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } 
        
        catch (IOException e) {
            System.out.println("Error: Problem in reading/writing file.");
        } 
        
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } 
	}
}