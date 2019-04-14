/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package lambda.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
*
 * @author ying.wu 梵境
 * @version $Id: FileReaderExample, v0.1 2019年04月14日 21:30 ying.wu Exp $
 */
public class FileReaderExample {
    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(("test.txt")))) {
            return p.process(br);
        }
    }

    public static void main(String[] args) {
        try {
            String oneLine = FileReaderExample.processFile(br -> br.readLine());
            String twoLines = FileReaderExample.processFile(br -> br.readLine() + br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}