
abstract class Order {

    int id;
    String description;

    abstract void display();
}

class PurchaseOrder extends Order {

    String vendorName;

    PurchaseOrder(int id, String description, String vendorName) {
        this.id = id;
        this.description = description;
        this.vendorName = vendorName;
    }

    void display() {
        System.out.println("PO #" + id + " | " + description + " | Vendor: " + vendorName);
    }
}

class SalesOrder extends Order {

    String customerName;

    SalesOrder(int id, String description, String customerName) {
        this.id = id;
        this.description = description;
        this.customerName = customerName;
    }

    void display() {
        System.out.println("SO #" + id + " | " + description + " | Customer: " + customerName);
    }
}

class SimpleOrderSystem {

    public static void main(String[] args) {

        PurchaseOrder po1 = new PurchaseOrder(101, "Office Chairs", "IKEA");
        PurchaseOrder po2 = new PurchaseOrder(102, "Laptops", "Dell");
        PurchaseOrder po3 = new PurchaseOrder(103, "Paper Bundles", "Staples");
        PurchaseOrder po4 = new PurchaseOrder(104, "Printers", "HP");

        SalesOrder so1 = new SalesOrder(501, "Software License", "Hitesh");
        SalesOrder so2 = new SalesOrder(502, "Cloud Hosting", "Om");
        SalesOrder so3 = new SalesOrder(503, "Consulting Hours", "Rahul");
        SalesOrder so4 = new SalesOrder(504, "Website Design", "Anjali");

        System.out.println("--- Purchase Orders ---");
        po1.display();
        po2.display();
        po3.display();

        System.out.println("\n--- Sales Orders ---");
        so1.display();
        so2.display();
        so3.display();

    }
}
