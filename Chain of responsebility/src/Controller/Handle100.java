package Controller;

import common.Chain;
import model.Bitcoin;

public class Handle100 implements Chain {
	private Chain chain;
	@Override
	public void setNextChain(Chain chain) {
		this.chain=chain;
	}

	@Override
	public void handle(Bitcoin amount) {
		if(amount.getAmount() >= 100){
			int num = amount.getAmount()/100;
			System.out.println("Drop "+num+" coin100!");
			if(amount.getAmount() % 100 !=0) this.chain.handle(new Bitcoin( amount.getAmount() % 100));
		}else{
			this.chain.handle(amount);
		}
	}
}
