public class Main {
    public static void main(String[] args) {
        Container cc = new ChannelContainer(new String[]{"Channel 1", "Channel 2"});
        Iterator it = cc.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
