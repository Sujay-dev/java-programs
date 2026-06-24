package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Payment{
    private String txnId;
    private double amount;
    private String status;
    private long createdAt;

    Payment(String txnId,double amount,String status,long createdAt){
        this.txnId=txnId;
        this.amount=amount;
        this.status=status;
        this.createdAt=createdAt;
    }
    public String getTxnId(){
        return txnId;
    }
    public double getAmount(){
        return amount;
    }
    public String getStatus(){
        return status;
    }
    public long getCredAt(){
        return createdAt;
    }
}
public class PaymentTransactions {
    public static void main(String[] args) {
        List<Payment> list=new ArrayList<>();

        Payment p1=new Payment("TXN9ijhrdf", 2000, "Processing !", 22-06-2026);
        Payment p2=new Payment("TXN4rgfdfg", 4000, "Done !", 12-06-2026);
        Payment p3=new Payment("TXN2wdfgfg", 9000, "Done !", 2-06-2026);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.sort(Comparator.comparing(Payment :: getAmount).reversed().thenComparing(Comparator.comparing(Payment :: getStatus)).thenComparing(Comparator.comparing(Payment :: getCredAt).reversed()));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getAmount() + " " + list.get(i).getCredAt() + " " + list.get(i).getStatus() + " " + list.get(i).getTxnId());
        }
    }
}
