import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionTest {

    @Test
    void description() {
        Description description = new Description();
        Character character = new Character();
        String[] entradas = {"Ahora es oro 3"};
        String ch = String.join(System.lineSeparator(), entradas) + System.lineSeparator();
        character.setDescription("Es un platita");
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character nuevoper = description.Description(character);


        Assert.assertEquals("Ahora es oro 3", nuevoper.getDescription());

        ch = "salir\n";
        nuevoper.setDescription("Que locura de pibe");
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Assert.assertEquals("Que locura de pibe", nuevoper.getDescription());





    }
}