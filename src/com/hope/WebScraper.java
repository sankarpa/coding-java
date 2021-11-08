package com.hope;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

public class WebScraper extends Thread{

    private String link;
    private String fileName;

    public WebScraper(String link, String fileName ){
        this.link = link;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Starting..."+start.toString());
        URI uri = URI.create(this.link);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri).build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String responseBody = response.body().toString();

        File file = new File(this.fileName+".html");

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter(file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("completed..."+endTime.toString());
    }
}
