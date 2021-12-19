package Strategy;

import lombok.val;

import java.util.List;

public abstract class Printers {
    public static void print(ListConverter converter, List items) {
        System.out.println(converter.listToString(items));
    }

    public static class Every implements ListConverter {

        @Override
        public String listToString(List list) {
            val str = new StringBuilder();

            for (val item : list) { // Equivalent to while (list.iterator().hasNext()) {}
                str.append(item);
                str.append("\n");
            }

            return str.toString();
        }
    }

    public static class EveryOther implements ListConverter {

        @Override
        public String listToString(List list) {
            val str = new StringBuilder();
            val arr = list.toArray();

            for (int i = 0; i < arr.length; i++) {
                val item = arr[i];
                str.append(item);

                if (i % 2 == 1) {
                    str.append("\n");
                }
            }

            return str.toString();
        }
    }

    public static class EveryThird implements ListConverter {

        @Override
        public String listToString(List list) {
            val str = new StringBuilder();

            for (int i = 0; i < list.size(); i++) {
                val item = list.get(i);
                str.append(item);

                if (i % 3 == 2) {
                    str.append("\n");
                }
            }

            return str.toString();
        }
    }
}
