package com.emexo.coding;

import java.util.Arrays;

public class ChunkTheStringAndReverse {

    public static void main(String[] args) {

        String input = "1,2,3,4,5;3";

        String response = chunkAndReverse(input);

        System.out.println(response);
    }

    public static String chunkAndReverse(String input) {

        String response = null;

        String[] inputArray = input.split(";");

        int index = Integer.parseInt(inputArray[1]);

        String array = inputArray[0];

        String[] stringArray = array.split(",");
        int noOfChunk = (int) Math.ceil((double) stringArray.length / index);

        int start = 0;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < noOfChunk; i++) {
            int end = Math.min(start + index, stringArray.length);

            String[] outputArray = Arrays.copyOfRange(stringArray, start, end);

            if (outputArray.length == index) {
                for (int j = outputArray.length - 1; j >= 0; j--) {
                    builder.append(outputArray[j]);
                    builder.append(",");
                }
            } else {
                for (int k = 0; k < outputArray.length; k++) {
                    builder.append(outputArray[k]);
                    builder.append(",");
                }
            }

            start += index;

        }

        if (builder.toString().endsWith(",")) {
            response = builder.toString().substring(0, builder.toString().length() - 1);
        }

        return response;
    }

}
