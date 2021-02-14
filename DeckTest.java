public class DeckTest {
    public static void main(String[] args) {
        // 새로운 카드Deck 만들기
        Deck d = new Deck();
        // 섞기 전, 제일 위의 카드 뽑기
        Card c = d.pick(0);
        System.out.println(c);
        // 섞기
        d.shuffle();
        // 섞은 후 제일 위의 카드 뽑기
        c = d.pick(0);
        System.out.println(c);
    } // End Main
}

class Deck {
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];

    // 카드 초기화하기
    Deck() {
        int i = 0;
        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n + 1);
            }
        }
    } // End Deck()

    // 지정된 index에 있는 카드 하나 꺼내서 반환하기.
    Card pick(int index) {
        return cardArr[index];
    }

    // Deck에서 카드 하나 선택하기
    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {

            int r = (int) (Math.random() * CARD_NUM);

            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }
} // End class Deck

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
        String numbers = "0123456789XJQK";
        return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number);
    }
} // End class Card
