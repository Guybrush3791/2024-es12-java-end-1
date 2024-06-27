public class ContoBancario {

    private int saldo;

    public ContoBancario() {

        setSaldo(0);
    }

    public int getSaldo() {

        return saldo;
    }

    private void setSaldo(int saldo) {

        this.saldo = saldo;
    }

    public void deposita(int importo) throws IllegalArgumentException {

        if (importo <= 0)
            throw new IllegalArgumentException("L'importo deve essere maggiore di zero");

        setSaldo(getSaldo() + importo);
    }

    public void preleva(int importo) throws IllegalArgumentException {

        if (saldo - importo < 0)
            throw new IllegalArgumentException("Non puoi prelevare più di quanto hai");

        setSaldo(getSaldo() - importo);
    }

    @Override
    public String toString() {

        return "Saldo: " + getSaldo();
    }
}
