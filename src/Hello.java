public class Hello {
    public static void main(String[] args) {
        int size=10000000;
        System.out.println(String.format("Size:%d",size));
        while(size-->0){
            System.out.println(size);
        }
    }
}
