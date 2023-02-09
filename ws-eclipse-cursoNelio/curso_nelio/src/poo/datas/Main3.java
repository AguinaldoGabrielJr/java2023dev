package poo.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main3 {

	public static void main(String[] args) {

		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2023-02-09");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-04T18:09:21");
		Instant d06 = Instant.parse("2023-02-04T01:30:26Z");
		
		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate proximaSemana = d04.plusDays(7);
		LocalDate proximoAno = d04.plusYears(7);
		
		System.out.println("Atual = " + d04);
		System.out.println("semanaPassada = " + semanaPassada);
		System.out.println("proximaSemana = " + proximaSemana);
		System.out.println("proximoAno = " + proximoAno);
		System.out.println();
		//Funcões com tempo
		LocalDateTime semanaPassadaTempo = d05.minusDays(7);
		LocalDateTime proximaSemanaTempo = d05.plusDays(7);
		
		System.out.println("semanaPassadaTempo = " + semanaPassadaTempo);
		System.out.println("proximaSemanaTempo = " + proximaSemanaTempo);
		System.out.println();
		//COm instant...é de momento de criação, tem microsegundos etc
		
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d06.minus(7, ChronoUnit.DAYS);
		
		System.out.println("semanaPassadaInstant = " + semanaPassadaInstant);
		System.out.println("proximaSemanaInstant = " + proximaSemanaInstant);
		
		//Calculando com a classe do java DUration
		//No t1 ele da erro por nao conseguir fazer os calcs sem h,s,m...dai converto dessa foma para LocalDAteTIme, errado colocar assim manualmente, T2 vai ter um clean
		Duration t1 = Duration.between(semanaPassada.atTime(0,0), d04.atTime(0,0));
		Duration t2 = Duration.between(semanaPassada.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(semanaPassadaTempo, d05);
		
		System.out.println();
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		
		//Com instant
		Duration t4 = Duration.between(semanaPassadaInstant, d06);
		Duration t5 = Duration.between(d06,semanaPassadaInstant);
		System.out.println("t4 dias = " + t4.toDays());
		System.out.println("t5 dias = " + t5.toDays());
	}

}
