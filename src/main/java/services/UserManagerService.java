package services;

import interfaces.UserRepositoryInterface;

public class UserManagerService {

  private final UserRepositoryInterface userRepositoryInterface;

  public UserManagerService(UserRepositoryInterface userRepositoryInterface) {
    this.userRepositoryInterface = userRepositoryInterface;
  }
}
