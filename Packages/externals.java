package SEE;

import CIE.*;
import java.util.*;

public class externals extends students {
    public int sums = 0;
    Scanner sc = new Scanner(System.in);
    public int seem[] = new int[5];

    public void get_marks() {
        System.out.println("ENTER SEE MARKS OF STUDENTS:");
        for (int i = 0; i < 5; i++) {
            System.out.println("SUBJECT" + (i + 1));
            seem[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sums = sums + seem[i];
        }
    }
}
