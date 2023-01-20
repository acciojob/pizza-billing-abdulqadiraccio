package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean extracheese=false;
    boolean extratopplings=false;
    boolean takeaway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
        }
        else{
            price=400;
        }

    }

    public int getPrice(){
        return this.price=price;
    }

    public void addExtraCheese(){
        // your code goes here
       if( !extracheese){
           price+=80;
           extracheese=true;
       }

    }

    public void addExtraToppings(){
        // your code goes here
       if(isVeg) {

           if (!extratopplings) {
               price += 70;
               extratopplings = true;
           }
       }
       else{
           if (!extratopplings) {
               price += 120;
               extratopplings = true;
           }
       }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            price+=20;
            takeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
String s="";
if(isVeg){
    s+="Base Price Of The Pizza: 300"+'\n';
}
else{
    s+="Base Price Of The Pizza: 400"+'\n';
}
if(extracheese){
    s+="Extra Cheese Added: 80"+'\n';
}
        if(isVeg&&extratopplings){
            s+="Extra Toppings Added: 70"+'\n';
        }
        if(!isVeg&&extratopplings){
            s+="Extra Toppings Added: 120"+'\n';
        }
        if(takeaway){
            s+="Paperbag Added: 20"+'\n';
        }
        s+="Total Price: "+Integer.toString(price)+'\n';
return this.bill=s;


    }
}
