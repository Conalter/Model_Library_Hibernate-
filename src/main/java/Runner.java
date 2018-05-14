import db.DBAuthor;
import models.Author;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author = new Author("Cormac", "McCarthy", "The Orchard Keeper", "Outer Dark", "Child of God", "Suttree", "Blood Meridian or the Evening Redness in the West");
        DBAuthor.save(author);

//        DBAuthor.delete(author);

        List<Author> authors = DBAuthor.getAuthors();



        Author foundAuthor = DBAuthor.find(author.getId());
    }
}
