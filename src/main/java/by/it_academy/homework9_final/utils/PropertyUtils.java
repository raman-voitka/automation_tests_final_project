package by.it_academy.homework9_final.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static by.it_academy.homework9_final.utils.LoggerUtils.LOG_PROPERTY_UTILS;

public final class PropertyUtils {

    private PropertyUtils() {
    }

    private static Properties property = new Properties();
    private static final String PROPERTY_PATH = "src/main/resources/project.properties";

    private static void getFile() {
        try (FileInputStream file = new FileInputStream(PROPERTY_PATH)) {
            property.load(file);
        } catch (IOException e) {
            LOG_PROPERTY_UTILS.error("file 'project.properties' not found");
        }
    }

    public static String getEndpointSushiveslaProducts() {
        getFile();
        return property.getProperty("endpoint.sushivesla.products");
    }

    public static String getEndpointSushiVeslaProductsByFilter() {
        getFile();
        return property.getProperty("endpoint.sushivesla.filter");
    }

    public static String getOnlinerHomePageURL() {
        getFile();
        return property.getProperty("onliner.homepage.url");
    }

    public static String getOnlinerCatalogLinks() {
        getFile();
        return property.getProperty("onliner.catalog.link.list");
    }

    public static String getOnlinerComputersAndNetsLinks() {
        getFile();
        return property.getProperty("onliner.computers_and_nets.link.list");
    }
}