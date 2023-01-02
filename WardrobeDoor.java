package HW3;

public class WardrobeDoor extends Door {

    //создаем две двери шкафа, которые по умолчанию закрыты
    public WardrobeDoor(String name) {
        setState(State.CLOSED);
        setName(name);
    }
}
