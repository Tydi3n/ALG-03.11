import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arralmostsorted = new int[0];
        int[] arrWithRepetitions = new int[0];
        int[] arrreversed = new int[0];
        arralmostsorted = new int[10000];
        for (int j = 0; j < 9000; j++) {
            arralmostsorted[j] = j;
        }
        for (int j = 9000; j < 10000; j++) {
            arralmostsorted[j] = (int) (Math.random() * 10000);
        }

        arrWithRepetitions = new int[10000];
        for (int j = 0; j < 10000; j++) {
            arrWithRepetitions[j] = (int) (Math.random() * 20);
        }
        arrreversed = new int[10000];
        for (int j = 0; j < 10000; j++) {
            arrreversed[j] = 10000 - j;
        }

        int []arralmostsortedQuicksort = arralmostsorted.clone();
        int []arrWithRepetitionsQuicksort = arrWithRepetitions.clone();
        int []arrreversedQuicksort = arrreversed.clone();

        int []arralmostsortedheap = arralmostsorted.clone();
        int []arrWithRepetitionsheap = arrWithRepetitions.clone();
        int []arrreversedheap = arrreversed.clone();


        System.out.println("almost sorted" + Arrays.toString(arralmostsorted));

        System.out.println("with repetitions" + Arrays.toString(arrWithRepetitionsQuicksort));
        System.out.println("reversed " + Arrays.toString(arrreversedQuicksort) + "\n");

        long startTime = System.nanoTime();
        quicksort.quicksort(arralmostsortedQuicksort, 0, arralmostsortedQuicksort.length - 1);
        System.out.println("quicksort prawie posortowane" + Arrays.toString(arralmostsortedQuicksort));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("czas " + executionTime);

        startTime = System.nanoTime();
        quicksort.quicksort(arrWithRepetitionsQuicksort, 0, arrWithRepetitionsQuicksort.length - 1);
        System.out.println("quicksort z powtorzeniami" + Arrays.toString(arrWithRepetitionsQuicksort));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("czas " + executionTime);

        startTime = System.nanoTime();
        quicksort.quicksort(arrreversedQuicksort, 0, arrreversedQuicksort.length - 1);
        System.out.println("quicksort odwrotnie posortowane" + Arrays.toString(arrreversedQuicksort));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("czas " + executionTime);

        startTime = System.nanoTime();
        HeapSort hp = new HeapSort();
        hp.sort(arralmostsortedheap);
        System.out.println("heapsortalmostsorted" + Arrays.toString(arralmostsortedheap));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("czas " + executionTime);

        startTime = System.nanoTime();
        HeapSort hp2 = new HeapSort();
        hp2.sort(arrWithRepetitionsheap);
        System.out.println("heapsortwithrepetitions" + Arrays.toString(arrWithRepetitionsheap));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("czas " + executionTime);

        startTime = System.nanoTime();
        HeapSort hp3 = new HeapSort();
        hp3.sort(arrreversedheap);
        System.out.println("heapsortreversed" + Arrays.toString(arrreversedheap));
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("czas " + executionTime);
    }
}



/*prawie posortowane, dane z wieloma powtorzeniami, dane odwrotnie posortowane*/