package multichain.object.formatters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import multichain.object.TransactionWallet;
import multichain.object.TransactionWalletDetailed;
import multichain.object.WalletInfo;

import java.util.ArrayList;
import java.util.List;

public class WalletFormatter {
	public final static WalletInfo formatWalletInfo(Object objectWalletInfo) {
		WalletInfo walletInfo = new WalletInfo();

		if (objectWalletInfo != null && LinkedTreeMap.class.isInstance(objectWalletInfo)) {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();

			String jsonValue = gson.toJson(objectWalletInfo);
			walletInfo = gson.fromJson(jsonValue, WalletInfo.class);
		}

		return walletInfo;
	}
}
