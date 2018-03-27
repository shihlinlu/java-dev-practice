package module_1;

/**
 * Method structure practice
 */
public class OuterSpaceMethod {
    public static void main(String[] args) {
        MarsSpaceInquiry();
        InquiryResponse();
        CounterInquiry();
    }

    public static void MarsSpaceInquiry() {
        System.out.println("Are we going to land safely on Mars?");
    }

    public static void InquiryResponse() {
        System.out.println("Depends on a variety of factors.");
    }

    public static void CounterInquiry() {
        System.out.println("Will we need SPF1000?");
    }
}
