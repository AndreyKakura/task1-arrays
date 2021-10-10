package com.kakura.task1.customreader.impl;

import com.kakura.task1.customreader.CustomReader;
import com.kakura.task1.exception.CustomReaderException;
import com.kakura.task1.validator.impl.ValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;


public class CustomReaderImpl implements CustomReader {

    static Logger logger = LogManager.getLogger();

    @Override
    public String readLine(String path) throws CustomReaderException {

        ValidatorImpl validator = ValidatorImpl.getInstance();


        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String string = reader.readLine();

            while(!validator.validateString(string)) {
                string = reader.readLine();
            }

            return string;

        } catch (FileNotFoundException e) {
            logger.error("File not found");
            throw new CustomReaderException("File Not found ", e);
        } catch (IOException e) {
            logger.error(e);
            throw new CustomReaderException(e);
        }
    }
}
