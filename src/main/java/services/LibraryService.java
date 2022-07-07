package services;

import interfaces.BookRepositoryInterface;
import interfaces.UserRepositoryInterface;

public class LibraryService {

  private final UserRepositoryInterface userRepositoryInterface;
  private final BookRepositoryInterface bookRepositoryInterface;

  public LibraryService(UserRepositoryInterface userRepositoryInterface, BookRepositoryInterface bookRepositoryInterface) {
    this.userRepositoryInterface = userRepositoryInterface;
    this.bookRepositoryInterface = bookRepositoryInterface;
  }
}