import Adapter.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)){
            System.out.println("반지름 5인 둥근 나사가 반지름 5인 홀에 맞습니다.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        // roundHole.fits(smallSqPeg); 들어갈수 없다. fits 메서드는 roundPeg 타입으로 실인수를 원하지만 squarePeg 타입으로 서로 호환되지않는다.

        // 이를 Adapter 디자인 패턴을 이용해 해결한다.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (roundHole.fits(smallSqPegAdapter)){
            System.out.println("정사각형 너비가 2인 못이 반지름 5인 홀에 들어갈 수있다.");
        }

        if (!roundHole.fits(largeSqPegAdapter)){
            System.out.println("정사각형 너비가 20인 못이 반지름 5에 들어갈 수 없다.");
        }

    }
}
