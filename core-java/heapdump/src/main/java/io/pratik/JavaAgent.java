/**
 * 
 */
package io.pratik;

import java.lang.instrument.Instrumentation;

/**
 * @author Pratik Das
 *
 */
public class JavaAgent {
    private static volatile Instrumentation instrumentation;
    public static void premain(final String agentArgs, final Instrumentation instrumentation) {
        JavaAgent.instrumentation = instrumentation;
    }
    public static long getObjectSize(final Object object) {
        if (instrumentation == null) {
            return -1L;
        }
        return instrumentation.getObjectSize(object);
    }

    public ClassicsLibrary() {
        books = new TreeMap<>();
        Book nineteenEightyFour = new Book("Nineteen Eighty-Four", "George Orwell",
                "It was a bright cold day in April, and the clocks were striking thirteen.");
        Book theLordOfTheRings = new Book("The Lord of the Rings", "J. R. R. Tolkien",
                "When Mr. Bilbo Baggins of Bag End announced that he would shortly be celebrating his " +
                        "eleventy-first birthday with a party of special magnificence, there was much talk and excitement in Hobbiton.");
        Book cleanCode = new Book("Clean Code", "Robert C. Martin",
                "ClassicsEven bad code can function. But if code isn’t clean, it can bring a development organization to its knees");

        books.put("Nineteen Eighty-Four", nineteenEightyFour);
        books.put("The Lord of the Rings", theLordOfTheRings);
        books.put("Clean Code", cleanCode);
    }
}
