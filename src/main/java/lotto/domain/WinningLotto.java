package lotto.domain;

import java.util.List;

public class WinningLotto {

    private Lotto winningNumbers;
    private LottoNumber bonusNumber;

    private WinningLotto(Lotto winningNumbers, LottoNumber bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public static WinningLotto of(List<Integer> winningValues, int bonusValue) {
        valid(winningValues, bonusValue);
        Lotto winningNumbers = Lotto.of(winningValues);
        LottoNumber bonusNumber = LottoNumber.from(bonusValue);
        return new WinningLotto(winningNumbers, bonusNumber);
    }

    private static void valid(List<Integer> winningValues, int bonusValue) {
        if (winningValues.contains(bonusValue)) {
            throw new IllegalArgumentException("로또 번호와 보너스 번호는 중복될 수 없습니다.");
        }
    }

    public int matches(Lotto userLotto) {
        return (int) userLotto.getLotto().stream()
            .filter(winningNumbers.getLotto()::contains)
            .count();
    }

    public boolean matchBonus(Lotto userLotto) {
        return userLotto.getLotto().stream()
            .anyMatch(userNumber -> userNumber.equals(bonusNumber));
    }
}
