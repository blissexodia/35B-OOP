package Week7;
public class ConstructorRevise{
    public static void main(String[] args) {
        NonParameterizedConstructor np = new NonParameterizedConstructor();
        System.out.println(np.data2);
        ParameterizedConstructor pc = new ParameterizedConstructor(10, "Ram2");
        System.out.println(pc.data2);
        pc.data2 = "Changing";
        // pc.data1 = 100;
    }
}

class ParameterizedConstructor{
    private int data1; //this.data1
    String data2;
    // write only access to private property
    void setData1(int data1){
        this.data1 = data1;
    }
    // read only access to private property
    int getData1() {
        return data1;
    }

    ParameterizedConstructor(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }


    
}

class NonParameterizedConstructor{
    private int data1;
    String data2;
    NonParameterizedConstructor(){
        data1 = 10;
        data2 = "Ram";
        System.out.println("Running in object creation");
    }
}