/*
&&(논리곱 AND)에서 앞이 거짓(false)이면 뒤의 문장은 수행되지 않는다
||(논리합 OR)에서 앞이 참(true)이면 뒤의 문장은 수행되지 않는다
단순 출력이 아닌 값 자체를 바꾸려면 =(대입 연산자)를 사용해야 한다
*/

public class HelloWorld{
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

    }
}
