class Complex{
int real;
int imag;
Complex(int real,int imag){
this.real=real;
this.imag=imag;
}

public static Complex sum(Complex c1,Complex c2){

Complex temp=new Complex(0,0);

temp.real=c1.real+c2.real;
temp.imag=c1.imag+c2.imag;

return temp;}

public static void main (String a[]){
Complex c1=new Complex(5,5);
Complex c2=new Complex(4,3);
Complex temp=sum(c1,c2);
System.out.println("the sum is=" + temp.real+ "+" +temp.imag+ "i");
System.out.println("by Amal Manoj rolenumber 12   date /13/2/2024");
}}



