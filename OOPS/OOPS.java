public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.newcolor("Black");
        System.out.println(p1.color);
        System.out.print(p1.tip);
    }
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
}
