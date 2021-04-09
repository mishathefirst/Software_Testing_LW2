import org.junit.Test;

import org.mockito.Mockito;
import test.basic.NaturalLogarithm;
import test.basic.Sinus;
import test.derivative_functions.*;
import test.system.Function;

import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

import static junit.framework.TestCase.assertEquals;

public class IntegrationTest {

    @Test
    public void cosSinus() {
        Sinus sin = Mockito.mock(Sinus.class);
        when(sin.getSinus(anyDouble())).thenReturn(1.0);
        when(sin.getValue()).thenReturn(Math.PI/2);
        Cosinus cos = new Cosinus();

        assertEquals(0.0, cos.getCosinus(sin.getValue()), 0.1);
    }

    @Test
    public void tangentSinus() {
        Sinus sin = Mockito.mock(Sinus.class);
        when(sin.getSinus(anyDouble())).thenReturn(0.0);
        when(sin.getValue()).thenReturn(0.0);
        Cosinus cos = Mockito.mock(Cosinus.class);
        when(cos.getCosinus(anyDouble())).thenReturn(1.0);
        when(cos.getValue()).thenReturn(0.0);

        Tangent tan = new Tangent();

        assertEquals(0.0, tan.getTangent(sin.getValue()), 0.1);
        assertEquals(0.0, tan.getTangent(cos.getValue()), 0.1);
        assertEquals(tan.getTangent(cos.getValue()), tan.getTangent(sin.getValue()), 0.1);
    }

    @Test
    public void log2NaturalLog() {
        NaturalLogarithm nLog = Mockito.mock(NaturalLogarithm.class);
        when(nLog.getNLogarithm(anyDouble())).thenReturn(0.0);
        Log2 log2 = new Log2();

        assertEquals(log2.getLog2(1), log2.getLog2(Math.exp(nLog.getNLogarithm(1.0))));
    }

    @Test
    public void log3NaturalLog() {
        NaturalLogarithm nLog = Mockito.mock(NaturalLogarithm.class);
        when(nLog.getNLogarithm(anyDouble())).thenReturn(0.0);
        Log3 log3 = new Log3();

        assertEquals(log3.getLog3(1), log3.getLog3(Math.exp(nLog.getNLogarithm(1.0))));
    }

    @Test
    public void log5NaturalLog() {
        NaturalLogarithm nLog = Mockito.mock(NaturalLogarithm.class);
        when(nLog.getNLogarithm(anyDouble())).thenReturn(0.0);
        Log5 log5 = new Log5();

        assertEquals(log5.getLog5(1), log5.getLog5(Math.exp(nLog.getNLogarithm(1.0))));
    }

    @Test
    public void log10NaturalLog() {
        NaturalLogarithm nLog = Mockito.mock(NaturalLogarithm.class);
        when(nLog.getNLogarithm(anyDouble())).thenReturn(0.0);
        Log10 log10 = new Log10();

        assertEquals(log10.getLog10(1), log10.getLog10(Math.exp(nLog.getNLogarithm(1.0))));
    }

    @Test
    public void functionIntegration() {
        Sinus sin = Mockito.mock(Sinus.class);
        when(sin.getSinus(anyDouble())).thenReturn(-0.479426);
        Tangent tan = Mockito.mock(Tangent.class);
        when(tan.getTangent(anyDouble())).thenReturn(-0.546302);
        Function func = new Function();

        assertEquals(-1.6064, func.getFuncValue(-0.5), 0.01);
    }


}
