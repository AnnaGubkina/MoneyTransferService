package ru.netology.moneytransferservice.service;

import org.springframework.stereotype.Service;
import ru.netology.moneytransferservice.web.request.ConfirmOperationRequest;
import ru.netology.moneytransferservice.web.request.TransferRequest;
import ru.netology.moneytransferservice.web.response.MoneyTransferResponse;

@Service
public interface TransferService {

    MoneyTransferResponse transfer(TransferRequest transferRequest);

    MoneyTransferResponse confirmOperation(ConfirmOperationRequest operationRequest);
}
