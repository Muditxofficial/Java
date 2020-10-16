package com.company;

public class Bankacc {
    private String name;
    private Integer accno;
    private Integer balence;
    public Integer count=0;



    public Bankacc(String x,Integer n,Integer b) {
        this.name = x;
        this.accno = n;
        this.balence = b;
        count++;
    }

     int count_trans(){
        return count;
    }

    void deposit(Integer amount){
        this.balence+=amount;
        System.out.println(amount);
        count++;
    }

    void withdraw(Integer amount){
        if(balence!=0){
            count++;
            this.balence-=amount;
            System.out.println(balence);

        }else {
            System.out.println("not emough balence");
        }
    }

}
