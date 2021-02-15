class Product1 {
    int price;
    int bonusPoint;

    Product1(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product1 {
    Tv1() {
        // 조상클래스의 생성자 Product(int price) 호출
        // Tv1의 가격은 100
        super(100);
    }

    // toStrin() 오버라이딩하기.
    public String toString() {
        return "Tv";
    }
}

class Computer1 extends Product1 {
    Computer1() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer1 {
    int money;
    int bonusPoint = 0;

    void buy(Product1 p) {
        if (money < p.price) {
            System.out.printf("잔액이 부족합니다. %s를 구입할 수 없습니다.%n", p);
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하였습니다.");
    }
}

public class PolyArgumentTest1 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();
        b.money = 250;

        b.buy(new Computer1());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 남은 보너스점수는 " + b.bonusPoint + "점입니다.");
        System.out.println();
        b.buy(new Tv1());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 남은 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
