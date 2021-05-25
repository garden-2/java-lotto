package lotto.domain;

import lotto.common.WinningType;
import lotto.view.ResultView;

import java.util.LinkedHashMap;
import java.util.Map;

public class LottoGamePlayer {
    ResultView resultView = new ResultView();

    public void play(LottoTicket winningLottoTicket, LottoTickets lottoTickets) {
        WinningType[] winningTypes = lottoTickets.getGameResults(winningLottoTicket);
        Map<WinningType, Integer> gameResult = getGameResult(winningTypes);
        resultView.printResultStatistics(gameResult);
    }

    public void play(LottoTicket winningLottoTicket, LottoTickets lottoTickets, int bonusNumber) {
        WinningType[] winningTypes = lottoTickets.getGameResults(winningLottoTicket, bonusNumber);
        resultView.printResultStatistics(getGameResult(winningTypes));
    }

    public int[] getMatchCountResult(WinningType[] winningTypes) {
        int[] matchCountResults = new int[] {0,0,0,0,0,0,0,0};
        for(int i=0; i<winningTypes.length; i++) {
            matchCountResults[winningTypes[i].getMatchCount()] ++;
        }

        return matchCountResults;
    }

    public Map<WinningType, Integer> getGameResult(WinningType[] winningTypes) {
        Map<WinningType, Integer> matchCountResults = initMatchCountResults();
        for(int i=0; i<winningTypes.length; i++) {
            matchCountResults.put(winningTypes[i], countResult(matchCountResults, winningTypes[i]));
        }

        return matchCountResults;
    }

    private Map<WinningType, Integer> initMatchCountResults() {
        Map<WinningType, Integer> matchCountResults = new LinkedHashMap<>();
        WinningType[] winningTypes = WinningType.values();
        for (int i = winningTypes.length-1; i >= 0; i--) {
            matchCountResults.put(winningTypes[i], 0);
        }

        return matchCountResults;
    }

    private int countResult(Map<WinningType, Integer> matchCountResults, WinningType winningType) {
        if (matchCountResults.containsKey(winningType)) {
            return matchCountResults.get(winningType) + 1;
        }
        return 1;
    }
}
