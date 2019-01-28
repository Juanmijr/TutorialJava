package simulacroexamen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {

	Menormayor_primo test = new Menormayor_primo ();
	
	int numeros[] = test.numerosPrimos(57);
	
	
}
