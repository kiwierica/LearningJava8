/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package lambda.FileReader;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author ying.wu 梵境
 * @version $Id: BufferedReaderProcessor, v0.1 2019年04月14日 21:35 ying.wu Exp $
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader br) throws IOException;
}
