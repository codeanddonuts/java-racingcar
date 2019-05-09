package racingcar.view;

import java.util.List;
import java.util.Scanner;


public class InputView {
    private static final Scanner input = new Scanner(System.in);

    public static List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        List<String> names = InputValidation.filterTypos(input.nextLine());
        if (InputValidation.areValidNames(names)) {
            return names;
        }
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        return inputCarNames();

    }

    public static int inputNumberOfTrial() {
        System.out.println("시도할 회수는 몇회인가요?");
        String line = input.nextLine().trim();
        if (InputValidation.isValidNumber(line)) {
            return Integer.parseInt(line);
        }
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        return inputNumberOfTrial();
    }
}