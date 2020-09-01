package arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainInstallXml {
    public static final String PATH_TO_SOURCE_FILE = "c:\\Grisha\\JPG2\\install_xml\\";
    public static final String NAME_OF_SOURCE_FILE = "install8_003.xml";

    public static final String PARAM_NAME_ZIP_NAME_VALUE = "<param name=\"zip_name\" value=\"asset-management_9.5.1.26_04\"/";


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        split(PATH_TO_SOURCE_FILE, NAME_OF_SOURCE_FILE, map);
        String line = "<param name=\"zip_name\" value=\"metamodel-access-layer_10.0.6.0>";
        handle(line);
        handle2();
    }

    public static void split(String pathToSourceFile, String nameOfSourceFile, Map<String, String> map) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(pathToSourceFile + nameOfSourceFile));

            int delimiter_counter = 0;
            String filename = "";
            StringBuffer sb = new StringBuffer();

            String line = reader.readLine();

            while (line != null) {
                if (line.contains(PARAM_NAME_ZIP_NAME_VALUE)) {
//                    line = line.s
                }

                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void handle(String line2) {
//        String pattern = "(\"<param name=\"zip_name\" value=\")([a-zA-Z[-]]+)([0-9[\\.]]+)\"/>";
        //<param name="zip_name" value="asset-management_9.5.1.26_04"/
//        String line = "<param name=\"zip_name\" value=\"asset-management_9.5.1.26_04\"/>";
        String line = "<param name=\"zip_name\" value=(assetmanagemet)>";
        String pattern = "<param name=\"zip_name\" value=[(](.+)[t(]>";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);

        if (m.find()) {

            //_[0-9]
            //-rc[0-9]
        }

        int t = 2;
        List<Integer> leftarr = new ArrayList<Integer>();
        leftarr.add(t);
        long sum = 0;
        sum += t;
        leftarr.clear();


    }

    public static void handle2() {
//        String line = "This order was placed for";
        String line = "<param name=\"zip_name\" value=\"temp name(this is the data)";
//        Pattern pattern = Pattern.compile("([a-zA-Z]*?)(\\d+)(\\w*)");
        Pattern pattern = Pattern.compile("<param name=\"zip_name\" value=\"temp\\s+([A-Za-z]+)\\s*[(]\\s*(.*)[)]\\s*");

        Matcher m = pattern.matcher(line);
        if(m.matches()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
        if (m.find()) {
        //
        }
    }
}
