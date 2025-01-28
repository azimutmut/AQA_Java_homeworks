import java.io.*;
class DataSaver {
    public void save(AppData appData, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            String[] header = appData.getHeader();
            writer.println(String.join(";", header));

            int[][] data = appData.getData();
            for (int[] row : data) {
                StringBuilder rowString = new StringBuilder();
                for (int value : row) {
                    rowString.append(value).append(";");
                }
                writer.println(rowString.substring(0, rowString.length() - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
