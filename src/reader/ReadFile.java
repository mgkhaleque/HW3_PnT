package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String path = "/Users/zibonibrahim/Documents/MGK/gd.text";
		
		FileReader fr = null;//declare FileReader & assign null
		BufferedReader br = null;//declare BufferedReader & assign null
		
		fr = new FileReader (path);//saying new FileReader send the path to FileReader
		br = new BufferedReader(fr);
		
		String data = " ";
		while ((data = br.readLine()) !=null){
			System.out.println(data);
		}
		
		
		

	}

}
