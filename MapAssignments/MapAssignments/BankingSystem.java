import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        // 1. Add customers
        accounts.put("ACC1001", 15000.0);
        accounts.put("ACC1002", 25000.0);
        accounts.put("ACC1003", 5000.0);
        accounts.put("ACC1004", 75000.0);
        accounts.put("ACC1005", 32000.0);

        // 2. Deposit & withdrawal
        deposit(accounts, "ACC1001", 5000);
        withdraw(accounts, "ACC1003", 6000); // should fail
        withdraw(accounts, "ACC1003", 4000); // ok

        // 3. Print all customers sorted by descending balance
        List<Map.Entry<String,Double>> list = new ArrayList<>(accounts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Double>>() {
            public int compare(Map.Entry<String,Double> a, Map.Entry<String,Double> b) {
                return Double.compare(b.getValue(), a.getValue());
            }
        });

        System.out.println("\nCustomers by descending balance:");
        for (Map.Entry<String,Double> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 4. Top 3 customers
        System.out.println("\nTop 3 customers:");
        for (int i=0;i<Math.min(3,list.size());i++) {
            System.out.println((i+1) + ". " + list.get(i).getKey() + " -> " + list.get(i).getValue());
        }
    }

    static void deposit(Map<String, Double> accounts, String acc, double amt) {
        if (!accounts.containsKey(acc)) {
            System.out.println("Account not found: " + acc);
            return;
        }
        accounts.put(acc, accounts.get(acc) + amt);
        System.out.println("Deposited " + amt + " to " + acc);
    }

    static void withdraw(Map<String, Double> accounts, String acc, double amt) {
        if (!accounts.containsKey(acc)) {
            System.out.println("Account not found: " + acc);
            return;
        }
        double bal = accounts.get(acc);
        if (amt > bal) {
            System.out.println("Insufficient funds for " + acc);
        } else {
            accounts.put(acc, bal - amt);
            System.out.println("Withdrew " + amt + " from " + acc);
        }
    }
}
