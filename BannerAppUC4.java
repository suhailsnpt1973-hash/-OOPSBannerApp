public class BannerAppUC4 {

    public static void main(String[] args) {

        // Step 1: Store banner lines in a String array
        String[] banner = {
                "************************************",
                "*                                  *",
                "*        WELCOME TO OOPS APP       *",
                "*                                  *",
                "************************************"
        };

        // Step 2: Use enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}