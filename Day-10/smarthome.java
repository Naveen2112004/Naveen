interface SmartHomeSensor {
    double readValue();
    String getSensorType();
}
interface CloudStorageProvider {
    void uploadFiles(String filename, int size);
}
interface NotificationSystem {
    void sendNotification(String recipient, String message);
} {
    
}
