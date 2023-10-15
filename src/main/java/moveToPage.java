public class moveToPage extends baseTest {
    public void navigate(String url) {
        System.out.println("Moving to page");
        try {
            driver.get(url);
        }catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("Couldn't move to page");
        }
        System.out.println("Page navigation successfull");
    }
}
