import java.util.ArrayList;
import java.util.Arrays;

/**
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И
 * вывести Доску. Пример вывода доски 8x8
 * 0x000000
 * 0000x000
 * 00x00000
 */
public class task3 {

    public static void main(String[] args) {
        String[] array = { "O", "O", "O", "O", "O", "O", "O", "O" };
        int m = 0;
        for (int q = 0; q < 8; q++) {
            ArrayList<String> l1 = new ArrayList<>(Arrays.asList(array));
            l1.set(q, "x");
            for (int w = 0; w < 8; w++) {
                ArrayList<String> l2 = new ArrayList<>(Arrays.asList(array));
                if (w != q && w != q - 1 && w != q + 1) {
                    l2.set(w, "x");
                    for (int e = 0; e < 8; e++) {
                        ArrayList<String> l3 = new ArrayList<>(Arrays.asList(array));
                        if (e != w && e != w - 1 && e != w + 1 && e != q && e != q - 2 && e != q + 2) {
                            l3.set(e, "x");
                            for (int r = 0; r < 8; r++) {
                                ArrayList<String> l4 = new ArrayList<>(Arrays.asList(array));
                                if (r != e && r != e - 1 && r != e + 1 && r != q && r != w && r != q - 3 && r != q + 3
                                        && r != w - 2 && r != w + 2) {
                                    l4.set(r, "x");
                                    for (int t = 0; t < 8; t++) {
                                        if (t != r && t != r - 1 && t != r + 1 && t != q && t != w &&
                                                t != q - 4 && t != q + 4 && t != w - 3 && t != w + 3 && t != e - 2
                                                && t != e + 2 && t != e) {
                                            ArrayList<String> l5 = new ArrayList<>(Arrays.asList(array));
                                            l5.set(t, "x");
                                            for (int y = 0; y < 8; y++) {
                                                if (y != t && y != t - 1 && y != t + 1 && y != q && y != w && y != e
                                                        && y != r
                                                        && y != q - 5 && y != q + 5 && y != w - 4
                                                        && y != w + 4 && y != e - 3 && y != e + 3 && y != r - 2
                                                        && y != r + 2) {
                                                    ArrayList<String> l6 = new ArrayList<>(Arrays.asList(array));
                                                    l6.set(y, "x");
                                                    for (int u = 0; u < 8; u++) {
                                                        if (u != y && u != y - 1 && u != y + 1 && u != q && u != w
                                                                && u != e
                                                                && u != r && u != t && u != q - 6
                                                                && u != q + 6 && u != w - 5 && u != w + 5 && u != e - 4
                                                                && u != e + 4 && u != r - 3 && u != r + 3 && u != t - 2
                                                                && u != t + 2) {
                                                            ArrayList<String> l7 = new ArrayList<>(
                                                                    Arrays.asList(array));
                                                            l7.set(u, "x");
                                                            for (int i = 0; i < 8; i++) {
                                                                if (i != u && i != u - 1 && i != u + 1 && i != q
                                                                        && i != w && i != e && i != r && i != t
                                                                        && i != y
                                                                        && i != q - 7 && i != q + 7 && i != w - 6
                                                                        && i != w + 6 && i != e - 5 && i != e + 5
                                                                        && i != r - 4 && i != r + 4 && i != t - 3
                                                                        && i != t + 3 && i != y - 2 && i != y + 2) {
                                                                    ArrayList<String> l8 = new ArrayList<>(
                                                                            Arrays.asList(array));
                                                                    l8.set(i, "x");
                                                                    m = m + 1;
                                                                    System.out.println("Вариант " + m);
                                                                    System.out.println(l1.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l2.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l3.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l4.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l5.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l6.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l7.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println(l8.toString().replace("[", "")
                                                                            .replace("]", "").replace(", ", " "));
                                                                    System.out.println("_________________________");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }

                }

            }
        }
        System.out.println(
                "X - это ферзь.\n Сверху представлены варианты расстановки 8 ферзей на одном поле так, чтобы они не могли съесть друг друга");
    }
}