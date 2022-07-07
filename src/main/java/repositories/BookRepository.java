package repositories;

import dataobjects.BookDataobject;
import interfaces.BookRepositoryInterface;
import java.util.HashMap;
import java.util.Map;

public class BookRepository implements BookRepositoryInterface {

  private final Map<String, BookDataobject> databasae;

  public BookRepository() {
    this.databasae = new HashMap<>();
  }
}