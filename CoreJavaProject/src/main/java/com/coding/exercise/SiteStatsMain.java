package com.coding.exercise;

import java.util.LinkedList;
import java.util.Queue;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     * @param url String that represents an URL that the user has visited
     * @param numVisits An int that represents the number of times that the user has
     * visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }


    public SiteStats() {    }

    /**
     * This method returns the number of times that the user has visited the url.
     * @return An int that represents the number of times that the user has visited the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times
     * that we have visited the url
     * @paramint that represents the number
     * that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class SiteStatsMain {

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>() {
        @Override
        public boolean contains(Object o) {
            SiteStats s = (SiteStats) o;
            for (SiteStats item : this) {
                if (item.getUrl().equals(s.getUrl()))
                    return true;
            }
            return false;
        }
    };


    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        sortQueue(sites);
    }

    public static void FrontToLast(Queue<SiteStats> sites, int qsize) {
        if (qsize <= 0) {
            return;
        }

        sites.add(sites.peek());
        sites.remove();
        FrontToLast(sites, qsize - 1);
    }


    public static void pushInQueue(Queue<SiteStats> sites, SiteStats temp, int qsize) {
        if (sites.isEmpty() || qsize == 0) {
            sites.add(temp);
            return;
        } else if (temp.getNumVisits() >= sites.peek().getNumVisits()) {
            sites.add(temp);
            FrontToLast(sites, qsize);
        } else {
            sites.add(sites.peek());
            sites.remove();
            pushInQueue(sites, temp, qsize - 1);
        }
    }

    public static void sortQueue(Queue<SiteStats> q) {
        if (q.isEmpty())
            return;

        SiteStats temp = q.peek();
        q.remove();
        sortQueue(q);
        pushInQueue(q, temp, q.size());
    }

    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        SiteStats s = new SiteStats(url, 1);
        if (!sites.contains(s)) {
            sites.add(s);
        }else {
            for (SiteStats item : sites) {
                if (item.getUrl().equals(url)) {
                    item.setNumVisits(item.getNumVisits() + 1);

                }
            }
        }
    }


    public static void main(String[] args) {
        String[] visitedSites = {"www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com", "www.google.co.in"};

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);
        System.out.println(sites);
    }
}