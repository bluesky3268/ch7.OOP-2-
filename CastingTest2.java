public class CastingTest2 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car1 car2 = null;
        FireEngine1 fe = null;

        car1.drive();
        // fe = (FireEngine1) car1; 강제 형변환을 해줘서 컴파일 시에는 에러가 나지 않지만 실행하면 에러가 발생함.
        // 조상타입의 인스턴스를 자손타입의 참조변수로 참조할 수 없기 때문.
        fe = new FireEngine1();
        fe.drive();
        car2 = fe;
        car2.drive();

    }

}
