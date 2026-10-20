import java.lang.ref.WeakReference;

class SampleObject {
    SampleObject() {
        System.out.println("Object is constructed.");
    }

    void useObject() {
        System.out.println("Object is being used.");
    }
}

public class Practical7 {
    public static void main(String[] args) {
        SampleObject object = new SampleObject();
        WeakReference<SampleObject> reference = new WeakReference<>(object);

        object.useObject();

        object = null; // Remove the strong reference
        System.out.println("Garbage collection was requested.");
        System.gc();

        if (reference.get() == null) {
            System.out.println("The object has been collected.");
        } else {
            System.out.println("The object has not been collected yet.");
        }
    }
}
