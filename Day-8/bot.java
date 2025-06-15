public class bot {
    static int count = 0;
    bot() {
        System.out.println("Bot " + (count + 1) + " created. Count is: " + count++);
    }
    public static void main(String[] args) {
        bot b1 = new bot();
        bot b2 = new bot();
        bot b3 = new bot();
        bot b4 = new bot();
        bot b5 = new bot();
        System.out.println("Total bots created: " + count);
    }
}
