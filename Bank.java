
interface bank {

    double getInterestRate();
}

class SBI implements bank {

    public double getInterestRate() {
        return 5.5;
    }
}

class HDFC implements bank {

    public double getInterestRate() {
        return 6.0;
    }
}

class ICICI implements bank {

    public double getInterestRate() {
        return 6.2;

    }
}

class TestBank {

    public static void main(String[] args) {
        bank sbiBank = new SBI();
        bank hdfcBank = new HDFC();
        bank iciciBank = new ICICI();
        System.out.println("SBI Rate of Interest: " + sbiBank.getInterestRate() + "%");
        System.out.println("HDFC Rate of Interest: " + hdfcBank.getInterestRate() + "%");
        System.out.println("ICICI Rate of Interest: " + iciciBank.getInterestRate() + "%");
    }
}
