package com.kakura.task1.main;

import com.kakura.task1.customreader.CustomReader;
import com.kakura.task1.customreader.impl.CustomReaderImpl;
import com.kakura.task1.entitiy.CustomArray;
import com.kakura.task1.exception.CustomReaderException;
import com.kakura.task1.parser.Parser;
import com.kakura.task1.parser.impl.ParserImpl;
import com.kakura.task1.service.ArrayService;
import com.kakura.task1.service.impl.ArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    private static CustomReader customReader = new CustomReaderImpl();
    private static Parser parser = new ParserImpl();
    private static ArrayService arrayService = new ArrayServiceImpl();

    public static void main(String[] args) throws CustomReaderException {

        String string = customReader.readLine("src/main/resources/data/arrays.txt");
        int[] array = parser.parseStringToIntArray(string);
        CustomArray customArray = new CustomArray(array);

        int intResult;
        double doubleResult;

        intResult = arrayService.findMin(customArray);
        logger.info("Min value is " + intResult);

        intResult = arrayService.findMinStream(customArray);
        logger.info("Stream. Min value is " + intResult);

        intResult = arrayService.findMax(customArray);
        logger.info("Max value is " + intResult);

        intResult = arrayService.findMaxStream(customArray);
        logger.info("Stream. Max value is " + intResult);

        intResult = arrayService.findSum(customArray);
        logger.info("Sum of elements is " + intResult);

        intResult = arrayService.findSumStream(customArray);
        logger.info("Stream. Sum of elements is " + intResult);

        doubleResult = arrayService.findAverage(customArray);
        logger.info("Average value is " + doubleResult);

        doubleResult = arrayService.findAverageStream(customArray);
        logger.info("Steam. Average value is " + doubleResult);

        intResult = arrayService.numberOfPositiveElements(customArray);
        logger.info("Number of positive elements is " + intResult);

        intResult = arrayService.numberOfPositiveElementsStream(customArray);
        logger.info("Stream. Number of positive elements is " + intResult);

        intResult = arrayService.numberOfNegativeElements(customArray);
        logger.info("Number of negative elements is " + intResult);

        intResult = arrayService.numberOfNegativeElementsStream(customArray);
        logger.info("Stream. Number of negative elements is " + intResult);

        /*arrayService.bubbleSort(customArray);
        logger.info("Bubble sort: " + customArray);*/

        /*arrayService.shuttleSort(customArray);
        logger.info("Shuttle sort: " + customArray);*/

        arrayService.shellSort(customArray);
        logger.info("Shell sort: " + customArray);

        arrayService.replaceNegativeWithZero(customArray);
        logger.info("All negative elements replaced with zero: " + customArray);
    }
}
