public class BannerAppUC5 {

    public static void main(String[] args) {

        String message = "WELCOME";

        String[] banner = {
                String.join("", "*******"),
                String.join("", "*     *"),
                String.join("", "*  ", message, "  *"),
                String.join("", "*     *"),
                String.join("", "*******"),
                String.join("", " "),
                String.join("", "Have a Great Day!")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}