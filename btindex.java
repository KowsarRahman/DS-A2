public class btindex {

    long startTime;

    public static void main(String[] args) {

        int pageSize = 0;
        String heapfile = null;
        long startTime = System.currentTimeMillis();

        try {
            pageSize = Integer.parseInt(args[1]);
            heapfile = args[2];   
        } catch (Exception e) {
            System.out.println("Error! Ex:java btindex -p <pagesize> <heapfile>");
            System.exit(0);
        }
        btindex_method(pageSize, heapfile);
        long endTime = System.currentTimeMillis();
        long timeInMilliseconds = endTime - startTime;
        System.out.println("Time taken to load data (milliseconds): " + timeInMilliseconds);
        System.out.println("Time taken to load data (seconds): " + (timeInMilliseconds / 1000));
    }

    public static void btindex_method(int pageSize, String heapfile) {
        System.out.println(pageSize);
        System.out.println(heapfile);
    }
}