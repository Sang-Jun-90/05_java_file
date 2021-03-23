package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//# 파일 로드하기 : 연습문제


public class FileEx05_정답 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		String[] pws   = new String[3];
		int[] moneys   = new int[3];
		
		String fileName = "fileTest02.txt";

		File file = new File(fileName);
		
		if (file.exists()) {
			
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				int i = 0;
				while(true) {
					
					String data = br.readLine();
					if (data == null) break;
					
					String[] arrData = data.split("/");
					names[i] = arrData[0];
					pws[i] = arrData[1];
					moneys[i] = Integer.parseInt(arrData[2]);
					i++;
					
				}
				
				System.out.println(Arrays.toString(names));
				System.out.println(Arrays.toString(pws));
				System.out.println(Arrays.toString(moneys));
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {br.close();} catch (IOException e) {e.printStackTrace();}
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
			
			
			
		}
		
		
		
		
	}

}
