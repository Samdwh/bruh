import java.util.Random;

public class three {
    public static void main(String args[]) {
        Random random = new Random();
        int size = 15;
        long[] randomTimesMonday = new long[size];
        long[] randomTimesTuesday = new long[size];
        long[] randomTimesWednesday = new long[size];
        long[] randomTimesThursday = new long[size];
        long[] randomTimesFriday = new long[size];
        long[] randomTimesSaturday = new long[size];
        long[] randomTimesSunday = new long[size];
        long[] sortedTimesMonday = new long[size];
        long[] sortedTimesTuesday = new long[size];
        long[] sortedTimesWednesday = new long[size];
        long[] sortedTimesThursday = new long[size];
        long[] sortedTimesFriday = new long[size];
        long[] sortedTimesSaturday = new long[size];
        long[] sortedTimesSunday = new long[size];
        long[] reverseTimesMonday = new long[size];
        long[] reverseTimesTuesday = new long[size];
        long[] reverseTimesWednesday = new long[size];
        long[] reverseTimesThursday = new long[size];
        long[] reverseTimesFriday = new long[size];
        long[] reverseTimesSaturday = new long[size];
        long[] reverseTimesSunday = new long[size];

        for (int v = 0; v < size; v++) {
            int[] monday = new int[1000];
            int[] tuesday = new int[5000];
            int[] wednesday = new int[10000];
            int[] thursday = new int[50000];
            int[] friday = new int[75000];
            int[] saturday = new int[100000];
            int[] sunday = new int[500000];
            for (int i = 0; i < 1000; i++) {
                monday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            for (int i = 0; i < 5000; i++) {
                tuesday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            for (int i = 0; i < 10000; i++) {
                wednesday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            for (int i = 0; i < 50000; i++) {
                thursday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            for (int i = 0; i < 75000; i++) {
                friday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            for (int i = 0; i < 100000; i++) {
                saturday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            for (int i = 0; i < 500000; i++) {
                sunday[i] = random.nextInt(500000 - 1000) + 1000;
            }
            
            long time = System.currentTimeMillis();
            hybridsort(monday);
            long time2 = System.currentTimeMillis();
            randomTimesMonday[v] = time2 - time;
            

            time = System.currentTimeMillis();
            hybridsort(tuesday);
            time2 = System.currentTimeMillis();
            randomTimesTuesday[v] = time2 - time;

            
            time = System.currentTimeMillis();
            hybridsort(wednesday);
            time2 = System.currentTimeMillis();
            randomTimesWednesday[v] = time2 - time;

            
            time = System.currentTimeMillis();
            hybridsort(thursday);
            time2 = System.currentTimeMillis();
            randomTimesThursday[v] = time2 - time;

            
            time = System.currentTimeMillis();
            hybridsort(friday);
            time2 = System.currentTimeMillis();
            randomTimesFriday[v] = time2 - time;

            
            time = System.currentTimeMillis();
            hybridsort(saturday);
            time2 = System.currentTimeMillis();
            randomTimesSaturday[v] = time2 - time;

            
            time = System.currentTimeMillis();
            hybridsort(sunday);
            time2 = System.currentTimeMillis();
            randomTimesSunday[v] = time2 - time;

        }
        // RANDOM TIMES
        System.err.println("--RANDOM TIMES--");
        long mondayTotal = 0;
        for (long time : randomTimesMonday) {
            mondayTotal += time;
        }
        mondayTotal /= size;
        System.out.println("Average random time for Monday: " + mondayTotal + " ms");

        long tuesdayTotal = 0;
        for (long time : randomTimesTuesday) {
            tuesdayTotal += time;
        }
        tuesdayTotal /= size;
        System.out.println("Average random time for Tuesday: " + tuesdayTotal + " ms");

        long wednesdayTotal = 0;
        for (long time : randomTimesWednesday) {
            wednesdayTotal += time;
        }
        wednesdayTotal /= size;
        System.out.println("Average random time for Wednesday: " + wednesdayTotal + " ms");

        long thursdayTotal = 0;
        for (long time : randomTimesThursday) {
            thursdayTotal += time;
        }
        thursdayTotal /= size;
        System.out.println("Average random time for Thursday: " + thursdayTotal + " ms");

        long fridayTotal = 0;
        for (long time : randomTimesFriday) {
            fridayTotal += time;
        }
        fridayTotal /= size;
        System.out.println("Average random time for Friday: " + fridayTotal + " ms");

        long saturdayTotal = 0;
        for (long time : randomTimesSaturday) {
            saturdayTotal += time;
        }
        saturdayTotal /= size;
        System.out.println("Average random time for Saturday: " + saturdayTotal + " ms");

        long sundayTotal = 0;
        for (long time : randomTimesSunday) {
            sundayTotal += time;
        }
        sundayTotal /= size;
        System.out.println("Average random time for Sunday: " + sundayTotal + " ms");

        for (int v = 0; v < size; v++) {
            int[] monday = new int[1000];
            int[] tuesday = new int[5000];
            int[] wednesday = new int[10000];
            int[] thursday = new int[50000];
            int[] friday = new int[75000];
            int[] saturday = new int[100000];
            int[] sunday = new int[500000];
            for (int i = 0; i < 1000; i++) {
                monday[i] = i;
            }
            for (int i = 0; i < 5000; i++) {
                tuesday[i] = i;
            }
            for (int i = 0; i < 10000; i++) {
                wednesday[i] = i;
            }
            for (int i = 0; i < 50000; i++) {
                thursday[i] = i;
            }
            for (int i = 0; i < 75000; i++) {
                friday[i] = i;
            }
            for (int i = 0; i < 100000; i++) {
                saturday[i] = i;
            }
            for (int i = 0; i < 500000; i++) {
                sunday[i] = i;
            }
            long time = System.currentTimeMillis();


            time = System.currentTimeMillis();
            hybridsort(monday);
            long time2 = System.currentTimeMillis();
            sortedTimesMonday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(tuesday);
            time2 = System.currentTimeMillis();
            sortedTimesTuesday[v] = time2 - time;
  
            time = System.currentTimeMillis();
            hybridsort(wednesday);
            time2 = System.currentTimeMillis();
            sortedTimesWednesday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(thursday);
            time2 = System.currentTimeMillis();
            sortedTimesThursday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(friday);
            time2 = System.currentTimeMillis();
            sortedTimesFriday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(saturday);
            time2 = System.currentTimeMillis();
            sortedTimesSaturday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(sunday);
            time2 = System.currentTimeMillis();
            sortedTimesSunday[v] = time2 - time;

        }

        // SORTED TIMES
        System.err.println("--SORTED TIMES--");
        long sortedMondayTotal = 0;
        for (long time : sortedTimesMonday) {
            sortedMondayTotal += time;
        }
        sortedMondayTotal /= size;
        System.out.println("Average sorted time for Monday: " + sortedMondayTotal + " ms");

        long sortedTuesdayTotal = 0;
        for (long time : sortedTimesTuesday) {
            sortedTuesdayTotal += time;
        }
        sortedTuesdayTotal /= size;
        System.out.println("Average sorted time for Tuesday: " + sortedTuesdayTotal + " ms");

        long sortedWednesdayTotal = 0;
        for (long time : sortedTimesWednesday) {
            sortedWednesdayTotal += time;
        }
        sortedWednesdayTotal /= size;
        System.out.println("Average sorted time for Wednesday: " + sortedWednesdayTotal + " ms");

        long sortedThursdayTotal = 0;
        for (long time : sortedTimesThursday) {
            sortedThursdayTotal += time;
        }
        sortedThursdayTotal /= size;
        System.out.println("Average sorted time for Thursday: " + sortedThursdayTotal + " ms");

        long sortedFridayTotal = 0;
        for (long time : sortedTimesFriday) {
            sortedFridayTotal += time;
        }
        sortedFridayTotal /= size;
        System.out.println("Average sorted time for Friday: " + sortedFridayTotal + " ms");

        long sortedSaturdayTotal = 0;
        for (long time : sortedTimesSaturday) {
            sortedSaturdayTotal += time;
        }
        sortedSaturdayTotal /= size;
        System.out.println("Average sorted time for Saturday: " + sortedSaturdayTotal + " ms");

        long sortedSundayTotal = 0;
        for (long time : sortedTimesSunday) {
            sortedSundayTotal += time;
        }
        sortedSundayTotal /= size;
        System.out.println("Average sorted time for Sunday: " + sortedSundayTotal + " ms");
        for (int v = 0; v < size; v++) {
            int[] monday = new int[1000];
            int[] tuesday = new int[5000];
            int[] wednesday = new int[10000];
            int[] thursday = new int[50000];
            int[] friday = new int[75000];
            int[] saturday = new int[100000];
            int[] sunday = new int[500000];
            for (int i = 0; i < 1000; i++) {
                monday[i] = 1000 - i;
            }
            for (int i = 0; i < 5000; i++) {
                tuesday[i] = 5000 - i;
            }
            for (int i = 0; i < 10000; i++) {
                wednesday[i] = 10000 - i;
            }
            for (int i = 0; i < 50000; i++) {
                thursday[i] = 50000 - i;
            }
            for (int i = 0; i < 75000; i++) {
                friday[i] = 75000 - i;
            }
            for (int i = 0; i < 100000; i++) {
                saturday[i] = 100000 - i;
            }
            for (int i = 0; i < 500000; i++) {
                sunday[i] = 500000 - i;
            }
         
            long time = System.currentTimeMillis();

            time = System.currentTimeMillis();
            hybridsort(monday);
            long time2 = System.currentTimeMillis();
            reverseTimesMonday[v] = time2 - time;

           

            time = System.currentTimeMillis();
            hybridsort(tuesday);
            time2 = System.currentTimeMillis();
            reverseTimesTuesday[v] = time2 - time;

           

            time = System.currentTimeMillis();
            hybridsort(wednesday);
            time2 = System.currentTimeMillis();
            reverseTimesWednesday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(thursday);
            time2 = System.currentTimeMillis();
            reverseTimesThursday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(friday);
            time2 = System.currentTimeMillis();
            reverseTimesFriday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(saturday);
            time2 = System.currentTimeMillis();
            reverseTimesSaturday[v] = time2 - time;

            time = System.currentTimeMillis();
            hybridsort(sunday);
            time2 = System.currentTimeMillis();
            reverseTimesSunday[v] = time2 - time;

        }

        System.err.println("--REVERSE TIMES--");
        long reverseMondayTotal = 0;
        for (long time : reverseTimesMonday) {
            reverseMondayTotal += time;
        }
        reverseMondayTotal /= size;
        System.out.println("Average reverse time for Monday: " + reverseMondayTotal + " ms");

        long reverseTuesdayTotal = 0;
        for (long time : reverseTimesTuesday) {
            reverseTuesdayTotal += time;
        }
        reverseTuesdayTotal /= size;
        System.out.println("Average reverse time for Tuesday: " + reverseTuesdayTotal + " ms");

        long reverseWednesdayTotal = 0;
        for (long time : reverseTimesWednesday) {
            reverseWednesdayTotal += time;
        }
        reverseWednesdayTotal /= size;
        System.out.println("Average reverse time for Wednesday: " + reverseWednesdayTotal + " ms");

        long reverseThursdayTotal = 0;
        for (long time : reverseTimesThursday) {
            reverseThursdayTotal += time;
        }
        reverseThursdayTotal /= size;
        System.out.println("Average reverse time for Thursday: " + reverseThursdayTotal + " ms");

        long reverseFridayTotal = 0;
        for (long time : reverseTimesFriday) {
            reverseFridayTotal += time;
        }
        reverseFridayTotal /= size;
        System.out.println("Average reverse time for Friday: " + reverseFridayTotal + " ms");

        long reverseSaturdayTotal = 0;
        for (long time : reverseTimesSaturday) {
            reverseSaturdayTotal += time;
        }
        reverseSaturdayTotal /= size;
        System.out.println("Average reverse time for Saturday: " + reverseSaturdayTotal + " ms");

        long reverseSundayTotal = 0;
        for (long time : reverseTimesSunday) {
            reverseSundayTotal += time;
        }
        reverseSundayTotal /= size;
        System.out.println("Average reverse time for Sunday: " + reverseSundayTotal + " ms");

        /*
         * for (int i = 0; i < monday.length; i++){
         * System.out.println(monday[i]);
         * 
         * }
         */
    }

    public static void hybridsort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
        selection(arr);
    }

    public static void quicksort(int[] arr, int first, int last) {
        Random random = new Random(); 
        if (last - first < 32) {
            return;
        }
        if (first < last) { 
            int pivotIndex = first + random.nextInt(last - first + 1);
            int pivot = arr[pivotIndex]; 
            int starter = first - 1;

            for (int x = first; x < last; x++) {
                if (arr[x] < pivot) {
                    starter++;
                    int temp = arr[starter];
                    arr[starter] = arr[x];
                    arr[x] = temp;
                }
            }

            int temp = arr[starter + 1];
            arr[starter + 1] = arr[last];
            arr[last] = temp;

            if (last - first > (arr.length * 0.1)) { 
                quicksort(arr, first, starter); 
                quicksort(arr, starter + 2, last);
            } else {
            }

            return;
        } else {
            return;
        }
    }

    public static void bubblesort(int[] arr) {
        System.out.println("BUBBLE SORT CALLED " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            boolean change = false;
            for (int y = 0; y < arr.length - i - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y + 1];
                    arr[y + 1] = arr[y];
                    arr[y] = temp;
                    change = true;
                }
            }
            if (change == false) {
                break;
            }

        }
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean changed = false;
            for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }
    }

}