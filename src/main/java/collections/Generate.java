package collections;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Generate {
    static String mapTemplate = "    public static <K,V> Map<K,V> Map(ARGUMENTS) {\n" +
                                "        Map<K, V> acc = Maps.newLinkedHashMap();\n" +
                                "\n" +
                                "SETTERS" +
                                "\n" +
                                "        return acc;\n" +
                                "    }";

    static String putTemplate = "        acc.put(KEY, VALUE);\n";
    static String kvTemplate = "K KEY, V VALUE";

    static String mapArgument(int i) {
        return kvTemplate.replace("KEY", "k" + i).replace("VALUE", "v" + i);
    }

    static String mapSetter(int i) {
        return putTemplate.replace("KEY", "k" + i).replace("VALUE", "v" + i);
    }

    static String mapConstructor(int n) {
        String arguments = IntStream.range(0, n)
                                    .mapToObj(Generate::mapArgument)
                                    .collect(Collectors.joining(", "));
        String setters = IntStream.range(0, n)
                                  .mapToObj(Generate::mapSetter)
                                  .collect(Collectors.joining());

        return mapTemplate.replace("ARGUMENTS", arguments).replace("SETTERS", setters);
    }

    static void printMap() {
        String maps = IntStream.range(0, 11)
                               .mapToObj(Generate::mapConstructor)
                               .collect(Collectors.joining("\n\n"));

        System.out.println("    //<editor-fold desc=\"Map\">");
        System.out.println(maps);
        System.out.println("    //</editor-fold>");
    }

    public static void main(String[] args) {
        printMap();
    }
}
