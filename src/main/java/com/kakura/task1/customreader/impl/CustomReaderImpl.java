package com.kakura.task1.customreader.impl;

import com.kakura.task1.customreader.CustomReader;
import com.kakura.task1.exception.CustomReaderException;
import com.kakura.task1.validator.Validator;
import com.kakura.task1.validator.impl.ValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CustomReaderImpl implements CustomReader {

    private static final Logger logger = LogManager.getLogger();
    private static Validator validator = ValidatorImpl.getInstance();

    @Override
    public String readLine(String path) throws CustomReaderException {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String string = reader.readLine();

            while (string != null && !validator.validateString(string)) {
                string = reader.readLine();
            }

            if(string == null){
                logger.error("Correct string was not found");
                throw new CustomReaderException("Correct string was not found");
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
