public class CoinExchange {

	public static void main(String[] args) {
		int coins[] = { 1, 3, 5, 6, 7 };
		int n = 5;
		int sum = 3;
		System.out.println("minimum coins req : " + coinchange(coins, n, sum));
	}

	static int coinchange(int arr[], int n, int s) {
		int dp[][] = new int[n + 1][s + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= s; j++) {
				if (j == 0)
					dp[i][j] = 0;
				else
					dp[i][j] = Integer.MAX_VALUE;

			}
		}
		dp[0][0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= s; j++) {
				if (j - arr[i - 1] >= 0)
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - arr[i - 1]] + 1);
				else
					dp[i][j] = dp[i - 1][j];

			}
		}
		return dp[n][s];
	}
}
