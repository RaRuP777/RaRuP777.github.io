package ListadoHerencia1;

/**
 * Dise�a, implementa y prueba las clases Mam�fero, Perro y Gato. Para ello,supongamos que:
 * a.Todomam�fero tiene patas y nombre
 * b.Un perro es un mam�fero con cuatro patas, nombre y que adem�s, ladra.
 * c.Un gatoes un mam�fero con cuatro patas, nombre y que adem�s,maulla.
 * d.Crea la clase TestMamiferos que:
 * i.Cree al perro Mil�
 * ii.Cree al gato Garfield
 * iii.Haga ladrar a Mil�
 * iv.Haga maullar a Garfield
 * v.Muestre los datos de Garfield y de Mil� mediante toString y mediantelos getters (prueba 
 * la diferencia entrehacerlosprotected y private)
 * 
 * @author Estela Mu&ntildeoz
 * @author Pedro J. Ramos
 *
 */
public class TestMamifero {

	public static void main(String[] args) {
		Perro milu = new Perro("Milu");
		Gato garfield = new Gato("Garfield");
		milu.ladrar();
		garfield.maullar();
		System.out.println(milu);
		System.out.println(garfield);
		System.out.print(milu.getNombre() + " tiene " + milu.getPatas()
				+ " patas");
		if (milu.getLadra())
			System.out.println(" y esta ladrando");
		else
			System.out.println(" no esta ladrando");
		System.out.print(garfield.getNombre() + " tiene " + garfield.getPatas()
				+ " patas");
		if (garfield.getMaulla())
			System.out.println(" y esta maullando");
		else
			System.out.println(" no esta maullando");

	}

}
