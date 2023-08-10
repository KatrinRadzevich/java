package org.example.Exceptions.Lesson3.ClassWork.Ex6;

import java.io.IOException;

public class SaveFileException extends IOException {
    public SaveFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
