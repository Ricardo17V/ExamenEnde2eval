package exa2ende2526.enunciado;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

public class CuentaCorrienteTest {
	private static CuentaCorriente cc;
	@Parameters
	public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            { 1000, 0.05, 50 },
            { 500, 0.02, 10 },
            { 2000, 0.03, 60 },
            { 1500, 0.04, 60 },
            { 0, 0.05, 0 }
        });
    }
	@BeforeClass
	public void crearLista() {
		
	}
	@Before
	public void crearTipoCuenta() {
		CuentaCorriente cuenta = new CuentaCorriente("Mario", 1000, 10);
	}
	@AfterClass
	public void limpiarLista() {
		
	}
	@After
	public void limpiarTipoCuenta() {
		CuentaCorriente cuenta = new CuentaCorriente("", 0, 0);
	}
	@Ignore
	public void testFiscal() {
		
	}
}
