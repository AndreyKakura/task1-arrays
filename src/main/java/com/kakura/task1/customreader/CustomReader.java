package com.kakura.task1.customreader;

import com.kakura.task1.exception.CustomReaderException;

public interface CustomReader {

    String readLine(String path) throws CustomReaderException;

}
