package parameterconstructor;
class Test {
    int i, j;
    Test(int x, int y) {
        System.out.println("Parameterized Constructor called");
        i = x;
        j = y;
    }
    void add() {
        System.out.println(i + j);
    }
}
public class ParameterConstructor {
    public static void main(String[] args) {
        Test t1 = new Test(100, 200);
        Test t2 = new Test(300, 400);
        Test t3 = new Test(500, 600);
        t1.add();
        t2.add();
        t3.add();
    }
}
