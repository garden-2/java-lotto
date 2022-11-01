# 문자열 계산기

https://edu.nextstep.camp/s/DVVUSLFe/ls/Ifpn27vK

# 구현 기능

- 연산
    - 더하기
        - 총합과 숫자를 받아 두수를 더한값을 반환
    - 빼기
        - 총합과 숫자를 받아 총합에서 숫자를 뺀값을 받환
    - 곱하기
        - 총합과 숫자를 받아 총합 에서 숫자를 곱한값을 반환
    - 나누기
        - 총합과 숫자를 받아 총합에서 숫자를 나눈값을 반환
    - 문자열이 연산자인지 판단
    - 문자열을 연산 타입으로 변환
- 계산기
    - 입력값을 저장하고 연산을 실행하는 클래스
    - 입력값을 저장하는 기능
        - 입력값이 연사자이면 적재하는 지긍
    - 연산하는 기능
        - 연산자가 있으면 연산
        - 연산자가 없으면 결과값에 더한다
    - 전체 계산결과를 리턴하는 기능
- 입력값
    - 사용자 입력값을 받아 변환하는 클래스
    - 입력값이 연산자인지 판단한다
    - 숫자를 반환한다
    - 연산자를 반환한다
- 메시지컨버터
    - 입력값을 변환하는 클래스
- 입력타입
    - 입력값을 받아 숫자/연산자인지 판단하고 타입에 맞는 계산기의 동작을 실행하는 클래스
    - 입락타입이 숫자/연사자에 따라 처리한다
        - 숫자 연산자는 계산기 객체와 입력값 객체를 받아 계산연산을 한다
        - 연산자는 계산기 객체와 입력값 객체를 받아 계산 연산을 한다.
    - input에 따라 타입을 생성한다
- 사용자 입력값을 쪼개고 반환하는 기능

# 기능 요구사항

- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
- 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.