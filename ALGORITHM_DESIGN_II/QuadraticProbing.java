public class QuadraticProbing {
    static int arr[];
    static int n;
    static final int EMPTY = -999;

    @SuppressWarnings("static-access")
    QuadraticProbing(int n) {
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
        int j = 1;
        int originalIndex = hashIndex;
        while (arr[(hashIndex + j * j) % n] != EMPTY) {
            hashIndex = (originalIndex + j * j) % n;
            j++;
            if (j == n) {
                System.out.println("Hash table is full, couldn't insert key: " + key);
                return;
            }
        }
        arr[(hashIndex + j * j) % n] = key;
    }

    void remove(int key) {
        int hashIndex = key % n;
        int j = 0;
        while (arr[(hashIndex + j * j) % n] != EMPTY) {
            if (arr[(hashIndex + j * j) % n] == key) {
                arr[(hashIndex + j * j) % n] = EMPTY;
                System.out.println("Removed key: " + key);
                printArray();
                return;
            }
            j++;
            if (j == n) {
                break;
            }
        }
        System.out.println("Key not found: " + key);
        printArray();
    }

    boolean search(int key) {
        int hashIndex = key % n;
        int j = 0;
        while (arr[(hashIndex + j * j) % n] != EMPTY) {
            if (arr[(hashIndex + j * j) % n] == key) {
                System.out.println("Search key: " + key + " - Found");
                return true;
            }
            j++;
            if (j == n) {
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
        QuadraticProbing qp = new QuadraticProbing(10);
        int keys[] = { 11, 33, 24, 23 };
        qp.add(keys);

        // Adding a key
        qp.add(12);

        // Removing a key
        qp.remove(33);

        // Searching for keys
        qp.search(24);
        qp.search(99);
    }
}
