/** Реализация ничегонеделанья.
 * Данная реализация применяется всеми работниками по умолчанию */
public class DoNothing implements Workable {
    public void work() {
        System.out.println("I'm doing nothing");
    }
}
