import java.util.Arrays;

class Item implements Comparable<Item> {
    int weight, profit;
    double ratio;

    public Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        ratio = (double)profit / weight;
    }

    @Override
    public int compareTo(Item other) {
        return Double.compare(other.ratio, this.ratio);
    }
}

public class FractionalKnapSack {

    static void FindMaxProfit(int w[], int p[], int capacity) {
        Item[] items = new Item[w.length];
        for (int i = 0; i < w.length; i++) {
            items[i] = new Item(w[i], p[i]);
        }
        Arrays.sort(items);

        int max = 0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                max += item.profit;
                capacity -= item.weight;
            } else {
                max += ((double)capacity / item.weight) * item.profit;
                break;
            }
        }
        System.out.println("max profit : " + max);
    }

    public static void main(String[] args) {
        int wt[] = { 2, 3, 1 };
        int pft[] = { 10, 20, 30 };
        FindMaxProfit(wt, pft, 5);
    }
}
