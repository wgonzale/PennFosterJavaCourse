package games.utilities;
import java.io.*;

public class FileManager{

	public synchronized void writeToFile(String saveState, String fileName) throws java.io.IOException {
		
		try(FileWriter myWriter = new FileWriter(fileName);){
			myWriter.write(saveState);
		}
		catch(IOException e) {
			System.out.println("An error occurred");
		}
	}

	public static void writeToFileAsync(String saveState, String fileName) throws java.io.IOException {
	
		class myThread implements Runnable{
			Thread mt;
			myThread(){
				mt = new Thread();
				mt.start();
			}
			
			public void run() {
				try {
					FileWriter myWriter = new FileWriter(fileName);
					myWriter.write(saveState);
					myWriter.close();
				}
				catch(IOException e) {
					System.out.println("An error occurred");
				}
			}
			
			
		}
	
		
		
		
	}




}
