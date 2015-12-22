/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictivetext;

/**
 *
 * @author Ozymandy
 */
public class WordModel implements Comparable {

    private String word;
    private Integer priority;

    public WordModel(String word, int priority) {
        this.word = word;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getWord() {
        return word;
    }

    @Override
    public int compareTo(Object o) { // cr похоже, что этот метод тоже нигде не использован в проекте.
        // cr А зря. Если бы ты его использовал, то тебе не нужен был бы дополнительный компаратор.
        return priority.compareTo((Integer) o);
    }
}
