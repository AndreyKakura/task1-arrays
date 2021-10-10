package com.kakura.task1.main;

import com.kakura.task1.customreader.impl.CustomReaderImpl;
import com.kakura.task1.entitiy.CustomArray;
import com.kakura.task1.exception.CustomReaderException;
import com.kakura.task1.parser.impl.ParserImpl;
import com.kakura.task1.service.iml.ArrayServiceIml;
import com.kakura.task1.validator.impl.ValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CustomReaderException {

        CustomReaderImpl customReader = new CustomReaderImpl();
        ParserImpl parser = new ParserImpl();
        ArrayServiceIml arrayService = new ArrayServiceIml();

        String string = customReader.readLine("src/main/resources/data/arrays.txt");
        int[] array = parser.parseStringToIntArray(string);
        CustomArray customArray = new CustomArray(array);

        int intResult;
        double doubleResult;
        CustomArray customArrayResult;

        intResult = arrayService.findMin(customArray);
        logger.info("Min value is " + intResult);

        intResult = arrayService.findMax(customArray);
        logger.info("Max value is " + intResult);

        customArrayResult = arrayService.replaceNegativeWithZero(customArray);
        logger.info("All negative elements replaced with zero: " + customArrayResult);

        intResult = arrayService.findSum(customArray);
        logger.info("Sum of elements is " + intResult);

        doubleResult = arrayService.findAverage(customArray);
        logger.info("Average value is " + doubleResult);

        intResult = arrayService.numberOfPositiveElements(customArray);
        logger.info("Number of positive elements is " + intResult);

        intResult = arrayService.numberOfNegativeElements(customArray);
        logger.info("Number of negative elements is " + intResult);




    }
}
