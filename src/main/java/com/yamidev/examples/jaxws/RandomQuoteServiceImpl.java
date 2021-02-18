package com.yamidev.examples.jaxws;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@WebService(endpointInterface = "com.yamidev.examples.jaxws.RandomQuoteService")
public class RandomQuoteServiceImpl implements RandomQuoteService{

    private static List<String> quoteList;

    @PostConstruct
    private void createList() {
        quoteList = new ArrayList<>();
        quoteList.add("You cannot escape the responsibility of tomorrow by evading it today");
        quoteList.add("I think therefore I am");
        quoteList.add("It was the best of times, it was the worst of times...");
        quoteList.add("Don't cry because it's over, smile because it happened");
        quoteList.add("Be yourself; everyone else is already taken");
        quoteList.add("So many books, so little time");
    }
    @Override
    public String getQuote() {
        Random random = new Random();
        int index = random.nextInt(quoteList.size());
        return quoteList.get(index);
    }
}
