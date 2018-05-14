import models.Author;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    public Author author;

    @Before
    public void before(){
        author = new Author("Cormac", "McCarthy", "The Orchard Keeper", "Outer Dark", "Child of God", "Suttree", "Blood Meridian or the Evening Redness in the West");
    }

    @Test
    public void hasFirstName(){
        assertEquals("Cormac", author.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("McCarthy", author.getLastName());
    }

    @Test
    public void hasFirstBook(){
        assertEquals("The Orchard Keeper", author.getBookNo1());
    }
    @Test
    public void hasSecondBook(){
        assertEquals("Outer Dark", author.getBookNo2());
    }
    @Test
    public void hasThirdBook(){
        assertEquals("Child of God", author.getBookNo3());
    }
    @Test
    public void hasFourthBook(){
        assertEquals("Suttree", author.getBookNo4());
    }
    @Test
    public void hasFithBook(){
        assertEquals("Blood Meridian or the Evening Redness in the West", author.getBookNo5());
    }

}
