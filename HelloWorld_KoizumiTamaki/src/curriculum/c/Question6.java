package curriculum.c;

public class Question6 {

	public static void main(String[] args) {

		Player player = new Player();
		CPU cpu = new CPU();

		while (true) {

			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();

			System.out.println("あなたの手: " + handName(playerHand));
			System.out.println("CPUの手: " + handName(cpuHand));

			if (isWin(playerHand, cpuHand)) {
				System.out.println("あなたの勝ち！");
				break;
			} else if (playerHand == cpuHand) {
				System.out.println("あいこです！");
			} else {
				System.out.println("あなたの負け！");
			}
		}
	}

	public static String handName(int hand) {
		if (hand == 0)
			return "グー";
		if (hand == 1)
			return "チョキ";
		return "パー"; // 手の名前を表示
	}

	public static boolean isWin(int p, int c) {
		return (p == 0 && c == 1) ||
				(p == 1 && c == 2) ||
				(p == 2 && c == 0); // 勝ちを判断する

	}

}
