package exercisesJava.objects;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario("Toni Miquel", "Llull", "2457");
		usuario.setEmail("aaa@aaa.com");
		System.out.println("Nombre: " + usuario.getName());
		System.out.println("Apellido: " + usuario.getLastname());
		System.out.println("Id: "+ usuario.getId());

	}

}
