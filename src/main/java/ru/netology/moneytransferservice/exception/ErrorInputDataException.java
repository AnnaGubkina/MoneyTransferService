package ru.netology.moneytransferservice.exception;

public class ErrorInputDataException extends RuntimeException{

    public ErrorInputDataException (String message) {
        super(message);
    }
}
