
public class ListasApp {

	public static void main(String[] args) {
		
		// instacia a estrutura de dados
		ListaEncadeada minhaLista=new ListaEncadeada();

		// Testa métodos isEmpty, size, add e print
		if(minhaLista.isEmpty())
			System.out.println("Lista Vazia");
		else 
			System.out.println("Size="+minhaLista.size());
			
		minhaLista.print();
	
		// testa os métodos add
		minhaLista.add("Jesus");
		minhaLista.add(new Aluno("José","2"));
		minhaLista.add(new Aluno("Maria","3"));
		minhaLista.add(new Aluno("João","4"));
		minhaLista.add(new Aluno("Pedro","5"));
		minhaLista.add(new Aluno("Judas","6")); 
		minhaLista.add(2,new Aluno("Tiago","7"));
		minhaLista.print();
		
		// testa indexOf		
		Aluno aux=new Aluno("Pedro","5");
		System.out.println(minhaLista.indexOf(aux));



		
		 Testa get
		try {
			System.out.println(minhaLista.get(8));
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}	
		try {
			System.out.println(minhaLista.get(2));
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
			

		 testa os métodos remove
		minhaLista.add(new Aluno("Jesus","0"));
		minhaLista.add(new Aluno("José","2"));
		minhaLista.add(new Aluno("Maria","3"));
		minhaLista.add(new Aluno("João","4"));
		minhaLista.add(new Aluno("Pedro","5"));
		minhaLista.add(new Aluno("Judas","6")); 
		minhaLista.add(new Aluno("Tiago","7"));
		minhaLista.print();
		
		minhaLista.remove(3);
		minhaLista.print();		

	}

}
