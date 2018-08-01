package com.github.pierry.backeasy.core.support;

import java.util.ArrayList;
import java.util.List;

public class Assertion {

  private List<String> errors = new ArrayList<>();
  private static final String EMAIL_REGEX = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";

  public Assertion isNull(String value) {
    if (value == null) {
      errors.add("Null");
    }
    return this;
  }

  public Assertion isEmpty(String value) {
    if (value.isEmpty()) {
      errors.add("Empty");
    }
    return this;
  }

  public Assertion lengthMin(String value, int min) {
    if (value.length() < min) {
      errors.add("Length min " + min);
    }
    return this;
  }

  public Assertion isEmail(String value) throws Exception {
    if (!value.matches(EMAIL_REGEX)) {
      errors.add("Invalid e-mail");
    }
    return this;
  }

  public void errors(String attribute) throws Exception {
    if (!errors.isEmpty()) {
      StringBuilder message = new StringBuilder(attribute + " errors: \n");
      for (String error : errors) {
        message.append(error);
        message.append("\n");
      }
      int index = message.lastIndexOf("\n");
      throw new Exception(message.substring(0, index));
    }
  }
}
