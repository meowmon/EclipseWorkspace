package Controller;

import common.Chain;
import model.Bitcoin;

public class Handle200 implements Chain {
	private Chain chain;
	@Override
	public void setNextChain(Chain chain) {
		this.chain=chain;
	}

	@Override
	public void handle(Bitcoin amount) {
		if(amount.getAmount() >= 200){
			int num = amount.getAmount()/200;
			System.out.println("Drop "+num+" coin200!");
			if(amount.getAmount() % 200 !=0) this.chain.handle(new Bitcoin( amount.getAmount() % 200));
		}else{
			this.chain.handle(amount);
		}
	}
}
