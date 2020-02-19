package qa2.javaguru.Utils;

import com.google.gson.Gson;
import qa2.javaguru.Utils.InternalClasses.CustomDate;

import java.io.File;
import java.io.FilenameFilter;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Utils {

    public static String getSpecificDate(String date) {
        if (date.startsWith("###")) {
            String passedDate = date.replace("###", "");
            Gson gson = new Gson();
            CustomDate customDate = gson.fromJson(passedDate, CustomDate.class);
            LocalDateTime now = LocalDateTime.now().plusMonths(customDate.month).plusDays(customDate.day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(customDate.pattern).withLocale(Locale.ENGLISH);
            return now.format(formatter);
        }
        return date;
    }

    public static String convertAmount(String amount) {
        String result = String.format(Locale.UK, "%,.2f", Double.valueOf(amount)).replaceAll(",", " ");
        return result;

    }

    public File renameFile(String pathToFile, String oldName, String newName) {
        File file = new File(pathToFile + oldName);
        file.renameTo(new File(pathToFile + newName));
        return file;
    }

    public String generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(10000);
        String result = String.format("%05d", num);
        return result;
    }

    public File getFileFromDirectoryByIndex(String directory, int index, String fileNameContains) {
        File dir = new File(directory);
        File[] matches = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(fileNameContains);
            }

        });
        return matches[index];
    }
}
