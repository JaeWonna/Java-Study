'''
변수의 종류는  1) 클래스 변수(static) 2) 인스턴스 변수(맴버 변수) 3) 지역변수 가 있으며
메서드의 종류는 1) 클래스 메서드(static) 2) 인스턴스 메서드(맴버 메서드) 가 있다

클래스 변수 / 클래스 메서드는 객체를 생성하지 않고 !! 클래스이름.메서드 이름과 같이 호출 가능하다
그러나 인스턴스 변수 / 인스턴스 메서드는 반드시 객체를 생성해야만 !! 호출이 가능하다

static을 언제 붙이나? -> 클래스를 설계할때 맴버변수 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 static을 붙인다

static 메서드는 인스턴스 변수를 사용할 수 없다 / 사용 가능한 것은 지역 변수와 클래스 변수이다 
그러나 인스턴스 변수 / 인스턴스 메서드는 static 맴버를 사용할 수 있다
'''


public class MyMath { 
    long a, b; //인스턴스 변수 a, b만을 이용해 작업하므로 매개변수가 필요 없다 
    long add() { return a+b; } //a, b는 인스턴스 변수 //인스턴스 변수와 관계 없이 매개변수만으로 작업이 가능하다 
    static long add(long a, long b) { return a+b; } //a, b는 지역 변수 
} 

class MyMathTest { 
    public static void main(String[] args) { 
    //클래스 메서드 호출 
    System.out.println(MyMath.add(200L, 100L)); //300 
      
    //인스턴스 메서드는 객체 생성 후에만 호출 가능 
    MyMath mm = new MyMath(); 
    mm.a = 200L; 
    mm.b = 100L; 
    System.out.println(mm.add()); 
    } 
}
