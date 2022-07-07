package services;

import interfaces.UserRepositoryInterface;

public class UserService {

  private final UserRepositoryInterface userRepositoryInterface;

  public UserService(UserRepositoryInterface userRepositoryInterface) {
    this.userRepositoryInterface = userRepositoryInterface;
  }
}
