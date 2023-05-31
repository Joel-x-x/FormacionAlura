package bytebank;

public abstract class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total = 0;

    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;

        Cuenta.total++;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws InsuficienteSaldoException{
        if(this.saldo < valor) {
            throw new InsuficienteSaldoException("Saldo insuficiente");
        }

        this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino) throws InsuficienteSaldoException{
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Cuenta.total = total;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}
