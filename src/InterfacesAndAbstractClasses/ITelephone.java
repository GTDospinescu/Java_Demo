package InterfacesAndAbstractClasses;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
//    access modifier sunt inutile aici
//    trebuie implementate toate metodele in clasa care implementeaza interfata
}
