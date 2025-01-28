import java.io.*;
import java.util.ArrayList;
import java.util.List;

class DataLoader {
    public AppData load(String fileName) {
        AppData appData = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String headerLine = reader.readLine();
            if (headerLine != null) {
                appData.setHeader(headerLine.split(";"));
            }

            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringValues = line.split(";");
                int[] intValues = new int[stringValues.length];
                for (int i = 0; i < stringValues.length; i++) {
                    intValues[i] = Integer.parseInt(stringValues[i]);
                }
                dataList.add(intValues);
            }

            appData.setData(dataList.toArray(new int[0][]));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appData;
    }
}
