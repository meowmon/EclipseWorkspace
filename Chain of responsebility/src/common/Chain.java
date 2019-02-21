package common;

import model.Bitcoin;

public interface Chain {
	void setNextChain(Chain nextChain);
	void handle(Bitcoin amount);
}
