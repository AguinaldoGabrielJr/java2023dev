package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		//Exemplo add
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Marco");
		list.add("Racquel");
		list.add(2, "Guina");
		
		System.out.println("Número de posições na lista: " + list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		
		//Exemplo remove
		list.remove(6);
		//Predicado(lambda) Se posição 0 do nome for M ele remove
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		//Exemplo mostrar posição, se não existir retora -1
		System.out.println("---------------------------");
		System.out.println("Posição de Bob: " + list.indexOf("Bob"));
		System.out.println("Posição de Marco: " + list.indexOf("Jesus"));
		System.out.println("---------------------------");
		
		/*Forma que java 8 em diante fez para list conseguir usar lambda...transformo o item da lista em stream, 
		com list.stream() e dai uso lambda e por fim faço voltar para lista com collect
		Aqui ele trás elementos que comecem com A */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		//Mesma forma de cima, aqui caso não tenha nada com J ele trás nulo, senão trás o resultado
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}