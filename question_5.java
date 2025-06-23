public class question_5 {
    public static void main(String[] args) {
        int fee=12500;
        int discountPercent=10;
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR "+ finalFee);

    }
}
