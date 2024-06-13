import java.util.LinkedList;

public class Chaining {
    LinkedList<Integer>[] chain;

    @SuppressWarnings("unchecked")
    Chaining() {
        chain = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            chain[i] = new LinkedList<>();
        }
    }

    void add(int keys[]) {
        for (int i : keys) {
            chain[i % 10].add(i);
        }
      
    }

    void add(int key) {
        chain[key % 10].add(key);
        System.out.println("Added key: " + key);
       
    }

    void remove(int key) {
        int hashIndex = key % 10;
        if (chain[hashIndex].remove((Integer) key)) {
            System.out.println("Removed key: " + key);
        } else {
            System.out.println("Key not found: " + key);
        }
       
    }

    boolean search(int key) {
        int hashIndex = key % 10;
        boolean found = chain[hashIndex].contains(key);
        System.out.println("Search key: " + key + " - " + (found ? "Found" : "Not Found"));
        return found;
    }

    void printChains() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Index " + i + ": " + chain[i].toString());
        }
    }

    public static void main(String[] args) {
        Chaining chaining = new Chaining();
        int arr[] = { 11, 33, 61, 34, 66, 98, 67, 27, 20, 23 };
        chaining.add(arr);

        // Adding a key
        chaining.add(45);

        // Removing a key
        chaining.remove(34);

        // Searching for keys
        chaining.search(67);
        chaining.search(99);
    }
}
