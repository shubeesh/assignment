public class Main {
    public static void main(String[] args) {
        ResizableArray<String> resizableArray = new ResizableArray<>();

        resizableArray.add("Hello");
        resizableArray.add("World");
        resizableArray.add("Java");

        System.out.println(resizableArray.get(0));

        resizableArray.remove(1);
        System.out.println(resizableArray.get(1));

        System.out.println("Size: " + resizableArray.size());
        resizableArray.sort();
    }
}