/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author asus
 */
public class IteratorOfIterators implements Iterator<String> {

    List<Iterator<String>> allIterators;
    int current = 0;
    Iterator<String> currentIterator;

    public IteratorOfIterators(List<Iterator<String>> allIterators) {
        this.allIterators = allIterators;
        currentIterator = allIterators.get(current);
    }

    @Override
    public boolean hasNext() {
        if (currentIterator.hasNext()) {
            return true;
        }
        while ((current < allIterators.size() - 1) && (!currentIterator.hasNext())) {
            current++;
            currentIterator = allIterators.get(current);
        }
        if (current != allIterators.size() - 1) {
            return true;
        } else {
            return currentIterator.hasNext();
        }
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return currentIterator.next();
    }

    @Override
    public void remove() {
    }

    public static void main(String[] arg) {

        List<String> foo = new ArrayList<>();
        foo.add("yasemin");
        foo.add("busra");
        List<String> bar = new ArrayList<>();

        List<String> baz = new ArrayList<>();
        baz.add("ahmet");
        baz.add("mehmet");

        List<Iterator<String>> iterators = new ArrayList<>();

        iterators.add(foo.iterator());
        iterators.add(bar.iterator());
        iterators.add(baz.iterator());

        IteratorOfIterators megaIterator = new IteratorOfIterators(iterators); // <-- bunu yukarida tanimlamistim.

        while (megaIterator.hasNext()) {
            System.out.println(megaIterator.next());
        }
    }
}
