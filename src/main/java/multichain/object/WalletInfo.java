package multichain.object;

public class WalletInfo {
    int walletversion;
    double balance;
    int walletdbversion;
    long txcount;
    long utxocount;
    long keypoololdest;
    int keypoolsize;

    public WalletInfo() {
    }

    public WalletInfo(int walletversion, double balance, int walletdbversion, long txcount, long utxocount, long keypoololdest, int keypoolsize) {
        this.walletversion = walletversion;
        this.balance = balance;
        this.walletdbversion = walletdbversion;
        this.txcount = txcount;
        this.utxocount = utxocount;
        this.keypoololdest = keypoololdest;
        this.keypoolsize = keypoolsize;
    }

    public int getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(int walletversion) {
        this.walletversion = walletversion;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getWalletdbversion() {
        return walletdbversion;
    }

    public void setWalletdbversion(int walletdbversion) {
        this.walletdbversion = walletdbversion;
    }

    public long getTxcount() {
        return txcount;
    }

    public void setTxcount(long txcount) {
        this.txcount = txcount;
    }

    public long getUtxocount() {
        return utxocount;
    }

    public void setUtxocount(long utxocount) {
        this.utxocount = utxocount;
    }

    public long getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(long keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public int getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }
}
