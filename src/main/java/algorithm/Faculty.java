package algorithm;

import interfaces.algorithm.IFaculty;

public class Faculty implements IFaculty {
    @Override
    public int faculty(int n) {
        if (n == 1) {
            return 1;
        }

        return n * faculty(n -1);
    }
}
