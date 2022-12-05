package ru.netology.moneytransferservice.web.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.moneytransferservice.model.Amount;

@Data
@AllArgsConstructor
public class TransferRequest {

    private String cardFromNumber;

    private String cardFromValidTill;

    private String cardFromCVV;

    private String cardToNumber;

    private Amount amount;

}
