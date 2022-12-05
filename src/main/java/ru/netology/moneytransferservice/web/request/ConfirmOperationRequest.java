package ru.netology.moneytransferservice.web.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfirmOperationRequest {

    String operationId;
    String code;

}
