class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);
    }
}

class ArrayProcessor {
    public int processArray(String[][] array) {
        if (array.length != 4 || !isAllRowsOfSize(array, 4)) {
            throw new MyArraySizeException("не  4x4.");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            " [" + i + "][" + j + "]:  \"" + array[i][j] + "\" не число."
                    );
                }
            }
        }
        return sum;
    }

    private boolean isAllRowsOfSize(String[][] array, int size) {
        for (String[] row : array) {
            if (row.length != size) {
                return false;
            }
        }
        return true;
    }
}
