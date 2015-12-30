package preparacionExamenMarzo.listaDePersonas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testInstanciarPersonaInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testInstanciarPersonaStringStringStringStringString() {
		//Fallan los nombres
		assertNull(Persona.instanciarPersona("a", "Gómez", "Fernández",
				"31/01/2000", "14002"));
		assertNull(Persona.instanciarPersona("Ana", "1aa", "Fernández",
				"31/01/2000", "14002"));
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "aa-", "31/01/2000",
				"14002"));
		//Fallan las fechas
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"32/02/2000", "14002"));
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"00/02/2000", "14002"));
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"31/13/2000", "14002"));
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"32/oo/2000", "14002"));
		//falla el código postal
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"31/01/2000", "14000"));
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"31/01/2000", "14000"));
		assertNull(Persona.instanciarPersona("Ana", "Gómez", "Fernández",
				"31/01/2000", "53002"));
		
		//aciertos
		assertNotNull(Persona.instanciarPersona("Ana", "Gómez", "De la Serna",
				"31/01/2000", "51002"));
		
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProvincia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCodigoPostal() {
		fail("Not yet implemented");
	}

}
