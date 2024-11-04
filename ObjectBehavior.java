public interface ObjectBehavior {
    void performanceAction();
    void haltAction();
    int getAttribute();
    String getType();
}


class Type1 implements ObjectBehavior{
    private final int attribute = 100;
    private String detail1 = "detail1";

    @Override
    public void performanceAction() {
        System.out.println("type one is performing the action");
    }
    @Override
    public void haltAction() {
        System.out.println("type one is stoppped the action");
    }
    @Override
    public int getAttribute() {
        return 0;
    }
    @Override
    public String getType() {
        return null;
    }
    public String getDetail1() {
        return detail1;
    }
}

class Type2 implements ObjectBehavior{
    private final int attribute = 200;
    private String detail2 = "detail2";
    @Override
    public void performanceAction() {
    }
    @Override
    public void haltAction() {
    }
    @Override
    public int getAttribute() {
        return 0;
    }
    @Override
    public String getType() {
        return null;
    }
    public String getDetail2() {
        return detail2;
    }
}


class Type3 implements ObjectBehavior{
    private final int attribute = 300;
    private String detail3 = "detail3";
    @Override
    public void performanceAction() {
    }
    @Override
    public void haltAction() {
    }
    @Override
    public int getAttribute() {
        return 0;
    }
    @Override
    public String getType() {
        return null;
    }
    public String getDetail3() {
        return detail3;
    }
}


class main2 {
    public static void main(String[] args) {
        ObjectBehavior[] objects ={new Type1(), new Type2(),new Type3()};

        for (ObjectBehavior obj: objects){
            obj.performanceAction();
            System.out.println("object's type: "+ obj.getType());
            System.out.println("object's attribute: "+ obj.getAttribute());
            obj.haltAction();

            if (obj instanceof Type1){
                System.out.println("deail1 is : " +((Type1) obj).getDetail1());
            } else if (obj instanceof Type2) {
                System.out.println("detail2 is: "+((Type2)obj).getDetail2());
            } else if (obj instanceof Type3) {
                System.out.println("deatil3 is : "+((Type3)obj).getDetail3());
            }
        }
    }
}

