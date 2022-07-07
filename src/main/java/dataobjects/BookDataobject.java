package dataobjects;

import enums.BookGenreEnum;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDataobject {

  private final String isbn;
  private final String title;
  private final String description;
  private final BookGenreEnum genre;
  private final String author;
  private final String dateCreation;

  private String dateUpdate;

  public BookDataobject(String isbn, String title, String description, BookGenreEnum genre, String author) {
    this.isbn = isbn;
    this.title = title;
    this.description = description;
    this.genre = genre;
    this.author = author;
    this.dateCreation = LocalDate.now().toString();
    this.dateUpdate = this.dateCreation;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof UserDataobject) {
      BookDataobject bookObj = (BookDataobject) obj;
      return bookObj.getTitle().equals(this.title) &&
          bookObj.getAuthor().equals(this.author);
    } else {
      return false;
    }
  }

  public String toStringTitleGenreDescription() {
    return "\t- {" + this.title + " - " + this.genre + " - " + this.description + "}";
  }
}
