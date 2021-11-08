package com.hope.classes;

import com.hope.WebScraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Webcrawler will goto a webpage and then scrapes data from the page and stores somewhere.
 *
 */
public class WebCrawler {
    private List<String> links = new ArrayList<>();

    public WebCrawler(List<String> links){
        this.links = links;
    }

    public void crawl() throws IOException, InterruptedException {
        ExecutorService executorServicevice = Executors.newFixedThreadPool(50);
        for(int i = 0 ; i< links.size() ; i++){

         WebScraper scraper  = new WebScraper(links.get(i), String.valueOf(i));
         scraper.start();
        }

//        executorService.shutdownAndAwaitTerminationown();
    }

    public static void main(String[] args){

        List<String> links = new ArrayList<>();
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/articles/hausabai-patil-her-heroism-passes-into-history/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");
        links.add("https://ruralindiaonline.org/en/pages/acknowledgements/");

        WebCrawler crawler = new WebCrawler(links);

        try {
            crawler.crawl();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }




}
