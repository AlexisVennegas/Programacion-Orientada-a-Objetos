package clasesAnidadas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentroFormacion cf = new CentroFormacion();
		
		CentroFormacion.Aula aula6 = cf.new Aula();
		
		CentroFormacion.Aula aula13 = cf.new Aula();
		
		//Se mostraría el id del Centro de Formación
		System.out.println(cf.getId());
		//Se mostraría el id del aula
		System.out.println(aula6.getId());
	}

}
