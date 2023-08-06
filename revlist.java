  
import java.util.Iterator;

public class revlist {
    public static void main(String[] args) {
        SingleLinkList<Tabel> tabeltList = new SingleLinkList<>();

        tabeltList.addToEnd(new Tabel(120, "География", 9));
        tabeltList.addToEnd(new Tabel(150, "Биология", 9));
        tabeltList.addToEnd(new Tabel(330, "Химия", 9));
        tabeltList.addToEnd(new Tabel(430, "Физика", 9));
        tabeltList.addToEnd(new Tabel(550, "Математика", 9));

        for(Tabel tabel: tabeltList) {
            System.out.println(tabel);
        }

        tabeltList.reverse();

        System.out.println("------------------------");

        for(Tabel tabel: tabeltList) {
            System.out.println(tabel);
        }
    }

    static class Tabel {
        int id;
        String subject;
        int mark;

        public Tabel(int id, String subject, int mark) {
            this.id = id;
            this.subject = subject;
            this.mark = mark;
        }

        public String toString() {
            return "Tabel{" +
                    "id=" + id +
                    ", предмет='" + subject + '\'' +
                    ", оценка='" + mark + '\'' +
                    '}';
        }
    }

    public static class SingleLinkList<T> implements Iterable<T> {

        ListItem<T> head;
        ListItem<T> tail;

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;

                public boolean hasNext() {
                    return current != null;
                }

                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }

        private static class ListItem<T> {
            T data;
            ListItem<T> next;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void addToEnd(T item) {
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;
            if (isEmpty()) {
                head = newItem;
                tail = newItem;
            } else {
                tail.next = newItem;
                tail = newItem;
            }
        }

        public void reverse() {
            if (!isEmpty() && head.next != null) {
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current != null) {
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }
        }
    }
}

 

