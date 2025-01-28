public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        appData.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 500}
        });

        DataSaver saver = new DataSaver();
        saver.save(appData, "data.csv");

        DataLoader loader = new DataLoader();
        AppData loadedData = loader.load("data.csv");

        System.out.println(String.join(", ", loadedData.getHeader()));
        for (int[] row : loadedData.getData()) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
