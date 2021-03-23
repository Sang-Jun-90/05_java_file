package step5_02.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


// 파일 입력(File Input)
public class FileEx02 {

	public static void main(String[] args) {


		String fileName = "ex01.txt";
		
		File file = new File(fileName);   // 파일 객체 생성
		FileReader fr = null;    			// 파일 읽어보기
		BufferedReader br = null;   		// 텍스트 읽어오기
		
		if (file.exists()) {				// exists() : 파일이 존재하면, 결과는 true or false
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = br.readLine();
				System.out.println(data);
				
				data = br.readLine();
				System.out.println(data);
				
				// 전체텍스트를 읽어오는 예시
				
				while (true) {
					
					data = br.readLine();  // 읽어올 텍스트가 없으면 null을 반환한다.
					
					if (data == null) {
						break;
					}
					
					System.out.println(data);
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				 // 가장 나중에 open 한 객체부터 먼저 닫는다.
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};		
		
	}

}
