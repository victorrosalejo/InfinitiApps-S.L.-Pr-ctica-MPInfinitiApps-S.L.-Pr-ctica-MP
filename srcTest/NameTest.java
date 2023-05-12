import org.junit.jupiter.api.Test;
import org.testng.Assert;
import javax.swing.JTextField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void name() {
        Name name = new Name();
        Character character = new Character();
        String[] entradas = {"JoseLuis","JoseLuis","a"};
        String ch = String.join(System.lineSeparator(), entradas) + System.lineSeparator();
        character.setName("a");
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character nuevoper = name.Name(character);
        Assert.assertEquals("JoseLuis", nuevoper.getName());

        ch = "salir\n";
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        nuevoper.setName("Juan");
        nuevoper = name.Name(character);
        assertEquals("Juan",nuevoper.getName());

    }
}