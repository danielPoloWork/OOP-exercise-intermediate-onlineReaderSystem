package repositories;

import dataobjects.UserDataobject;
import interfaces.UserRepositoryInterface;
import java.util.HashMap;
import java.util.Map;

public class UserRepository implements UserRepositoryInterface {

  private final Map<String, UserDataobject> databasae;

  public UserRepository() {
    this.databasae = new HashMap<>();
  }
}