public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.newcolor("Black");
        System.out.println(p1.color);
        System.out.println(p1.tip);
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Ankush";
//      myAcc.passwd = "9334af"; // This is not possible as it is private. To access this you need to set up Getters and Setters
        myAcc.changepasswd("9334af");
        System.out.print(p1.getcolor());
    }
}

class BankAccount {
    public String name;
    private String passwd;
    void changepasswd(String passwd) {                  // This is a Setter
        this.passwd = passwd;                // this is used to access the object
    }                                         // We havent made a getter for this which means we cannot access its value outside this class
}

class Pen {
    String color;
    int tip;
    void newcolor(String setcolor) {                   // This is a Setter
        color = setcolor;
    }
    void newtip(int settip) {                          // This is also a Setter
        tip = settip;
    }
    String getcolor() {
        return this.color;
    }
}
