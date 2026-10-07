package src.config;

public class ApplicationConfig {
    private static ApplicationConfig instance;
    private String databaseUrl;
    private String applicationName;

    private ApplicationConfig() { }                    

    public static synchronized ApplicationConfig getInstance() {  
        if (instance == null) {
            instance = new ApplicationConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() { return databaseUrl; }
    public void setDatabaseUrl(String databaseUrl) { this.databaseUrl = databaseUrl; }
    public String getApplicationName() { return applicationName; }
    public void setApplicationName(String applicationName) { this.applicationName = applicationName; }
}