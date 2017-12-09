package com.github.rmagon.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Date : 10/12/17
 *
 * @author rachitmagon
 */
public class Application {
    List<Document> documents;

    public Application() {
        this.documents = new ArrayList<>();
    }

    public void add(Document document) {
        documents.add(document);
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
