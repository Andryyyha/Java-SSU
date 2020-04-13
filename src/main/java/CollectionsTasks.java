import java.util.*;

public class CollectionsTasks<T> {

    public ArrayList<Integer> reverseSort(ArrayList<Integer> a) {
        Collections.sort(a, Collections.<Integer>reverseOrder());
        return a;
    }

    public long sumOfElements(ArrayList<Integer> a) {
        long sum = 0;
        for (int i: a) {
            sum += i;
        }
        return sum;
    }

    public boolean mapContainsValue(Map<T, T> m, T value) {
        return m.containsValue(value);
    }

    public void pushForward(LinkedList<T> l, T value) {
        l.addFirst(value);
    }

    public void pushBack(LinkedList<T> l, T value) {
        l.addLast(value);
    }

    public T findElement(ArrayList<T> a, T value) {
        return a.get(a.indexOf(value));
    }

    public HashMap<T, T> sortHashMap(HashMap<T, T> hashMap) {
        ArrayList<T> keys = new ArrayList<T>(hashMap.keySet());
        ArrayList<T> values = new ArrayList<T>(hashMap.values());
        HashMap<T, T> sorted = new HashMap<T, T>();

        Iterator<T> valueIterator = values.iterator();
        while (valueIterator.hasNext()) {
            T val = valueIterator.next();
            Iterator<T> keyIterator = keys.iterator();
            while (keyIterator.hasNext()) {
                T key = keyIterator.next();
                T valFromMap = hashMap.get(key);

                if (val.equals(valFromMap)) {
                    keyIterator.remove();
                    sorted.put(key, val);
                    break;
                }
            }
        }
        return sorted;
    }
}
