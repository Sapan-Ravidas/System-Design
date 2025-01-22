package services;

import cache.CacheManager;

public class SearchService {
    private String GENRE = "GENRE";
    private String RATING = "RATING";
    // SEARCH 1 GENRE "Action"
    public void search(String[] args) {
        try {
            Long userId = Long.parseLong(args[0]);
            String key = args[1];
            String value = getName(2, args);
            if (!CacheManager.getInstance().search(userId, value)) {
                System.out.println("Data not found in Cache");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Invalid Command");
        }
    }

    // SEARCH_MULTI 1 "Action" 2020 8.0
    public void searchMulti(String[] args) {
        try {
            Long userId = Long.parseLong(args[0]);
            String genre = args[1];
            String year = args[2];
            double rating = Double.parseDouble(args[3]);
            if (!CacheManager.getInstance().searchMulti(0, genre, year, rating)) {
                System.out.println("Data not found in cache");
            }
        } catch (Exception e) {
            
        }
    }

    public void clearCache(String args) {
        if (args.equalsIgnoreCase("l1")) {

        } else if (args.equalsIgnoreCase("l2")){

        } else {
            System.out.println("invalid commmand");
        }
    }

    private String getName(int index, String[] args) {
        String string = "";
        for (; index < args.length; ++ index) {
            string += (args[index] + " ");
            if (args[index].endsWith("\"")) {
                break;
            }
        }
        string = string.trim();
        string = string.substring(1, string.length() - 1);
        return string;
    }
}
