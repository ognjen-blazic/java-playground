import interfaces.IFacultyAlgorithm;

public class FacultyAlgorithm implements IFacultyAlgorithm {
    @Override
    public int faculty(int n) {
        if (n == 1) {
            return 1;
        }

        return n * faculty(n -1);
    }
}
