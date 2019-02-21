package Controller;

import common.Chain;
import model.Bitcoin;

public class Handle500 implements Chain {
	private Chain chain;
	@Override
	public void setNextChain(Chain chain) {
		this.chain=chain;
	}

	@Override
	public void handle(Bitcoin amount) {
		if(amount.getAmount() >= 500){
			int num = amount.getAmount()/500;
			System.out.println("Drop "+num+" coin500!");
			if(amount.getAmount() % 500 !=0) this.chain.handle(new Bitcoin( amount.getAmount() % 500));
		}else{
			this.chain.handle(amount);
		}
	}
}
