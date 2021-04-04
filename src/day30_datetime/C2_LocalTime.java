package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java da saat ile islem yapmak icin LocalTime class inden obje kullaniriz

		LocalTime saat = LocalTime.now();

		System.out.println(saat);// 21:38:22.090590700

		for (int i = 0; i < 1000000; i++) {
			i += 1;

		}
		LocalTime saat2 = LocalTime.now();

		System.out.println(saat2);
		System.out.println(saat.plusHours(15));//15 saat sonra 12:45:56.135162800
		System.out.println(saat.getSecond());//34
		System.out.println(saat.minusSeconds(100000));//bu kadar saniye once 18:09:54.153099400
		System.out.println(saat.now(ZoneId.of("Japan")));//japonya da saat 05:00:46.242889500
	}

}
