package capitulo3.Ejercicios;

public class BankAccount {

    private String nameOwner;
    private Integer accounutnum;
    private Integer AccountBalance;


    public BankAccount() {
        this.nameOwner = "xxx";
        this.accounutnum = 00000;
        AccountBalance = 0000;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public Integer getAccounutnum() {
        return accounutnum;
    }

    public void setAccounutnum(Integer accounutnum) {
        this.accounutnum = accounutnum;
    }

    public Integer getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        AccountBalance = accountBalance;
    }

    public Integer deductMonthlyFee(){
        return getAccountBalance()-4;
    }

    public static String explainAccountPolicy(){
        return "$4.00 seran reducidos de su balance mensualmente";
    }
}
