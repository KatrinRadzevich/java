package org.example.Exceptions.Lesson3.ClassWork.Ex1;

import java.io.IOException;

public class ReadFileException extends IOException {
    public ReadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
