package activities;

interface  Addable{
    int add(int a , int b);
}
public class Activity12 {
//The other variable, say ad2, contains a lambda function(has a body),
// that also saves the result of num1 plus num2.
public static void main(String[] args) {
    Addable ad1 = (a,b)->(a+b);
    System.out.println(ad1.add(10,20));

    Addable ad2= (int a,int b)->{
        return  a+b;
    };
    System.out.println(ad2.add(20,5));

}

}
