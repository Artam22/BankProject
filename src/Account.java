

public class Account {

    // FIELDS
    private final int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;

    private static int idC = 1000;


    // CONSTRUCTORS

    public Account(int customerId, AccountType accountType) {
        this.accountId = idC++;
        setCustomerId(customerId);
        setAccountType(accountType);
    }

    // GETTER AND SETTER METHODS
    // TODO GETTER VE SETTER METODLARINI OLUŞTURUN

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


    ////////////////////////////////////////////////////////////////////////////


    // TODO PARA EKLE (DEPOSIT) METODU
    //  YATIRILACAK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ ARTMIŞ OLMALIDIR.
    public void depositToAmount(double amount) {
    /*
      1. BU METODU BankSimulation SINIFINDAKİ depositToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
      2. YATIRILMAK İSTENEN TUTAR, SIFIRDAN BÜYÜK MÜ DEĞİL Mİ KONTROL EDİN
      3. BÜYÜKSE BAKİYEYE İLAVE EDİP KULLANICIYA MESAJ VERİN
      4. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...
     */
        if (amount > 0){
            this.balance += amount;
            System.out.println("New balance= " + this.balance);
        }
        else {
            System.out.println("Please enter a valid number.");
        }



    }
    ////////////////////////////////////////////////////////////////////////////////////////


    // TODO PARA ÇEK (WITHDRAW) METODU
    //  ÇEKİLECEK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ TUTAR KADAR AZALMIŞ OLMALIDIR.
    public void withdrawToAmount(double amount) {
        /*
         1. BU METODU BankSimulation SINIFINDAKİ withdrawToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
         2. ÇEKİLMEK İSTENEN TUTAR, NEGATİF Mİ, DEĞİL Mİ KONTROL EDİN
         3. ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ, DEĞİL Mİ KONTROL EDİN
         4. ÇEKİLMEK İSTENEN TUTAR (amount) POZİTİFSE VE BAKİYEDEN KÜÇÜKSE,BAKİYEDEN DÜŞÜP,YENİ BAKİYEYİ KULLANICIYA BİLDİRİN...
         5. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE YA DA BAKİYEDEN BÜYÜKSE,KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN
         */
        if (amount > 0 && amount < this.balance){
            this.balance -= amount;
            System.out.println("New balance= " + this.balance);
        }
        else {
            System.out.println("Please enter a valid number.");
        }

    }
    /////////////////////////////////////////////////////////////////////////////////////

    // TODO TO STRING METODUNU OLUŞTURUN

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }


    ////////////////////////////////////////////////////////////////////////////////////////
}
