package ru.netology.moneytransferservice.exception;

public class ErrorTransferException extends RuntimeException{

    public ErrorTransferException(String message) {
        super(message);
    }
}
