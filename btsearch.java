public class btsearch {

    public static void main(String[] args) {

        String heapfile = null;
        String indexfile = null;
        String range1 = null;
        String range2 = null;
        long startTime = System.currentTimeMillis();

        try {
            heapfile = args[0];
            indexfile = args[1];
            range1 = args[2];
            range2 = args[3];   
        } catch (Exception e) {
            System.out.println("Error! Ex:java btsearch -p <heapfile> <index> <range1> <range2>");
            System.exit(0);
        }
        btsearch_method(heapfile, indexfile, range1, range2);
        long endTime = System.currentTimeMillis();
        long timeInMilliseconds = endTime - startTime;
        System.out.println("Time taken to load data (milliseconds): " + timeInMilliseconds);
        System.out.println("Time taken to load data (seconds): " + (timeInMilliseconds / 1000));
    }

    public static void btsearch_method(String heapfile, String indexfile, String range1, String range2) {
        System.out.println(heapfile);
        System.out.println(indexfile);
        System.out.println(range1);
        System.out.println(range2);
    }
}