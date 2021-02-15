public class CastingTest1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        FireEngine1 fe1 = new FireEngine1();
        FireEngine1 fe2;

        fe1.water();
        c1 = fe1;
        // c1.water(); Car1타입에는 water라는 메소드가 없으므로 fe1과 같은 주소값을 가져 FireEngine1의 인스턴스를
        // 가르켜도 메소드를 호출할 수 없음.
        fe2 = (FireEngine1) c1;
        fe2.water();
        // FireEngine1 타입의 참조변수 fe2에 c1의 주소값을 집어넣으면 fe1, c1과 같은 주소값을 가지게 되어 FireEngine1의
        // 인스턴스를 가르키게 됨. water메소드 호출 가능.

    }

}

class Car1 {
    String color;
    int door;

    void drive() {
        System.out.println("drive.");
    }

    void stop() {
        System.out.println("stop.");
    }
}

class FireEngine1 extends Car1 {
    void water() {
        System.out.println("water");
    }
}
