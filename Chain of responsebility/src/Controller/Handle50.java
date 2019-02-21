package Controller;

import common.Chain;
import model.Bitcoin;

public class Handle50 implements Chain {
	private Chain chain;
	@Override
	public void setNextChain(Chain chain) {
		this.chain=chain;
	}

	@Override
	public void handle(Bitcoin amount) {
		if(amount.getAmount() >= 50){
			int num = amount.getAmount()/50;
			System.out.println("Drop "+num+" coin50!");
			if(amount.getAmount() % 50 !=0) this.chain.handle(new Bitcoin( amount.getAmount() % 50));
		}else{
			this.chain.handle(amount);
		}
	}
}
