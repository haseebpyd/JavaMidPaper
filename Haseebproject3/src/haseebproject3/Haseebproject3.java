package haseebproject3;
public class Haseebproject3 {

    public static void main(String[] args) {
        Invoice18arid2974 product1 = new Invoice18arid2974();
        product1.setNumber("abcad5456s");
        product1.setDescription("This is product description");
        product1.setPrice(78.36);
        product1.setQuantity(2);
        
        System.out.println("product number " + product1.getNumber());
        System.out.println("product description " + product1.getDescription());
        System.out.println("product price " + product1.getPrice());
        System.out.println("product quantity " + product1.getQuantity());
        System.out.println("total amount " + product1.getInvoiceAmount());
       
    }
    
}
