package com.architecture.sprint8.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ReportServiceImpl implements ReportService {
    @Override
    public String createReport() {
        final List<String> variants = initVariants();
        Random random = new Random();
        return variants.get(random.nextInt(variants.size()));
    }

    private List<String> initVariants() {
        return List.of(
                "Lorem",
                "ipsum",
                "dolor",
                "sit",
                "amet",
                "consectetur",
                "adipiscing",
                "elit",
                "sed",
                "do",
                "eiusmod",
                "tempor",
                "incididunt",
                "ut",
                "labore",
                "et",
                "dolore",
                "magna",
                "aliqua");
    }
}
