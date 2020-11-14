package bit_manipulation;

public class BitTricksExamples {
    public static void main(String[] args) {
        //x & (x-1) - will clear the lowest set bit of x
        // �������� ���������� ��������� ��� � ����� x

        // x & ~(x-1) - extracts the lowest set bit of x (all others are clear). Pretty patterns when applied to a linear sequence.
        // ���������� - �� �����!
        int x = 6;
        System.out.println("x = " + x + ": x & ~(x-1) = " + (x & ~(x-1)));

        //x & (x + (1 << n)) = x, with the run of set bits (possibly length 0) starting at bit n cleared.
        // ���������� - �� �����!
        x = 11;
        int n = 1;
        System.out.println("n = " + n + ": (1 << n) = " + (1 << n));
        System.out.println("n = " + n + ", x = " + x + ": (x + (1 << n)) = " + (x + (1 << n)));
        System.out.println("n = " + n + ", x = " + x + ": (x & (x + (1 << n))) = " + (x & (x + (1 << n))));

        //x | (x + 1) = x with the lowest cleared bit set.
        // �� �����! lowest ��� ������ ����� 1. ������ cleared??


    }
}
