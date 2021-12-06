package com.knoldus.LambdaAssignmnet2;

interface NextEvenNumber{
    int result(long a);
}

public class FindNextEvenNumber{
public static void main(String...args){
    NextEvenNumber obj=(a)-> (int) (a+2-(a%2));
        System.out.println(obj.result(7));

}
}
