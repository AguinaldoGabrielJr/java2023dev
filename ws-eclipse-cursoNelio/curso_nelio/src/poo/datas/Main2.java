package poo.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main2 {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		System.out.println("Formatação Data-Hora --> Texto ISO 8601");
		
		LocalDate d04 = LocalDate.parse("2023-02-04");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-04T18:09:21");
		Instant d06 = Instant.parse("2023-02-04T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//Pega o horário do PC msm
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//Utilizando o doc colocar uma formatter feito já
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04);
		//Duas maneiras diferentes do mesmo resultado
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d05 = " + fmt2.format(d05));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("ISO_DATE_TIME");
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		
	}
}
