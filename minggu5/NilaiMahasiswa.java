package minggu5;

public class NilaiMahasiswa {

    public static int maxUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }

        int mid = (left + right) / 2;

        int maxLeft = maxUTS(uts, left, mid);
        int maxRight = maxUTS(uts, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static int minUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }

        int mid = (left + right) / 2;

        int minLeft = minUTS(uts, left, mid);
        int minRight = minUTS(uts, mid + 1, right);

        return Math.min(minLeft, minRight);
    }

    public static double rataUAS(int[] uas) {
        int total = 0;

        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }

        return (double) total / uas.length;
    }
}