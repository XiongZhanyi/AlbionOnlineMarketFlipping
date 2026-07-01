package com.albiononline.marketflipping.model;

import java.time.Instant;

import com.albiononline.marketflipping.deserializer.UtcInstantDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;

import java.time.Instant;

@Getter
public class MarketData {

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty("city")
    private City city;
    
    @JsonProperty("quality")
    private Quality quality;

    @JsonProperty("sell_price_min")
    private int sellPriceMin;

    @JsonProperty("sell_price_min_date")
    @JsonDeserialize(using = UtcInstantDeserializer.class)
    private Instant sellPriceMinDate;

    @JsonProperty("sell_price_max")
    private int sellPriceMax;

    @JsonProperty("sell_price_max_date")
    @JsonDeserialize(using = UtcInstantDeserializer.class)
    private Instant sellPriceMaxDate;

    @JsonProperty("buy_price_min")
    private int buyPriceMin;

    @JsonProperty("buy_price_min_date")
    @JsonDeserialize(using = UtcInstantDeserializer.class)
    private Instant buyPriceMinDate;

    @JsonProperty("buy_price_max")
    private int buyPriceMax;

    @JsonProperty("buy_price_max_date")
    @JsonDeserialize(using = UtcInstantDeserializer.class)
    private Instant buyPriceMaxDate;
}
