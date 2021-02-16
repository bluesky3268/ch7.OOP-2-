interface Repairable {
}

class Unit1 {
    int hitHp;
    final int MAX_HP;

    Unit1(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit1 {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit1 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitHp = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitHp = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitHp = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitHp = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit1) {
            Unit1 u = (Unit1) r;
            while (u.hitHp != u.MAX_HP) {
                u.hitHp++;
            }
            System.out.println(u.toString() + "의 수리가 완료되었습니다.");
        }
    }
}

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        SCV scv = new SCV();
        Marine marine = new Marine();
        Dropship dropship = new Dropship();

        scv.repair(dropship);
        scv.repair(tank);
        scv.repair(scv);
        // scv.repair(marine); 마린은 Repairable 인터페이스를 구현한 클래스의 인스턴스가 아니기 때문에 repair될 수
        // 없다.
    }
}
