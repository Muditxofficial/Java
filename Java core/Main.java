package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Bankacc ob = new Bankacc("mudit",421,100);
        ob.deposit(200);
        ob.deposit(22);
        ob.withdraw(22);
        ob.count_trans();


    }
}
