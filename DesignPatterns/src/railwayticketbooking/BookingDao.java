package railwayticketbooking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BookingDao {

	public static void main(String[] args) throws IOException {
		getAvailableTrains();
	}
		public static void getAvailableTrains() throws IOException{
			
			File file = new File("TrainDatabase");
			
			FileReader fr = new FileReader(file);
			
			BufferedReader br= new BufferedReader(fr);
			
			
			while(br.ready()){
				System.out.println(br.readLine());
			}
		}
}
