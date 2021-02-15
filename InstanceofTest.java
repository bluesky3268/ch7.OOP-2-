public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine1 fe = new FireEngine1();
        if (fe instanceof FireEngine1) {
            System.out.println("This is a FireEngine instance.");
        }
        if (fe instanceof Car1) {
            System.out.println("This is a Car1 instance.");
        }
        if (fe instanceof Object) {
            System.out.println("This is a Object instance.");
        }
        System.out.println(fe.getClass().getName());
        // .getClass().getName() : 참조변수가 가리키고 있는 클래스의 이름을 문자열로 반환함.
    }
    // Object(최고조상) - Car1(부모클래스) - FireEngine1(자식클래스)
    // fe는 FireEngine1타입이지만 상속받은 조상타입의 instanceof에도 true값을 얻음.
}
