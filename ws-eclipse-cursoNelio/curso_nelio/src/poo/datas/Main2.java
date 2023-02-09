package poo.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2023-02-04");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-04T18:09:21");
		Instant d06 = Instant.parse("2023-02-04T01:30:26Z");
		
		/*for (String s : ZoneId.getAvailableZoneIds() ) {
			Mostra todos as regiões
			System.out.println(s);
		}*/
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("D04 DIA = " + d04.getDayOfMonth());
		System.out.println("D04 MÊS = " + d04.getMonthValue());
		System.out.println("D04 ANO = " + d04.getYear());
		
		System.out.println("D05 hora = " + d05.getHour());
		System.out.println("D05 min = " + d05.getMinute());
		System.out.println("D05 sec = " + d05.getSecond());
	}
}
