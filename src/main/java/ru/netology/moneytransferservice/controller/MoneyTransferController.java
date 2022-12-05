package ru.netology.moneytransferservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.moneytransferservice.service.TransferService;
import ru.netology.moneytransferservice.web.request.ConfirmOperationRequest;
import ru.netology.moneytransferservice.web.request.TransferRequest;
import ru.netology.moneytransferservice.web.response.MoneyTransferResponse;

//todo javadoc
//todo validation in all dto and requests(?)
//todo unit тестами с использованием mockito
//todo интеграционные тесты с использованием testcontainers
// todo уточнить про метод преобразования суммы из фронтенда и убирания нулей, можно ли сделать это иначе? Почему фронт передает именно так?
// todo confirmation code уточнить вопрос нужно ли его где то вводить во фронте, как это лучше описать в приложении
// todo пересобрать образ в докер после всех исправлений в проекте


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MoneyTransferController {

    private final TransferService transferService;

    @Autowired
    public MoneyTransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public MoneyTransferResponse transfer (@RequestBody TransferRequest transferRequest) {
        MoneyTransferResponse response = transferService.transfer(transferRequest);
        return response;
    }

    @PostMapping("/confirmOperation")
    public MoneyTransferResponse confirmOperation (@RequestBody ConfirmOperationRequest operationRequest) {
        MoneyTransferResponse response = transferService.confirmOperation(operationRequest);
        return response;
    }
}

