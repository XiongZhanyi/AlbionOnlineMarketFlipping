package com.albiononline.marketflipping.deserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class UtcInstantDeserializer extends JsonDeserializer<Instant> {
    @Override
    public Instant deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException {

        String value = p.getText();

        if (value == null || value.isBlank()) {
            return null;
        }

        return LocalDateTime.parse(value)
                .toInstant(ZoneOffset.UTC);
    }
}
