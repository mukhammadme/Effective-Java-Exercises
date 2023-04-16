package chapter2.item1;

import java.io.BufferedReader;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.Collections;

public class Examples {
    public static void main(String[] args) {
        // Static Factory methods examples
//        Date d = Date.from();
//        Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        System.out.println(prime);
//        Object newArray = Array.newInstance(classObject, arrayLen);
//        FileStore fs = Files.getFileStore(path);
//        BufferedReader br = Files.newBufferedReader(path);
//        List<Complaint> litany = Collections.list(legacyLitany);

    }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
