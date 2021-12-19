package ChainOfResponsibility;

import lombok.val;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        val ceo = new CEO();
        val deptMgr = new DepartmentManager(ceo);
        val mgr = new Manager(deptMgr);
        val worker = new Worker(mgr);

        int[] raises = {2, 5, 10};

        Arrays.stream(raises)
                .forEach(
                        percentage -> {
                            System.out.printf("Requesting raise of %d percent.\n", percentage);
                            worker.requestRaise(percentage);
                            System.out.println();
                        });
    }
}
