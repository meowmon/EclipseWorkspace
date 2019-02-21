package view;

import java.util.Scanner;

import Controller.*;
import common.Chain;
import model.Bitcoin;

public class ATM_Chain {

	private Chain c1;

	public ATM_Chain() {
		// initialize the chain
		this.c1 = new Handle500();
		Chain c2 = new Handle200();
		Chain c3 = new Handle100();
		Chain c4 = new Handle50();
		Chain c5 = new Handle10();
		

		// set the chain of responsibility
		this.c1.setNextChain(c2);
		c2.setNextChain(c3);
		c3.setNextChain(c4);
		c4.setNextChain(c5);
	}

	public static void main(String[] args) {
		ATM_Chain atm = new ATM_Chain();
		while (true) {
			int amount = 0;
			System.out.print("Enter amount :");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atm.c1.handle(new Bitcoin(amount));
		}

	}


}
