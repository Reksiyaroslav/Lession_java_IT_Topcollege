//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how GIGA IDE suggests fixing it.
        String name = "Yar";
        Person person = new Person();
        person.setName(name);
        System.out.println(person.getName());
    }
}