package Question1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) {
		BufferedReaderWriter brw = new BufferedReaderWriter();
		brw.BufferedWriterExample();// Create a new file if the file not exists and write new content in it
		brw.BufferedReaderExample(null);// Read the content from new file
	}

	void BufferedWriterExample() {

		try {
			
			String content = "This is the content to write into file";
			File file = new File("/Users/zhehuang/Desktop/New_File.txt");

			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	void BufferedReaderExample(BufferedReader br) {
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("/Users/zhehuang/Desktop/New_File.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}