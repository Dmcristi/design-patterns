package singleton.database;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

interface Database{
    int getAge(String name);
}


public class SingletonDB implements Database{

    private Dictionary<String, Integer> persons = new Hashtable<>();

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    private SingletonDB() {
        instanceCount++;
        System.out.println("Initializing database");

        try {

            File f = new File("C:\\Users\\Dmc\\Documents\\JavaPractica\\designpatterns\\res");

            Path fullPath = Paths.get(f.getPath(), "persons.txt");
            List<String> lines = Files.readAllLines(fullPath);

            for (int i = 0; i < lines.size(); i += 2) {
                persons.put(lines.get(i), Integer.parseInt(lines.get(i + 1)));
            }

//            Enumeration<String> keys = persons.keys();
//
//            while(keys.hasMoreElements()){
//                String key = keys.nextElement();
//                System.out.println("Name = " + key
//                        + ", age = " + names.get(key));
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final SingletonDB INSTANCE = new SingletonDB();

    public static SingletonDB getInstance() {
        return INSTANCE;
    }
    public int getAge(String name){
        return persons.get(name);
    }
}

class SingletonRecordFinder{
    public int getSumOfAges(List<String> names){
        int result = 0;
        for (String name : names) {
            result += SingletonDB.getInstance().getAge(name);
        }
        System.out.println(SingletonDB.getInstanceCount());//
        return result;
    }
}

class ConfigurableRecordFinder{
    private Database database;

    public ConfigurableRecordFinder(Database database) {
        this.database = database;
    }

    public int getSumOfAges(List<String> names){
        int result = 0;
        for (String name : names) {
            result += database.getAge(name);
        }
        return result;
    }
}

class DummyDatabase implements Database{

    private Dictionary<String, Integer> data = new Hashtable<>();

    public DummyDatabase() {
        data.put("alpha", 1);
        data.put("beta", 2);
        data.put("gamma", 3);

    }

    @Override
    public int getAge(String name) {
        return data.get(name);
    }
}

class Tests{

    @Test //not a unit test! it is a integration test
    public void singletonSumOfAgesTest(){
        SingletonRecordFinder rf = new SingletonRecordFinder();
        List<String> names = new ArrayList<>(Arrays.asList("Cristi", "Mihai"));
        int tp = rf.getSumOfAges(names);
        Assertions.assertEquals(59, tp);
    }

    @Test
    public void dependentAgesTest(){
        DummyDatabase db = new DummyDatabase();
        ConfigurableRecordFinder rf = new ConfigurableRecordFinder(db);
        Assertions.assertEquals(4, rf.getSumOfAges(
                new ArrayList<>(Arrays.asList("alpha", "gamma"))));
    }
}

