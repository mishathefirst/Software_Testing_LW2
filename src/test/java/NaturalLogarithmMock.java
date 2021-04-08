import org.junit.Test;

import org.mockito.Mockito;
import test.basic.NaturalLogarithm;
import test.basic.Sinus;
import test.derivative_functions.Cosinus;

import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

import static junit.framework.TestCase.assertEquals;

public class NaturalLogarithmMock {

    @Test
    public void cosSinusImpl() {
        Sinus sin = Mockito.mock(Sinus.class);
        when(sin.getSinus(anyDouble())).thenReturn(1.0);
        when(sin.getValue()).thenReturn(Math.PI/2);
        Cosinus cos = new Cosinus();

        assertEquals(0.0, cos.getCosinus(sin.getValue()), 0.1);
    }

    @Test
    public void integrationTest1() {
        NaturalLogarithm test = Mockito.mock(NaturalLogarithm.class);
        when(test.getNLogarithm(anyDouble())).thenReturn(1.0);



    }


}
