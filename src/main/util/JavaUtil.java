package main.util;
/**
 * Created by byang on 2016-08-28.
 */

import com.jayway.jsonpath.EvaluationListener;
import com.jayway.jsonpath.ReadContext;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class JavaUtil {
    public static ArrayList<String> ArrayListStrDescendingSort(ArrayList<String> arrayList) {
        System.out.println("ArrayList Before Sorting:");
        for (String str : arrayList) {
            System.out.println(str);
        }
        /* Sorting in decreasing (descending) order*/
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList in descending order:");
        for (String str : arrayList) {
            System.out.println(str);
        }
        return arrayList;
    }

    public static ArrayList ArrayListAscendingSort(ArrayList arrayList) {//Arraylist is general,it can be either integer or string
        Iterator iterator1 = arrayList.iterator();
        System.out.println("Collection elements before sorting: \n");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        //Call the Collections sort method for sorting
        Collections.sort(arrayList);
        Iterator iterator2 = arrayList.iterator();
        System.out.println("Collection elements after sorting:\n");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        return arrayList;
    }

    public static String getFiledByJpath(String data, String Jpath) {
        JsonPath jsonPath = new JsonPath(data);
        String filed = jsonPath.getString(Jpath);
        System.out.println("the field is: " + filed);
        return filed;
    }

    public static List<String> getJsonPathsByFieldName(String filepath,String[] stringArray) throws IOException {
        File jsonFile = new File(filepath).getAbsoluteFile();
        List<String> paths = new ArrayList<>();
        ReadContext findPathsContext = com.jayway.jsonpath.JsonPath.parse(jsonFile).withListeners((found) -> {
            paths.add(found.path());
            return EvaluationListener.EvaluationContinuation.CONTINUE;
        });
        List<String> properties = Arrays.asList(stringArray);
        properties.forEach(p -> findPathsContext.read("$.." + p));
        return paths;
    }

    public static List<String> getJsonPathsFrmJsonByFieldKey(String jsonStr,String[] stringArray) throws IOException {
               List<String> paths = new ArrayList<>();
        ReadContext findPathsContext = com.jayway.jsonpath.JsonPath.parse(jsonStr).withListeners((found) -> {
            paths.add(found.path());
            return EvaluationListener.EvaluationContinuation.CONTINUE;
        });
        List<String> properties = Arrays.asList(stringArray);
        properties.forEach(p -> findPathsContext.read("$.." + p));
        return paths;
    }


}
