package edu.item.stream.item50;

import java.util.function.Supplier;

class Evaluation {
    public static boolean evaluate(final int value) {
        System.out.println("evaluating ..." + value);
        return value > 100;
    }
    public static void eagerEvaluator(final boolean input1, final boolean input2) {
        System.out.println("eagerEvaluator called...");
        System.out.println("accept?: " + (input1 && input2)); }

    public static void lazyEvaluator(final Supplier<Boolean> input1, final Supplier<Boolean> input2) {
        System.out.println("lazyEvaluator called...");
        System.out.println("accept?: " + (input1.get() && input2.get())); }


}

public class LazyEvaluation2 {
    public static void main(String[] args) {

        Evaluation.eagerEvaluator(Evaluation.evaluate(1), Evaluation.evaluate(2));
        Evaluation.lazyEvaluator(()->Evaluation.evaluate(1), ()->Evaluation.evaluate(2));
    }

}
