//class defined:

class product{

//declaring 3 clas

int pcode;
String pname;
int price;
//creating 3 objects of class
public static void main(String a[]){  //we declare the main meathod and the program start executing

product product1=new product();//a new instace is created
product1.pcode=1;
product1.pname="lexa";
product1.price=200;

product product2=new product();//a new instace is created
product2.pcode=2;
product2.pname="bexa";
product2.price=1200;

product product3=new product();//a new instace is created
product3.pcode=3;
product3.pname="mexa";
product3.price=2100;

product lowprice=product1;
if(product2.price<lowprice.price){
lowprice=product2;}

else if(product3.price<lowprice.price){
lowprice=product3;}

System.out.println("product with lower price:"+lowprice.pname);
System.out.println("by Amal Manoj -12");}}

