package model;

import java.math.BigDecimal;

public class Account {
    private long uuid;
    private long clientIdPk;
    private BigDecimal amount;
    private String accCode;

    public Account() {
    }

    public Account(long uuid, long clientIdPk, BigDecimal amount, String accCode) {
        this.uuid = uuid;
        this.clientIdPk = clientIdPk;
        this.amount = amount;
        this.accCode = accCode;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getClientIdPk() {
        return clientIdPk;
    }

    public void setClientIdPk(long clientIdPk) {
        this.clientIdPk = clientIdPk;
    }

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (getUuid() != account.getUuid()) return false;
        if (getClientIdPk() != account.getClientIdPk()) return false;
        if (!getAmount().equals(account.getAmount())) return false;
        return getAccCode().equals(account.getAccCode());
    }

    @Override
    public int hashCode() {
        int result = (int) (getUuid() ^ (getUuid() >>> 32));
        result = 31 * result + (int) (getClientIdPk() ^ (getClientIdPk() >>> 32));
        result = 31 * result + getAmount().hashCode();
        result = 31 * result + getAccCode().hashCode();
        return result;
    }
}
