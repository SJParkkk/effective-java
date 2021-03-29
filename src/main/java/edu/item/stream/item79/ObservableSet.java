package edu.item.stream.item79;

import java.util.*;

public class ObservableSet<E> extends ForwardingSet<E>{
    public ObservableSet(Set<E> set) {
        super(set);
    }

    private final List<SetObserver<E>> observers = new ArrayList<>();

    public void addObserver(SetObserver<E> observer){
        synchronized (observers){
            observers.add(observer);
        }
    }

    private void notifyElementAdded(E element){
        synchronized (observers){
            for(SetObserver observer: observers){
                observer.added(this,element);
            }
        }
    }

    public boolean removeObserver(SetObserver<E> observer){
        synchronized (observers){
            return observers.remove(observer);
        }
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if(added)notifyElementAdded(element);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for(E element : c)
            result |= add(element);
            return result;
    }

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

//        set.addObserver(((set1, element) -> System.out.println(element)));
//
//        for (int i = 0; i < 100; i++) {
//            set.add(i);
//        }

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
                if (element == 23)
                    set.removeObserver(this);
            }
        });
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }

}
