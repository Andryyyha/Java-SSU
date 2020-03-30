package model;

public class Operation {
    private long id;
    private String date;
    private String currency;
    private String accFrom;
    private String accTo;
    private long amount;
    private long amountBeforeOperation;
    private long amountAfterOperation;

    public Operation() {
    }

    public Operation(long id, String date, String currency, String accFrom, String accTo, long amount, long amountBeforeOperation) {
        this.id = id;
        this.date = date;
        this.currency = currency;
        this.accFrom = accFrom;
        this.accTo = accTo;
        this.amount = amount;
        this.amountBeforeOperation = amountBeforeOperation;
    }

    public long getAmountAfterOperation() {
        return amountAfterOperation;
    }

    public void setAmountAfterOperation(long amountAfterOperation) {
        this.amountAfterOperation = amountAfterOperation;
    }

    public long getAmountBeforeOperation() {
        return amountBeforeOperation;
    }

    public void setAmountBeforeOperation(long amountBeforeOperation) {
        this.amountBeforeOperation = amountBeforeOperation;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getAccTo() {
        return accTo;
    }

    public void setAccTo(String accTo) {
        this.accTo = accTo;
    }

    public String getAccFrom() {
        return accFrom;
    }

    public void setAccFrom(String accFrom) {
        this.accFrom = accFrom;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
