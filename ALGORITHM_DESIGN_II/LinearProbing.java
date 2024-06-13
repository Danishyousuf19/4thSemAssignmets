public class LinearProbing {
    static int arr[];
    static int n;
    static final int EMPTY = -999;

    @SuppressWarnings("static-access")
    LinearProbing(int n) {
        this.n = n;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = EMPTY;
        }
    }

    void add(int keys[]) {
        for (int key : keys) {
            add(key);
        }
        printArray();
    }

    void add(int key) {
        int hashIndex = key % n;
        if (arr[hashIndex] != EMPTY) {
            fit(key, hashIndex);
        } else {
            arr[hashIndex] = key;
        }
        System.out.println("Added key: " + key);
        printArray();
    }

    static void fit(int key, int hashIndex) {
        int startIndex = hashIndex;
        while (arr[hashIndex] != EMPTY) {
            hashIndex = (hashIndex + 1) % n;
            if (hashIndex == startIndex) {
                System.out.println("Hash table is full, couldn't insert key: " + key);
                return;
            }
        }
        arr[hashIndex] = key;
    }

    void remove(int key) {
        int hashIndex = key % n;
        int startIndex = hashIndex;
        while (arr[hashIndex] != EMPTY) {
            if (arr[hashIndex] == key) {
                arr[hashIndex] = EMPTY;
                System.out.println("Removed key: " + key);
                printArray();
                return;
            }
            hashIndex = (hashIndex + 1) % n;
            if (hashIndex == startIndex) {
                break;
            }
        }
        System.out.println("Key not found: " + key);
        printArray();
    }

    boolean search(int key) {
        int hashIndex = key % n;
        int startIndex = hashIndex;
        while (arr[hashIndex] != EMPTY) {
            if (arr[hashIndex] == key) {
                System.out.println("Search key: " + key + " - Found");
                return true;
            }
            hashIndex = (hashIndex + 1) % n;
            if (hashIndex == startIndex) {
                break;
            }
        }
        System.out.println("Search key: " + key + " - Not Found");
        return false;
    }

    static void printArray() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(10);
        int keys[] = { 11, 33, 24, 23, 43, 43, 53, 65 };
        lp.add(keys);

        // Adding a key
        lp.add(12);

        // Removing a key
        lp.remove(43);

        // Searching for keys
        lp.search(33);
        lp.search(99);
    }
}
