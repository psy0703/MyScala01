/**
 * 快速排序 时间平均 O(NlogN) 最坏O( N^2 ) 空间平均O(logN)和 最坏O(N)
 * 不稳定
 */
public class QuickRem {
    public static void main(String[] args) {
        int[] data = {9, -16, 21, 23, -30, -49, 21, 30, 30};

        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }

    private static void quickSort(int[] data) {
        if (data.length != 0) {
            subSort(data, 0, data.length - 1);
        }
    }

    public static void subSort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        subSort(a, low, i - 1); // 对低子表进行递归排序
        subSort(a, i + 1, hight); // 对高子表进行递归排序
    }
}
