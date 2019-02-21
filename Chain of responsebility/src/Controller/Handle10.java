package Controller;

import common.Chain;
import model.Bitcoin;

public class Handle10 implements Chain {
	private Chain chain;
	@Override
	public void setNextChain(Chain chain) {
		this.chain=chain;
	}

	@Override
	public void handle(Bitcoin amount) {
		if(amount.getAmount() >= 10){
			int num = amount.getAmount()/10;
			System.out.println("Drop "+num+" coin10!");
			if(amount.getAmount() % 10 !=0) this.chain.handle(new Bitcoin( amount.getAmount() % 10));
		}else{
			this.chain.handle(amount);
		}
	}
}
