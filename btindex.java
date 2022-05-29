public class btindex {

    public static void main(String[] args) {

        int pageSize = 0;
        String heapfile = null;

        try {
            pageSize = Integer.parseInt(args[1]);
            heapfile = args[2];   
        } catch (Exception e) {
            System.out.println("Error! Ex:java btindex -p <pagesize> <heapfile>");
            System.exit(0);
        }
        btindex_method(pageSize, heapfile);
    }

    public static void btindex_method(int pageSize, String heapfile) {
        System.out.println(pageSize);
        System.out.println(heapfile);
    }
}