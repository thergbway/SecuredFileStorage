package client.model;

import javafx.beans.property.SimpleStringProperty;
import nirs.api.Cipher;

import java.time.Instant;

public class TableFile {

    public final SimpleStringProperty fileName;
    public final SimpleStringProperty created;
    public final SimpleStringProperty size;
    public final SimpleStringProperty cipher;
    public final SimpleStringProperty status;

    public TableFile(String fileName, Instant createdInstant, Long size, Cipher cipher) {
        this.fileName = new SimpleStringProperty(fileName);
        this.created = new SimpleStringProperty(createdInstant.toString());
        this.size = new SimpleStringProperty(convertToHumanReadable(size));
        this.cipher = new SimpleStringProperty(cipher.toString());
        this.status = new SimpleStringProperty();
    }


    private String convertToHumanReadable(Long size) {
        return String.format("%1.3f", size.doubleValue() / 1024.0 / 1024.0);
    }
}