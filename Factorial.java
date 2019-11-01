
package mipaquete;


class Factorial {
public static void main(String [] args){
    int n=0;
    while(n<=10){
        System.out.print(n +"! =");
        System.out.println(factorial(n++));
    }
}


public static int factorial(int n){
    int f=1;
    while(n>1){
        f*=n;
        n--;
    }
return f;
}

}
