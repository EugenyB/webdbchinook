package com.example.webdbchinook.entities;

import org.springframework.beans.factory.annotation.Value;

/**
 * Projection for {@link Employee}
 */
public interface SimpleEmployee {
    Integer getId();

    String getTitle();

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();
}