package dataobjects;

import enums.UserRoleEnum;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDataobject {

  private final String email;
  private final String name;
  private final String surname;
  private final String birthDate;
  private final String password;
  private final String dateCreation;

  private UserRoleEnum role;
  private String dateUpdate;

  public UserDataobject(String email, String name, String surname, String birthDate,
      String password, UserRoleEnum role) {
    this.email = email;
    this.name = name;
    this.surname = surname;
    this.birthDate = birthDate;
    this.password = password;
    this.role = role;
    this.dateCreation = LocalDate.now().toString();
    this.dateUpdate = this.dateCreation;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof UserDataobject) {
      UserDataobject userObj = (UserDataobject) obj;
      return userObj.getEmail().equals(this.email) &&
          userObj.getPassword().equals(this.password);
    } else {
      return false;
    }
  }

  public String toStringNameSurname() {
    return "\t- {" + this.name + " - " + this.surname + "}";
  }
}
