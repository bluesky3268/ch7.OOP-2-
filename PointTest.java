public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        // super(); 컴파일러는 자동적으로 super();를 이 위치에 넣어서 실행한다.
        // super()는 Point클래스의 기본생성자를 뜻하기 때문에 Point()를 호출하게 되는데 기본생성자를 만들어주지 않아서 에러가 발생함.
        // 따라서 이 위치에 Point(x, y)가 호출 될 수 있도록 해주면 된다.
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
