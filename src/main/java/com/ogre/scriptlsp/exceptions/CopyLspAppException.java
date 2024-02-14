package com.ogre.scriptlsp.exceptions;

public class CopyLspAppException extends RuntimeException {

  public CopyLspAppException(String message) {
    super(message);
  }

  public CopyLspAppException(String message, Throwable cause) {
    super(cause);
  }
}
