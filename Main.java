public class Main {
    public static void main(String[] args) {
        int[] a = {-1, -1, -1, -1, -1};
        for (int i = 1; i < a.length-1;) {
           // a[i] = i++;
            a[i] = ++i + 10;
           // a[i--] = i;
           // a[--i] = i;
        }
    for (int i = 0; i < a.length; i = i +1) {
        System.out.print(a[i] + " ");
    }
    System.out.println("n/");
    }
}

