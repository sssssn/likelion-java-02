package com.likelion.project03;

import java.time.LocalDateTime;
public class CrawlDate {
    private LocalDateTime lastCrawlDateTime;
    // alt + insert

    public CrawlDate(LocalDateTime lastCrawlDateTime) {
        this.lastCrawlDateTime = lastCrawlDateTime;
    }
}