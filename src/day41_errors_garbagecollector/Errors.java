package day41_errors_garbagecollector;

public class Errors {

	public static void main(String[] args) {
		
		//System.out.println(20/0);//RTE degil RanTimeException
		
		//String str="asd;// CTE dur...cunku tirnagi tamamlamadikca kod calismaz
		//bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir
		
		//JAVA da error dendigi zaman onune gecilemeyen, kod ile cozulemeyen
		//sistemden kaynakli buyuk hatalar kastedilir
		
		//Error lar unchecked dir ve java bunlari ongoremez
		//ancak gerceklestiginde kodun calismasi durdurulur
		
		String str="";
		for (int i = 0; i < 10000000; i++) {
			str+=i;
		}

	}

}
