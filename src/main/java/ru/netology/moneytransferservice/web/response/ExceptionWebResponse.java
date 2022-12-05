package ru.netology.moneytransferservice.web.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionWebResponse {

    private String errorMessage;
    private int id;

}
