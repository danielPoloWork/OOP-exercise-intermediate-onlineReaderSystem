package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidatorUtil {

  private static final String PASSWORD_ALPHANUMERIC_SPECIALCHAR_LOWER_UPPER_8_16 = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[\"\\-\\\\/|\\]\\[}{)(?$*!%&='#@_:;~><.,^+])[A-Za-z\\d\"\\-\\\\/|\\]\\[}{)(?$*!%&='#@_:;~><.,^+]{8,16}";


  public boolean isValid(String password) {

    Pattern pattern = Pattern.compile(PASSWORD_ALPHANUMERIC_SPECIALCHAR_LOWER_UPPER_8_16);
    Matcher matcher = pattern.matcher(password);

    return matcher.matches();
  }
}

