package poo.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Now --> Data-Hora");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		
		System.out.println();
		System.out.println("Texto ISO 8601 --> Data-Hora");
		LocalDate d04 = LocalDate.parse("2023-02-04");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-04T18:09:21");
		Instant d06 = Instant.parse("2023-02-04T01:30:26Z");
		Instant d07 = Instant.parse("2023-02-04T01:30:26-03:00");
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		
		System.out.println();
		System.out.println("Texto ISO 8601 --> Data-Hora");
		
		//Dessa forma abaixo da erro pq nãoe esta especificado, tenho que usar date time formatter
		//Instant d08 = Instant.parse("04/02/2023");
		//System.out.println("d08 = " + d08);
		
		LocalDate d08 = LocalDate.parse("04/02/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("04/02/2023 01:30", fmt2);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		
		System.out.println();
		System.out.println("Dia, mês, ano,horaário --> Data-Hora");
		LocalDate d10 = LocalDate.of(2023, 2,04);
		LocalDateTime d11 = LocalDateTime.of(2023,2,04,1,30);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
