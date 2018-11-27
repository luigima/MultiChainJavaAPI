package multichain.command;

import multichain.command.builders.QueryBuilderWallet;
import multichain.command.builders.QueryBuilderWalletTransaction;
import multichain.command.tools.MultichainTestParameter;
import multichain.object.*;
import multichain.object.formatters.TransactionFormatter;
import multichain.object.formatters.TxOutFormatter;
import multichain.object.formatters.WalletFormatter;
import multichain.object.formatters.WalletTransactionFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WalletCommand extends QueryBuilderWallet {

	public WalletCommand(String ip, String port, String login, String password) {
		initialize(ip, port, login, password, null);
	}

	public WalletInfo getWalletInfo() throws MultichainException {
		WalletInfo walletInfo = new WalletInfo();

		Object objectWalletInfo = executeGetWalletInfo();
		walletInfo = WalletFormatter.formatWalletInfo(objectWalletInfo);

		return walletInfo;
	}

	protected Object executeGetWalletInfo() throws MultichainException {
		return execute(CommandEnum.GETWALLETINFO);
	}

}
