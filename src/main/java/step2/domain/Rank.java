package step2.domain;

public enum Rank {
    POSTION_4(5000, 3),
    POSTION_3(50000, 4),
    POSTION_2(1500000, 5),
    POSTION_1(2000000000, 6);

    public final int price;
    public final int matchCount;

    Rank(int price, int matchCount) {
        this.price = price;
        this.matchCount = matchCount;
    }
}
