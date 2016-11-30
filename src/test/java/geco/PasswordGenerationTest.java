package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {
    private PasswordGeneration motDePasse;

    @Before
    public void setUp() throws Exception {
        motDePasse=new PasswordGeneration();

    }

    @Test
    public void testGetRandomPassword() throws Exception {
        String res;
        res=motDePasse.getRandomPassword();
        assertEquals(8,res.length());

    }
}