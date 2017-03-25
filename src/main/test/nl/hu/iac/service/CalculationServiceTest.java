package nl.hu.iac.service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Raoul on 3/25/2017.
 */
public class CalculationServiceTest {
    private CalculationService calcService;

    @Before
    public void init(){
        calcService = new CalculationService();
    }

    @Test
    public void calculateCorrect(){
        String result = calcService.Calculate("1", "100");
        TestCase.assertTrue(!result.equals("Cost: 0"));
    }

    @Test
    public void calculateIncorrect(){
        String result = calcService.Calculate("0", "100");
        TestCase.assertTrue(result.equals("Cost: 0"));
    }

    @Test
    public void getAll(){
        TestCase.assertTrue(calcService.getAll() != null || !calcService.getAll().isEmpty());
    }
}