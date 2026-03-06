package exa2ende2526.enunciado;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

public class CuentaAhorroTest {
	private static CuentaAhorro ca;
	@Parameters
	public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            { 1000, 10, -10 },
            { 500, 5, -5 },
            { 2000, 20, -20 },
            { 1500, 0, 0 },
            { 0, 15, -15 }
        });
    }
	@BeforeClass
	public void crearLista() {
		
	}
	@Before
	public void crearTipoCuenta() {
		CuentaAhorro cuenta = new CuentaAhorro("Mario", 1000);
	}
	@AfterClass
	public void limpiarLista() {
		
	}
	@After
	public void limpiarTipoCuenta() {
		CuentaAhorro cuenta = new CuentaAhorro("", 0);
	}
	@Ignore
	public void testFiscal() {
		
	}
}
